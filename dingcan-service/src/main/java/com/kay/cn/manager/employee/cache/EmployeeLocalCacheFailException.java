package com.kay.cn.manager.employee.cache;

import com.kay.cn.ServiceRuntimeException;
import com.kay.cn.constract.ResultCodeEnum;

/**
 * 员工信息载入缓存失败异常
 *
 * @author kay
 */
public class EmployeeLocalCacheFailException extends ServiceRuntimeException {

    public EmployeeLocalCacheFailException() {
        super(ResultCodeEnum.EMPLOYEE_LOAD_CACHE_FAIL);
    }
}
