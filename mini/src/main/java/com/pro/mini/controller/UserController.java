package com.pro.mini.controller;

import com.pro.mini.service.UserService;
import com.pro.mini.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping
    public ResponseEntity<List<UserVO>> getAllUsers() {
        List<UserVO> userVOList = userService.getAllUsers();
        log.info("[getAllUsers]\t" +
                "userDAOList ::: {}", userVOList);
        return new ResponseEntity<List<UserVO>>(userVOList, HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping
    public String saveUser(HttpServletRequest req, @RequestBody String body) {
        log.info("request.Body ::: {}", body);
        log.info("[saveUser]\t" +
                "body ::: {}", body);
//        return new ResponseEntity<UserVO>(userService.saveUser(userVO), HttpStatus.OK);
        return body;
    }
}
