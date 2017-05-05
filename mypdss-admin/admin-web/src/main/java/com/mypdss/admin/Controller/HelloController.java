package com.mypdss.admin.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by yu on 2017/5/4.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say/{content}")
    public String say(@PathVariable(required = false,value = "content") String content) {
        return "hello " + content + "。";
    }
}
