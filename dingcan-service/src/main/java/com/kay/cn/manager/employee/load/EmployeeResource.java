package com.kay.cn.manager.employee.load;

import com.kay.cn.manager.employee.cache.EmployeeLocalCacheFailException;
import com.kay.cn.tddl.domain.Employess;
import com.kay.cn.tddl.mybatis.EmployeeMapper;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.kay.cn.constract.Common.PAGE_SIZE;

/**
 * 员工信息资源
 *
 * @author kay
 */
@Component
@Slf4j
public class EmployeeResource {

    @Resource
    private EmployeeMapper employeeMapper;

    public Map<String, EmployeeSearchVo> getAllEmployee() {
        Map<String, EmployeeSearchVo> map = new TreeMap<>();
        try {
            int count = employeeMapper.count();
            for (int i = 0; i < (count / PAGE_SIZE + 1); i++) {
                List<Employess> list = employeeMapper.list(i);
                for (Employess employee : list) {
                    EmployeeSearchVo searchVo = new EmployeeSearchVo(employee.getJobCode(), employee.getName());
                    map.put(employee.getJobCode(), searchVo);
                }
            }
            return map;
        } catch (Exception e) {
            log.error("local employee error!", e);
            throw new EmployeeLocalCacheFailException();
        }
    }
}
