package com.pro.mini.service;

import com.pro.mini.vo.UserVO;
import com.pro.mini.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserRepository userRepository;
    @Transactional
    public UserVO saveUser(UserVO userVO){
        log.info("[saveUser]\t" +
                "userVO ::: {}", userVO);
        return userRepository.save(userVO);
    }

    public List<UserVO> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserVO> getUserById(Integer id){
        return userRepository.findById(id);
    }

    public Optional<UserVO> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public List<UserVO> getUsersByName(String name){
        return userRepository.findAllByName(name);
    }

    @Transactional
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
