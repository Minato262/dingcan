package com.kay.cn.service.aop;

import com.kay.cn.service.ServiceRuntimeException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Service 层切面
 *
 * @author kay
 */
@Slf4j
@Aspect
@Component
public class ServiceAspect {

    /**
     * 拦截 Service 层
     *
     * @param ex AOP 切点信息
     * @throws ServiceRuntimeException Service 异常
     */
    @AfterThrowing(throwing = "ex", pointcut = "execution(* com.kay.cn.service.impl.*.*(..))")
    public void handleProceeding(Throwable ex) {
        log.error("service exception:" + ex);
        throw new ServiceRuntimeException(ex);
    }
}
