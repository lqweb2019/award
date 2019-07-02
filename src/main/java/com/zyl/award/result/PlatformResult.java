package com.zyl.award.result;

import com.zyl.award.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shj
 * @desc 平台通用返回结果
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatformResult<T> implements Result {

    private static final long serialVersionUID = 874200365941306385L;

    private Integer code;

    private String msg;

    private T data;

    public PlatformResult(T data) {
        PlatformResult<T> result = new PlatformResult<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
    }

    public static PlatformResult success() {
        PlatformResult result = new PlatformResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static  <T> PlatformResult<T> success(T data) {
        PlatformResult<T> result = new PlatformResult<>();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static PlatformResult failure(ResultCode resultCode) {
        PlatformResult result = new PlatformResult();
        result.setResultCode(resultCode);
        return result;
    }

    public static <T> PlatformResult failure(ResultCode resultCode, T data) {
        PlatformResult<T> result = new PlatformResult<>();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

    public static PlatformResult failure(String message) {
        PlatformResult result = new PlatformResult();
        result.setCode(ResultCode.PARAM_IS_INVALID.code());
        result.setMsg(message);
        return result;
    }

    private void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }

}
