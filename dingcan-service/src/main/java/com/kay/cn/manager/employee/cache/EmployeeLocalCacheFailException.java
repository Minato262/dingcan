package com.kay.cn.manager.employee.cache;

import com.kay.cn.ServiceRuntimeException;
import com.kay.cn.constract.ResultCodeEnum;

/**
 *
 *
 * @author kay
 */
public class EmployeeLocalCacheFailException extends ServiceRuntimeException {

    public EmployeeLocalCacheFailException() {
        super(ResultCodeEnum.EMPLOYEE_LOAD_CACHE_FAIL);
    }
}
