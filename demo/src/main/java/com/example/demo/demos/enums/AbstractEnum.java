package com.example.demo.demos.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;


public interface AbstractEnum extends IEnum<String> {
    @JsonValue
    String getValue();

    String getDescription();
}
