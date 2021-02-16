package com.kay.cn.tddl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单表
 *
 * @author kay
 */
@TableName(value = "order")
@Data
public class Order implements Serializable {

    /**
     * 主键
     */
    @TableField(value = "id")
    private Long id;

    /**
     * 定时订单名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 菜单范围
     */
    @TableField(value = "menu_ids")
    private String menuIds;

    /**
     * 订单开始时间
     */
    @TableField(value = "start_time")
    private LocalDateTime startTime;

    /**
     * 订单结束时间
     */
    @TableField(value = "end_time")
    private LocalDateTime endTime;

    /**
     * 是否删除：0-否，1-是
     *
     * @see com.kay.cn.tddl.constract.IsDeleted
     */
    @TableField(value = "is_deleted")
    private Byte isDelete;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;
}
