package com.loollab.lab.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sskma
 * @Created 04/10/2024 - 12:34 AM
 * @project api
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping(value = "/{username}",produces = "application/json")
    public ResponseEntity <String> getUser( @PathVariable ("username") String username) {
        return !username.isEmpty () ? ResponseEntity.ok("Hello " + username) : ResponseEntity.badRequest().build();
    }
}
