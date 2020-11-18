package com.kay.cn.aop;

import com.kay.cn.service.impl.ServiceRuntimeException;
import com.kay.cn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Aspect
@Component
public class ControllerAspect {

    private static final String CONTROLLER_URL = "execution(public * com.kay.cn.controller..*.*(..))";

    private static final String REQUEST_ID_KEY = "requestId";

    private final HttpServletRequest request;

    @Autowired
    public ControllerAspect(HttpServletRequest request) {
        this.request = request;
    }

    @Around(CONTROLLER_URL)
    public Object handleProceeding(ProceedingJoinPoint pjp) {
        StringBuilder sb = beforeLog();
        try {
            final long startTime = System.currentTimeMillis();
            return afterLog(startTime, pjp.proceed(), sb);
        } catch (ServiceRuntimeException e) {
            return Result.failed(e.getMessage());
        } catch (Throwable e) {
            log.error("error，e=", e);
            return Result.failed(e.getMessage());
        }
    }

    private StringBuilder beforeLog() {
        final String requestId = request.getHeader(REQUEST_ID_KEY);
        final String uri = request.getRequestURI();

        StringBuilder sb = new StringBuilder("Request report, ");
        sb.append("requestId: ").append(requestId).append(", ");
        sb.append("url: ").append(uri).append(", ");
        return sb;
    }

    private Object afterLog(long startTime, Object proceed, StringBuilder sb) {
        final String time = String.format("%d ms ", (System.currentTimeMillis() - startTime));

        sb.append("time: ").append(time).append(", ");
        sb.append("return: ").append(proceed);
        log.info(sb.toString());
        return proceed;
    }
}
