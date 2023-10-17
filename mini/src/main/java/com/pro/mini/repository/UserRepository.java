package com.pro.mini.repository;

import com.pro.mini.dao.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDAO, Integer> {
    public UserDAO findById(String id);

    public List<UserDAO> findAllByName(String name);
    public List<UserDAO> findAllByEmail(String email);
}
