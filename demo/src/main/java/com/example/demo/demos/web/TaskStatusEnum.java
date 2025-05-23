package com.example.demo.demos.web;

import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

/**
 * 任务状态枚举
 */
@Getter
public enum TaskStatusEnum implements IEnum<String> {
    READY("READY", "就绪"),
    RUNNING("2", "执行中"),
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
