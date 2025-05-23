package com.example.demo.demos.web;

import lombok.Getter;

/**
 * 任务类型
 */
@Getter
public enum TaskTypeEnum implements AbstractEnum {
    AUTO_TASK("AUTO_TASK", "自动"),
    MANUAL_TASK("MANUAL_TASK", "手动");

    private final String value;
    private final String description;

    TaskTypeEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }
}
