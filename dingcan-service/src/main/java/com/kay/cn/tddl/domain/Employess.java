package com.kay.cn.tddl.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 员工表
 *
 * @author kay
 */
@Data
public class Employess implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 工号
     */
    private String jobCode;

    /**
     * 是否删除：0-否，1-是
     */
    private Byte isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
