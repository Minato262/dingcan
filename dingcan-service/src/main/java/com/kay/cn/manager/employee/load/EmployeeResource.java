package com.kay.cn.manager.employee.load;

import com.kay.cn.tddl.domain.Employess;
import com.kay.cn.tddl.mybatis.EmployeeMapper;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Component
@Slf4j
public class EmployeeResource {

    @Resource
    private EmployeeMapper employeeMapper;

    public Map<String, EmployeeSearchVo> getContent() {
        Map<String, EmployeeSearchVo> map = new TreeMap<>();
        try {
            List<Employess> list = employeeMapper.list();
            if (!CollectionUtils.isEmpty(list)) {
                for (Employess employee : list) {
                    map.put(employee.getJobCode(), new EmployeeSearchVo(employee.getJobCode(), employee.getName()));
                }
            }
        } catch (Exception e) {
            log.error("local employee error!", e);
        }
        return map;
    }
}
