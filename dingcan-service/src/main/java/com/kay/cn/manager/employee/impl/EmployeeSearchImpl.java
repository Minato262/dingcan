package com.kay.cn.manager.employee.impl;

import com.kay.cn.manager.employee.EmployeeSearch;
import com.kay.cn.manager.employee.cache.EmployeeLocalCache;
import com.kay.cn.vo.EmployeeSearchVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 员工本地检索
 *
 * @author kay
 */
@Component
public class EmployeeSearchImpl implements EmployeeSearch {

    private final Map<String, EmployeeSearchVo> instance = EmployeeLocalCache.INSTANCE.getCache();

    @Override
    public List<EmployeeSearchVo> search(String keyword) {
        List<EmployeeSearchVo> list = new ArrayList<>(5);
        for (Map.Entry<String, EmployeeSearchVo> entry : instance.entrySet()) {
            if (list.size() == 5) {
                break;
            }

            EmployeeSearchVo value = entry.getValue();
            if (value.getEmployeeRealName().contains(keyword) || value.getEmployeeJobCode().contains(keyword)) {
                list.add(value);
            }
        }
        return list;
    }
}
