INSERT INTO quality_task (
    quality_rule_ids,
    task_name,
    task_type,
    task_status,
    current_count,
    total_count,
    execution_offset,
    param_app_ids
) VALUES (
             '[1,2,3]',  -- JSON 类型需以字符串形式插入
             '测试任务',
             'AUTO_TASK',
             'READY',
             0,
             100,
             '1747798073259|cc-mid-1747728917.1011979458',
             '["AA","BB"]'  -- 长度需控制在 varchar(1000) 限制内
         );
