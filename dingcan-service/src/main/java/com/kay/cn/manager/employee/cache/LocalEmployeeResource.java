package com.kay.cn.manager.employee.cache;

import com.kay.cn.vo.EmployeeSearchVo;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class LocalEmployeeResource {

    public Map<String, EmployeeSearchVo> getContent() {
        Map<String, EmployeeSearchVo> map = new TreeMap<>();
        try {
            Resource resource = new ClassPathResource("static/employee.txt");
            File sourceFile = resource.getFile();
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));

            String s;
            while ((s = reader.readLine()) != null) {
                String[] strs = s.split(" ");
                map.put(strs[0], new EmployeeSearchVo(strs[0], strs[1]));
            }
            reader.close();
        } catch (Exception e) {
            //
        }
        return map;
    }
}
