package com.example.demo.demos.web;

import lombok.Getter;

/**
 * 任务状态枚举
 */
@Getter
public enum TaskStatusEnum implements AbstractEnum {
    READY("READY", "就绪"),
    RUNNING("RUNNING", "执行中"),
    PAUSED("PAUSED", "已暂停"),
    COMPLETED("COMPLETED", "已完成"),
    CANCELED("CANCELED", "已取消");
    private final String value;
    private final String description;


    TaskStatusEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }
}
