package com.zyl.award.handler;

import com.zyl.award.annotations.ResponseResult;
import com.zyl.award.interceptor.ResponseResultInterceptor;
import com.zyl.award.result.DefaultErrorResult;
import com.zyl.award.result.PlatformResult;
import com.zyl.award.result.Result;
import com.zyl.award.utils.RequestContextUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @desc 接口响应体处理器
 */
@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		ResponseResult responseResultAnn = (ResponseResult) RequestContextUtil.getRequest().getAttribute(ResponseResultInterceptor.RESPONSE_RESULT);
		return responseResultAnn != null;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		ResponseResult responseResultAnn = (ResponseResult) RequestContextUtil.getRequest().getAttribute(ResponseResultInterceptor.RESPONSE_RESULT);

		Class<? extends Result> resultClazz = responseResultAnn.value();
		/**
		 * a.isAssignableFrom(b)
		 * a是b的父类或接口
		 * a和b为同一个类或同一个接口
		 */
		if (resultClazz.isAssignableFrom(PlatformResult.class)) {
			if (body instanceof DefaultErrorResult) {
				DefaultErrorResult defaultErrorResult = (DefaultErrorResult) body;
//				return PlatformResult.builder()
//						.code(defaultErrorResult.getCode())
//						.msg(defaultErrorResult.getMessage())
//						.data(defaultErrorResult.getErrors())
//						.build();
				return defaultErrorResult;
			}

			return PlatformResult.success(body);
		}

		return body;
	}

}
