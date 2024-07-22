package com.lonftonfando.studyspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lonftonfando.studyspring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources  {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Yuri", "yuri@gmail.com", "1234-5678", "1710");
        return ResponseEntity.ok().body(u);
    }
}
