package com.example.dora.common.recommit;

import com.alibaba.fastjson.JSON;
import com.example.dora.common.Result;
import com.example.dora.common.utils.SpringUtils;
import com.example.dora.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
@Order(1)
public class RecommitAspect {

    @Resource
    RedisUtil redisUtil;

    @Resource
    MethodLogAspect methodLogAspect;

    @Pointcut("@annotation(com.example.dora.common.recommit.Recommit)")
    public void recommitPointcut() {
    }

    @Around("recommitPointcut()")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
        boolean recommited = false;
        Object result;
        try {
            MethodSignature signature = (MethodSignature) jp.getSignature();
            Method m = signature.getMethod();
            Recommit rr = m.getAnnotation(Recommit.class);
            String ps = rr.ps();
            Object[] args = jp.getArgs();
            StringBuilder sb = new StringBuilder();
            if (args == null || args.length == 0) {
                sb.append("NOARGS");
            } else if (StringUtils.isBlank(ps)) {
                Arrays.stream(args).forEach(a -> sb.append(JSON.toJSONString(a)).append("-"));
            } else {
                String[] ns = ps.split(",");
                if (ns.length > args.length) {
                    throw new Exception("ps param count invalid!");
                }
                for (String p : ns) {
                    if (!NumberUtils.isDigits(p) || Integer.parseInt(p) > args.length) {
                        throw new Exception("ps param value invalid!");
                    }
                    int idx = Integer.parseInt(p);
                    sb.append(JSON.toJSONString(args[idx - 1])).append("-");
                }
            }
            int ttl = rr.ttl();
            String key = sb.toString();
            String md5 = DigestUtils.md5Hex(key);
            String appName = SpringUtils.getProperty("spring.application.name");
            String cacheKey = "RR-" + appName + "-" + m.getDeclaringClass().getName() + "." + m.getName() + "-" + md5;
            recommited = !redisUtil.setIfAbsent(cacheKey, "", ttl);
        } catch (Exception e) {
            log.error("RecommitAspect.doAround error:", e);
        } finally {
            if (!recommited) {
                result = jp.proceed();
            } else {
                result = Result.with(111, "重复提交");
                // methodLogAspect.doAfter(jp, result);
            }
        }
        return result;
    }

}

