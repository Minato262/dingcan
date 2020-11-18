package com.kay.cn.manager.employee.load;

import com.kay.cn.manager.employee.cache.EmployeeLocalCache;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class EmployeeLocalCacheInitThread implements Runnable {

    private final Map<String, EmployeeSearchVo> instance = EmployeeLocalCache.INSTANCE.getCache();

    @Override
    public void run() {
        instance.put("1001", new EmployeeSearchVo(1L, "吴凯", "1001"));
        instance.put("1002", new EmployeeSearchVo(2L, "叙述", "1002"));
        instance.put("1003", new EmployeeSearchVo(3L, "老徐", "1003"));
        instance.put("1004", new EmployeeSearchVo(4L, "才是", "1004"));

        instance.put("1011", new EmployeeSearchVo(11L, "吴凯凯", "1011"));
        instance.put("1012", new EmployeeSearchVo(12L, "纯色", "1012"));
        instance.put("1013", new EmployeeSearchVo(13L, "徐凯则", "1013"));
        instance.put("1014", new EmployeeSearchVo(14L, "出问题", "1014"));

        instance.put("1021", new EmployeeSearchVo(21L, "穿人", "1021"));
        instance.put("1022", new EmployeeSearchVo(22L, "海贼王", "1022"));
        instance.put("1023", new EmployeeSearchVo(23L, "呵呵", "1023"));
        instance.put("1024", new EmployeeSearchVo(24L, "才纯色", "1024"));

    }
}
