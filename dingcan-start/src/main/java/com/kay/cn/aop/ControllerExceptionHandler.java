package com.kay.cn.aop;

import com.kay.cn.ServiceRuntimeException;
import com.kay.cn.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller 异常捕获
 *
 * @author kaywu
 */
@Slf4j
@Scope
@ControllerAdvice
public class ControllerExceptionHandler {

    /**
     * hibernate-validator 参数校验框架统一错误返回
     * {@link BindException} 异常处理
     *
     * @param e BindException 参数校验框架异常
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public Result handleException(BindException e) {
        FieldError fieldError = e.getFieldErrors().get(0);
        return Result.failed(fieldError.getDefaultMessage());
    }

    /**
     * hibernate-validator 参数校验框架统一错误返回
     * {@link MethodArgumentNotValidException} 异常处理
     *
     * @param e MethodArgumentNotValidException 参数校验框架异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result handleException(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldErrors().get(0);
        return Result.failed(fieldError.getDefaultMessage());
    }

    /**
     * Spring 参数校验框架统一错误返回
     * {@link MissingServletRequestParameterException} 异常处理
     *
     * @param e BindException 参数校验框架异常
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    @ResponseBody
    public Result handleException(MissingServletRequestParameterException e) {
        return Result.failed(e.getMessage());
    }

    /**
     * Spring 参数校验框架统一错误返回
     * {@link ServiceRuntimeException} 异常处理
     *
     * @param e Exception 参数校验框架异常
     */
    @ExceptionHandler(value = ServiceRuntimeException.class)
    @ResponseBody
    public Result handleException(ServiceRuntimeException e) {
        return Result.failed(e.getMessage());
    }

    /**
     * Spring 参数校验框架统一错误返回
     * {@link Exception} 异常处理
     *
     * @param e Exception 参数校验框架异常
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handleException(Exception e) {
        return Result.failed(e.getMessage());
    }
}
