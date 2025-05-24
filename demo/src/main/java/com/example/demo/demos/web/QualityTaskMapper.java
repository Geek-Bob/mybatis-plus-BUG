package com.example.demo.demos.web;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface QualityTaskMapper extends BaseMapper<QualityTask> {
}
