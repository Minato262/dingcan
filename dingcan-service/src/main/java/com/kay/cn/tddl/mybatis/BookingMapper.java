package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.domain.Booking;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订餐表
 *
 * @author kay
 */
@Mapper
public interface BookingMapper extends BaseMapper<Booking> {
}
