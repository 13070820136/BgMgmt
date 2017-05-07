package com.mypdss.admin;

import com.mypdss.admin.domain.User;
import com.mypdss.admin.repository.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    private UserRepository userRepository;

    @org.junit.Test
    public void test() {
        Pageable pageable = new PageRequest(1, 5);
        Page<User> userPage = userRepository.findAll(pageable);
        System.out.println(userPage.getTotalElements());
    }

}
