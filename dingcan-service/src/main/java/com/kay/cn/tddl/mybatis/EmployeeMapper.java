package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.constract.IsDeleted;
import com.kay.cn.tddl.domain.Employess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employess> {

    default List<Employess> list() {
        LambdaQueryWrapper<Employess> query = new LambdaQueryWrapper<>();
        query.eq(Employess::getIsDeleted, IsDeleted.FALSE.getValue());
        return selectList(query);
    }
}
