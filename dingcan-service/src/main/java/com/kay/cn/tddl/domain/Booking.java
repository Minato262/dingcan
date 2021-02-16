package com.kay.cn.tddl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订餐表
 *
 * @author kay
 */
@TableName(value = "booking")
@Data
public class Booking implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单ID
     */
    @TableField(value = "order_id")
    private String orderId;

    /**
     * 菜单ID
     */
    @TableField(value = "menu_id")
    private String menuId;

    /**
     * 员工ID
     */
    @TableField(value = "employee_id")
    private String employeeId;

    /**
     * 是否删除：0-否，1-是
     *
     * @see com.kay.cn.tddl.constract.IsDeleted
     */
    @TableField(value = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;
}
