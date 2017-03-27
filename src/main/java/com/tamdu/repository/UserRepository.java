package com.tamdu.repository;

import com.tamdu.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Set;

/**
 * Created by tamara on 24.3.17..
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {

    public User findByName(String name);
}
