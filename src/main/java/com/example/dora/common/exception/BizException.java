package com.example.dora.common.exception;

import com.example.dora.common.constants.ResultCodeEnum;

/**
 * @author jzl
 * @create 2019-07-06
 **/
public class BizException extends RuntimeException {

    public BizException() {
        super();
    }

    public BizException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public BizException(String msg, Throwable throwable, Integer code) {
        super(msg, throwable);
    }

    public BizException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMsg(), null);
    }

    public BizException(Integer code, String msg) {
        super(msg, null);
    }
}
