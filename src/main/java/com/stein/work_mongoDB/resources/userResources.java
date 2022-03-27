package com.stein.work_mongoDB.resources;

import com.stein.work_mongoDB.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class userResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("12", "Maria", "maria@gmail.com");
        User jose = new User("13", "jose", "jose@gmail.com");

        return ResponseEntity.ok().body(Arrays.asList(maria, jose));
    }
}
