package com.zyl.award.interceptor;

import com.zyl.award.annotations.ResponseResult;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;


/**
 * @desc 接口响应体控制拦截器
 * 
 * @author shj
 */
public class ResponseResultInterceptor implements HandlerInterceptor {

	public static final String RESPONSE_RESULT = "RESPONSE-RESULT";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler instanceof HandlerMethod) {
			final HandlerMethod handlerMethod = (HandlerMethod) handler;
			final Class<?> clazz = handlerMethod.getBeanType();
			final Method method = handlerMethod.getMethod();
			if (clazz.isAnnotationPresent(ResponseResult.class)) {
				request.setAttribute(RESPONSE_RESULT, clazz.getAnnotation(ResponseResult.class));
			} else if (method.isAnnotationPresent(ResponseResult.class)) {
				request.setAttribute(RESPONSE_RESULT, method.getAnnotation(ResponseResult.class));
			}
		}

		return true;
	}

}
