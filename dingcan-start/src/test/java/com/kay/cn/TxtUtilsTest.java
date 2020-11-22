package com.kay.cn;

import com.kay.cn.manager.employee.cache.LocalEmployeeResource;
import com.kay.cn.vo.EmployeeSearchVo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TxtUtilsTest {

    @Test
    public void getContentTest() {
        LocalEmployeeResource employeeLocalTxt = new LocalEmployeeResource();
        Map<String, EmployeeSearchVo> content = employeeLocalTxt.getContent();
        Assert.assertNotNull(content);
    }
}
