package com.kay.cn;

import com.kay.cn.manager.employee.load.EmployeeResource;
import com.kay.cn.util.FileUtils;
import com.kay.cn.vo.EmployeeSearchVo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TxtUtilsTest {

    @Test
    public void getContentTest() {
        EmployeeResource employeeLocalTxt = new EmployeeResource();
        Map<String, EmployeeSearchVo> content = employeeLocalTxt.getContent();
        Assert.assertNotNull(content);
    }

    @Test
    public void getTxt() {
        String file = FileUtils.getContent("/static/employee.txt");
        System.out.println(file);
    }
}
