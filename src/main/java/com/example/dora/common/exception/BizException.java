package com.example.dora.common.exception;

import com.example.dora.common.constants.ResultCodeEnum;

/**
 * @author jzl
 * @create 2019-07-06
 **/
public class BizException extends RuntimeException {

    protected Integer code;

    public BizException() {
        super();
    }

    public BizException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public BizException(String msg, Throwable throwable, Integer code) {
        super(msg, throwable);
        this.code = code;
    }

    public BizException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMsg(), null);
        this.code = resultCodeEnum.getCode();
    }

    public BizException(Integer code, String msg) {
        super(msg, null);
        this.code = code;
    }

    public Integer code() {
        return code;
    }
}
