package com.example.demo;

import com.example.demo.demos.web.QualityTask;
import com.example.demo.demos.web.QualityTaskService;
import com.example.demo.demos.web.TaskStatusEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QualityTaskService qualityTaskService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void startTask() {

        Long  id = 1L;
        qualityTaskService.startTask(id);
        String sql = "SELECT task_status FROM quality_task WHERE id = ?";
        String one = jdbcTemplate.queryForObject(sql, String.class, id);
        assertEquals(TaskStatusEnum.RUNNING.getValue(),one);
        System.out.println(one);
    }

    @Test
    void list() {
        List<QualityTask> list= qualityTaskService.list();
    }

}
