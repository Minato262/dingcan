package com.kay.cn.manager.employee.local;

import com.kay.cn.util.FileUtils;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class EmployeeFileResource {

    private static final String STATIC_EMPLOYEE = "/static/employee.txt";

    public Map<String, EmployeeSearchVo> getContent() {
        Map<String, EmployeeSearchVo> map = new TreeMap<>();
        try {
            String content = FileUtils.getContent(STATIC_EMPLOYEE);
            if (!StringUtils.isEmpty(content)) {
                String[] employeeArray = content.split(System.lineSeparator());
                for (String employee : employeeArray) {
                    String[] str = employee.split(" ");
                    map.put(str[0], new EmployeeSearchVo(str[0], str[1]));
                }
            }
        } catch (Exception e) {
            log.error("local employee error!", e);
        }
        return map;
    }
}
