package com.example.demo.demos.web;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author LuoXiangBao
 * @description
 * @date 2024/11/22 14:29
 */
@Mapper
@Repository
public interface QualityTaskMapper extends BaseMapper<QualityTask> {
}
