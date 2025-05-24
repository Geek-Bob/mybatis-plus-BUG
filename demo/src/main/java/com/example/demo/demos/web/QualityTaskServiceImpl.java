package com.example.demo.demos.web;


import com.example.demo.demos.enums.TaskStatusEnum;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author LuoXiangBao
 * @description
 * @date 2024/11/22 14:36
 */
@Service
public class QualityTaskServiceImpl extends SafeServiceImpl<QualityTaskMapper, QualityTask> implements QualityTaskService {



    @Override
    public Boolean startTask(Long id) {

        QualityTask task = new QualityTask();
        task.setTaskStatus(TaskStatusEnum.RUNNING);
        task.setId(id);

        return updateById(task);
    }

    @Override
    public Boolean updateList(Long id,List<String> ids) {
        QualityTask task = new QualityTask();
        task.setId(id);
        task.setParamAppIds(ids);
        return updateById(task);
    }
}
