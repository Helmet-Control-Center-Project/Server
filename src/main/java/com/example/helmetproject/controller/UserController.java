package com.example.helmetproject.controller;

import com.example.helmetproject.dto.User;
import com.example.helmetproject.dto.UserWorkHistory;
import com.example.helmetproject.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity createUser(
            @RequestBody User user){
        try {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("create OK");
        } catch (NullPointerException nullPointerException) {
            return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body(nullPointerException);
        }
    }

    @GetMapping("/user/{userSsn}")
    public ResponseEntity<User> findUser(
            @PathVariable("userSsn") String userSsn){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findUser(userSsn));
    }

    @GetMapping("/user/findAll")
    public ResponseEntity<List<User>> findAll(){
        List<User> data = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }

    @PostMapping("/user/work")
    public ResponseEntity userWork(@RequestBody UserWorkHistory userWorkHistory){
        userService.userWork(userWorkHistory);
        return ResponseEntity.status(HttpStatus.OK).body("Ok");
    }



}
