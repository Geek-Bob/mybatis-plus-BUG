create table quality_task
(
    id BIGINT IDENTITY(1,1) PRIMARY KEY COMMENT '主键',
    quality_rule_ids varchar(1000)                           not null comment '质检规则ID列表，如[1,2]',
    task_name        varchar(100)                           not null comment '任务名称',
    task_type        varchar(50)                            not null comment '任务类型(AUTO_TASK:自动;MANUAL_TASK:手动)',
    task_status      varchar(50)                            not null comment '任务状态（READY：就绪, RUNNING：执行中, PAUSED：已暂停, COMPLETED：已完成, CANCELED：已取消）',
    current_count    int          default 0                 not null comment '当前已处理数量',
    total_count      int          default 0                 not null comment '质检总数量',
    execution_offset varchar(100) default ''                not null comment '数据执行偏移量（1747798073259|cc-mid-1747728917.1011979458）',
    param_app_ids    varchar(1000)                          null comment '质检渠道ID列表，如[PNP,oc_core]'
);

