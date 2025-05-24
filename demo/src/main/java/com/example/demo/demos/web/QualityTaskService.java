package com.example.demo.demos.web;


import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface QualityTaskService extends IService<QualityTask> {


    Boolean startTask(Long id);


    Boolean updateList(Long id,List<String> ids);
}
