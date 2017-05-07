package com.mypdss.admin.repository;

import com.mypdss.admin.domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yu on 17-5-6.
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    //通过名字查询
    public List<User> findByName(String name);

}
