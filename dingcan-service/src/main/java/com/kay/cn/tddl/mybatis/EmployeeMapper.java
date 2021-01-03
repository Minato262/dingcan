package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.domain.Employess;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employess> {
}
