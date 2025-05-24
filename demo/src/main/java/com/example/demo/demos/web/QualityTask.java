package com.example.demo.demos.web;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.example.demo.demos.enums.TaskStatusEnum;
import com.example.demo.demos.enums.TaskTypeEnum;
import lombok.Data;


import java.util.List;

/**
 * @author LuoXiangBao
 * @description
 * @date 2024/11/22 10:43
 */
@Data
@TableName(value = "quality_task", autoResultMap = true)
public class QualityTask   {

    private Long id;

    /**
     * 质检规则ID列表（JSON数组）
     * 示例：[1,2]
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<Long> qualityRuleIds;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务类型
     * 枚举值：AUTO_TASK(自动), MANUAL_TASK(手动)
     */
    @TableField(typeHandler = MybatisEnumTypeHandler.class)
    private TaskTypeEnum taskType;

    /**
     * 任务状态
     * 枚举值：READY(就绪), RUNNING(执行中), PAUSED(已暂停),
     * COMPLETED(已完成), CANCELED(已取消)
     */
    private TaskStatusEnum taskStatus;

    /**
     * 当前已处理数量
     * 数据库字段：current_count INT NOT NULL
     */
    private Integer currentCount;

    /**
     * 质检总数量
     */
    private Integer totalCount;

    /**
     * 数据执行偏移量
     * 示例："1747798073259|cc-mid-1747728917.1011979458"
     */
    private String executionOffset;

    /**
     * 质检渠道ID列表（JSON数组）
     * 示例：[PNP,oc_core]
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<String> paramAppIds;


}
