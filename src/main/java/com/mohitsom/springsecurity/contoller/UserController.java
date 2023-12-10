package com.mohitsom.springsecurity.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-controller")
public class UserController {
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endPoint");
    }
}
