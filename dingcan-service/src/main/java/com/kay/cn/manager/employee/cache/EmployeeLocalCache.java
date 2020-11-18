package com.kay.cn.manager.employee.cache;

import com.kay.cn.vo.EmployeeSearchVo;

import java.util.Map;
import java.util.TreeMap;

public enum EmployeeLocalCache {
    INSTANCE;

    private final Map<String, EmployeeSearchVo> instance;

    EmployeeLocalCache() {
        instance = new TreeMap<>();
    }

    public Map<String, EmployeeSearchVo> getCache() {
        return this.instance;
    }
}
