package com.example.dora.config.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 李军
 * @version 1.0
 * @date 2019/6/19 15:50
 */
@Aspect
@Order(-10)
@Component
@Slf4j
public class DynamicDataSourceAspect {

    @Pointcut("@annotation(com.example.dora.config.datasource.DataSource)")
    public void pointCut() {}


    @Before("pointCut()")
    public void doBefore(JoinPoint point){
        Class<?> className = point.getTarget().getClass();
        //获得访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
        String dataSource = DynamicDataSourceContextHolder.DEFAULT_DS;
        try {
            // 得到访问的方法对象
            Method method = className.getMethod(methodName, argClass);
            // 判断是否存在@DS注解
            if (method.isAnnotationPresent(DataSource.class)) {
                DataSource annotation = method.getAnnotation(DataSource.class);
                // 取出注解中的数据源名
                dataSource = annotation.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DynamicDataSourceContextHolder.setDataSourceType(dataSource);
    }

    /**
     * 清理
     */
    @After("pointCut()")
    public void after(){
        DynamicDataSourceContextHolder.clearDataSourceType();
    }

}
