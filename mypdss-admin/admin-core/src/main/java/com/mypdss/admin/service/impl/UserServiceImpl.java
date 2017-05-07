package com.mypdss.admin.service.impl;

import com.mypdss.admin.domain.User;
import com.mypdss.admin.repository.UserRepository;
import com.mypdss.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yu on 2017/5/7.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void createTwoUser() {
        User user = new User();
        user.setName("福田");
        userRepository.save(user);
        User user2 = new User();
        user2.setName("龙慧");
        userRepository.save(user2);
    }

}
