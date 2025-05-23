package com.example.demo.demos.web;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author LuoXiangBao
 * @description
 * @date 2024/12/2 15:04
 */
public interface AbstractEnum extends IEnum<String> {
    @JsonValue
    String getValue();

    String getDescription();
}
