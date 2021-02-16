package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.constract.IsDeleted;
import com.kay.cn.tddl.domain.Employess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import static com.kay.cn.constract.Common.PAGE_SIZE;

/**
 * 员工信息表
 *
 * @author kay
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employess> {

    default List<Employess> list(int start) {
        LambdaQueryWrapper<Employess> query = new LambdaQueryWrapper<>();
        query.eq(Employess::getIsDeleted, IsDeleted.FALSE.getValue());
        query.orderByAsc(Employess::getId);
        query.last("limit " + (start * PAGE_SIZE) + "," + PAGE_SIZE);
        return selectList(query);
    }

    default int count() {
        LambdaQueryWrapper<Employess> query = new LambdaQueryWrapper<>();
        query.eq(Employess::getIsDeleted, IsDeleted.FALSE.getValue());
        query.orderByAsc(Employess::getId);
        return selectCount(query);
    }
}
