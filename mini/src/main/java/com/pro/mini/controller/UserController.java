package com.pro.mini.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pro.mini.service.UserService;
import com.pro.mini.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
    public ResponseEntity<UserVO> saveUser(HttpServletRequest req, HttpServletResponse res, @RequestBody String jsonStr) throws IOException {
        log.info("jsonStr ::: \n{}", jsonStr);
        ObjectMapper mapper = new ObjectMapper();
        UserVO userVO = mapper.readValue(jsonStr, UserVO.class);

        log.info("[saveUser]\t" +
                "userVO ::: {}", userVO);
        if (userVO == null){
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "userVO is null");
            return null;
        }
        return new ResponseEntity<UserVO>(userService.saveUser(userVO), HttpStatus.OK);
    }
}
