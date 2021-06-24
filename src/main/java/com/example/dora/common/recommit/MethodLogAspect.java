package com.example.dora.common.recommit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.dora.common.Result;
import com.example.dora.common.domain.SyjOptLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Slf4j
@Order(2)
public class MethodLogAspect {


    @Pointcut("@annotation(com.example.dora.common.recommit.MethodLog)")
    public void logPointcut() {
    }

    @AfterReturning(value = "logPointcut()", returning = "result")
    public void doAfter(JoinPoint jp, Object result) {
        try {
            MethodSignature signature = (MethodSignature) jp.getSignature();
            Method m = signature.getMethod();
            MethodLog ml = m.getAnnotation(MethodLog.class);
            if (ml == null) {
                return;
            }
            Object[] args = jp.getArgs();
            Object[] in = null;
            Object out = null;
            if (ml.argType() == 0 || ml.argType() == 1) {
                in = args;
            }
            if (ml.argType() == 0 || ml.argType() == 2) {
                out = result;
            }
            String method = m.getDeclaringClass().getSimpleName() + "." + m.getName();
            log.info(args[0].toString(), ml.optType(), method, in, out);
            SyjOptLog logNew = new SyjOptLog();
            logNew.setOptId(args[0].toString());
            logNew.setOptType(ml.optType());
            logNew.setMethod(method);
            logNew.setParams(in);
            logNew.setResult(out);
            int resCode = 0;
            if (result instanceof Result) {
                Result res = (Result) result;
                resCode = res.getCode();
            }
            logNew.setResCode(resCode);
            JSONObject msg = (JSONObject) JSON.toJSON(logNew);
            if (ml.optType() == 2) {
                Long orderId = Long.valueOf(logNew.getOptId());
                log.info("methodlog", orderId, null, msg);
            } else {
                log.info("methodlog", msg);
            }
        } catch (Exception e) {
            log.error("MethodLogAspect.doAfter error", e);
        }
    }

}

