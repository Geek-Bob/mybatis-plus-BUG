package com.example.demo;

import com.alibaba.fastjson2.JSONObject;
import com.example.demo.demos.web.QualityTask;
import com.example.demo.demos.web.QualityTaskService;
import com.example.demo.demos.enums.TaskStatusEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
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
    void testUpdateList() {
        List<String> inputList = Arrays.asList("element1", "element2", "element3");
        Long id = 1L;

        // 调用方法
        qualityTaskService.updateList(id,inputList);

        // 从数据库中查询实际值
        String sql = "SELECT param_app_ids FROM quality_task WHERE id = ?";
        String actualListStr = jdbcTemplate.queryForObject(sql, String.class, id);

        // 断言两个 List 是否相等
        String inputListStr = JSONObject.toJSONString(inputList);
        assertEquals(inputListStr, actualListStr);
        System.out.println("inputListStr:"+inputListStr);
        System.out.println("actualListStr"+actualListStr);
    }

}
