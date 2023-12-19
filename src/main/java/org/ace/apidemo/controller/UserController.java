package org.ace.apidemo.controller;

import org.ace.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userservice;

    @GetMapping ("findAll")
    public ResponseEntity<User> findAll(){

    }
}
