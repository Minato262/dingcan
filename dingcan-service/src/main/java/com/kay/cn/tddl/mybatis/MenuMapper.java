package com.kay.cn.tddl.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kay.cn.tddl.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单表
 *
 * @author kay
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
}
