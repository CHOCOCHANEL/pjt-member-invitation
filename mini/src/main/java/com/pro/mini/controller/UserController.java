package com.pro.mini.controller;

import com.pro.mini.service.UserService;
import com.pro.mini.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<UserVO>> getAllUsers() {
        List<UserVO> userVOList = userService.getAllUsers();
        log.info("[UserController] getAllUsers" +
                "userDAOList ::: {}", userVOList);
        return new ResponseEntity<List<UserVO>>(userVOList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserVO> saveUser(UserVO userVO) {
        log.info("[UserController] saveUser" +
                "userVO ::: {}", userVO);
        return new ResponseEntity<UserVO>(userService.saveUser(userVO), HttpStatus.OK);
    }
}
