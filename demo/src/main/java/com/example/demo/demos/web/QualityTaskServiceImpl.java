package com.example.demo.demos.web;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


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
}
