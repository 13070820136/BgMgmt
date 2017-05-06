package com.mypdss.admin.Controller;

import com.mypdss.admin.domain.User;
import com.mypdss.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yu on 2017/5/4.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/say/{content}")
    public String say(@PathVariable(required = false,value = "content") String content) {
        return "hello " + content + "。";
    }

    @GetMapping("/find")
    public List<User> find(){
        return userRepository.findAll();
    }
    
}
