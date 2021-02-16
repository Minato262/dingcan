package com.kay.cn.manager.employee.load;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Timer;

import static com.kay.cn.constract.Common.TIME_MINUTE;
import static com.kay.cn.constract.Common.TIME_SECOND;

/**
 * 员工资源载入
 *
 * @author kay
 */
@Component
@Slf4j
public class EmployeeResourceLoad {

    @Resource
    private EmployeeResourceLoadTask employeeResourceLoadTask;

    @PostConstruct
    private void init() {
        log.info("employee resource init");
        Timer timer = new Timer();
        timer.schedule(employeeResourceLoadTask, TIME_SECOND, 10 * TIME_MINUTE);
    }
}
