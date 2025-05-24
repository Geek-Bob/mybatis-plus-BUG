package com.example.demo.demos.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

/**
 * 任务状态枚举
 */
@Getter
public enum TaskStatusEnum implements AbstractEnum {
    READY("READY", "就绪"),
    RUNNING("2", "执行中"),
    PAUSED("3", "已暂停"),
    COMPLETED("4", "已完成"),
    CANCELED("5", "已取消");
    private final String value;
    private final String description;


    TaskStatusEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }
}
