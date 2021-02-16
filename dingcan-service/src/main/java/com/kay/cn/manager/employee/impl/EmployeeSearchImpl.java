package com.kay.cn.manager.employee.impl;

import com.kay.cn.manager.employee.EmployeeSearch;
import com.kay.cn.manager.employee.cache.EmployeeLocalCache;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class EmployeeSearchImpl implements EmployeeSearch {

    private static final EmployeeLocalCache CACHE_INSTANCE = EmployeeLocalCache.INSTANCE;

    private static final int SEARCH_LENGTH = 5;

    @Override
    public List<EmployeeSearchVo> search(String keyword) {
        List<EmployeeSearchVo> list = new ArrayList<>(SEARCH_LENGTH);
        for (Map.Entry<String, EmployeeSearchVo> entry : CACHE_INSTANCE.getCache().entrySet()) {
            if (list.size() == SEARCH_LENGTH) {
                break;
            }

            EmployeeSearchVo value = entry.getValue();
            if (value.contains(keyword)) {
                list.add(value);
            }
        }
        return list;
    }
}
