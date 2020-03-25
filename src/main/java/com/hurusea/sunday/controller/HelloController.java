package com.hurusea.sunday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @hurusea
 * @create2020-03-22 16:07
 */

@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping({"/index","/","/login"})
    public String index() {

        return "login";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {

        return "hello";
    }


    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @ResponseBody
    @GetMapping("/query")
    public Map<String, Object> map() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }

}
