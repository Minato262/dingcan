package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单表
 *
 * @author kay
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
