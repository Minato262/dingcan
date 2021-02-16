package com.kay.cn.manager.employee.cache;

import com.kay.cn.vo.EmployeeSearchVo;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工信息本地缓存
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
        return CollectionUtils.isEmpty(instance) ? new HashMap<>() : this.instance;
    }
}
