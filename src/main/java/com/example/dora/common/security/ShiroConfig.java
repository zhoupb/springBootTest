package com.example.dora.common.security;

import com.example.dora.common.exception.MyExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * @author: zhoupb
 * @Description: ShiroConfig
 * @since: version 1.0
 */
public class ShiroConfig {


    /**
     * Spring容器中注册异常处理类，实现全局异常处理
     * @return
     */
    @Bean(name = "exceptionHandler")
    public HandlerExceptionResolver handlerExceptionResolver() {
        return new MyExceptionHandler();
    }
}
