package com.example.demo.demos.web;


import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author LuoXiangBao
 * @description
 * @date 2024/11/22 14:33
 */
public interface QualityTaskService extends IService<QualityTask> {


    Boolean startTask(Long id, String updateEmp);
}
