package com.kay.cn.tddl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 菜单表
 *
 * @author kay
 */
@TableName(value = "menu")
@Data
public class Menu implements Serializable {

    /**
     * 主键
     */
    @TableField(value = "id")
    private Long id;

    /**
     * 套菜名单
     */
    @TableField(value = "name")
    private String name;

    /**
     * 金额
     */
    @TableField(value = "money")
    private Long money;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

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
