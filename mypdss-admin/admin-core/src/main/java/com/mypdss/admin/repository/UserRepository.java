package com.mypdss.admin.repository;

import com.mypdss.admin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yu on 17-5-6.
 */
public interface UserRepository extends JpaRepository<User,Integer>{

}
