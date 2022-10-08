package com.mongo.movies.controller;

import com.mongo.movies.entity.User;
import com.mongo.movies.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findByID")
    public ResponseEntity<User> findByID(@RequestParam String ID) {
        return userService.findByID(ID);
    }

}
