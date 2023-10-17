package com.pro.mini.service;

import com.pro.mini.dao.UserDAO;
import com.pro.mini.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDAO saveUser(UserDAO userDAO){
        return userRepository.save(userDAO);
    }

    public List<UserDAO> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserDAO> getUserById(Integer id){
        return userRepository.findById(id);
    }

    public List<UserDAO> getUsersByEmail(String email){
        return userRepository.findAllByEmail(email);
    }

    public List<UserDAO> getUsersByName(String name){
        return userRepository.findAllByName(name);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
