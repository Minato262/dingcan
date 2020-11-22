package com.kay.cn;

import com.kay.cn.manager.employee.local.EmployeeFileResource;
import com.kay.cn.util.FileUtils;
import com.kay.cn.vo.EmployeeSearchVo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TxtUtilsTest {

    @Test
    public void getContentTest() {
        EmployeeFileResource employeeLocalTxt = new EmployeeFileResource();
        Map<String, EmployeeSearchVo> content = employeeLocalTxt.getContent();
        Assert.assertNotNull(content);
    }

    @Test
    public void getTxt() {
        String file = FileUtils.getContent("/static/employee.txt");
        System.out.println(file);
    }
}
