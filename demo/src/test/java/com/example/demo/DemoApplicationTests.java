package com.example.demo;

import com.example.demo.demos.web.QualityTask;
import com.example.demo.demos.web.QualityTaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QualityTaskService qualityTaskService;

    @Test
    void startTask() {
        qualityTaskService.startTask(1925713657019244546L, "");
    }

    @Test
    void list() {
        List<QualityTask> list= qualityTaskService.list();
    }

}
