package com.loollab.lab.api.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * @author sskma
 * @Created 04/10/2024 - 12:34 AM
 * @project api
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(value = "/{username}",produces = "application/json")
    public String get(@PathVariable ("username") String username) {
        return "Hello " + username;
    }
}
