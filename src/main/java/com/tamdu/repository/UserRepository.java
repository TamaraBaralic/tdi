package com.tamdu.repository;

import com.tamdu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tamara on 24.3.17..
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findByName(String name);

}
