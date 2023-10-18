package com.pro.mini.repository;

import com.pro.mini.dao.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Integer> {
    public UserDAO findById(String id);

    public List<UserDAO> findAllByName(String name);
    public List<UserDAO> findAllByEmail(String email);
}
