package com.hurusea.sunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @hurusea
 * @create2020-03-22 16:07
 */

@Controller
public class HelloController {

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

}
