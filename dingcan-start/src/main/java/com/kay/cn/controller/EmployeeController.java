package com.kay.cn.controller;

import com.kay.cn.service.EmployeeService;
import com.kay.cn.util.Result;
import com.kay.cn.vo.EmployeeSearchVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Controller 层
 *
 * @author kay
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping("/search")
    public Result search(@RequestParam("keyword") String keyword) {
        List<EmployeeSearchVo> list = employeeService.search(keyword);
        return Result.success(list);
    }
}
