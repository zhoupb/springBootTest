package com.example.dora.common.recommit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 目前只能作用于订单接口或用户接口上
 * 接口的第一个参数必须为订单ID或用户ID
 * 默认记录订单,记录用户optType需设置为1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MethodLog {

    /**
     * 参数记录类型 0 ALL 1 入参 2 出参
     * @return
     */
    int argType() default 0;

    /**
     * 接口记录类型 1 用户接口 2 订单接口
     * @return
     */
    int optType() default 2;

}
