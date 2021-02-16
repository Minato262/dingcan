package com.kay.cn.manager.employee.load;

import com.kay.cn.manager.employee.cache.EmployeeLocalCache;
import com.kay.cn.vo.EmployeeSearchVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Map;
import java.util.TimerTask;

/**
 * 员工资源载入线程
 *
 * @author kay
 */
@Slf4j
@Component
public class EmployeeResourceLoadTask extends TimerTask {

    private static final EmployeeLocalCache CACHE_INSTANCE = EmployeeLocalCache.INSTANCE;

    @Resource
    private EmployeeResource employeeResource;

    @Override
    public void run() {
        Map<String, EmployeeSearchVo> map = employeeResource.getAllEmployee();
        if (!CollectionUtils.isEmpty(map)) {
            log.info("load employee cache, start!");
            CACHE_INSTANCE.initCache(map);
            log.info("load employee cache, end! success={}", map.size());
        }
    }
}
