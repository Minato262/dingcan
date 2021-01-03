package com.kay.cn.tddl.constract;

import lombok.Getter;

@Getter
public enum IsDeleted {
    FALSE((byte) 0),
    TURE((byte) 1);

    private final byte value;

    IsDeleted(byte value) {
        this.value = value;
    }
}
