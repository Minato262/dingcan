package com.kay.cn.manager.employee.cache;

import com.kay.cn.vo.EmployeeSearchVo;
import org.springframework.util.CollectionUtils;

import java.util.Map;

/**
 * 本地缓存
 *
 * @author kay
 */
public enum EmployeeLocalCache {
    INSTANCE;

    private Map<String, EmployeeSearchVo> instance;

    EmployeeLocalCache() {
        //
    }

    public void initCache(Map<String, EmployeeSearchVo> instance) {
        this.instance = instance;
    }

    public Map<String, EmployeeSearchVo> getCache() {
        if (CollectionUtils.isEmpty(instance)) {
            throw new EmployeeLocalCacheFailException();
        }
        return this.instance;
    }
}
