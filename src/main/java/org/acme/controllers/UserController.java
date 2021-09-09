package org.acme.controllers;

import org.acme.entities.User;
import org.acme.repositories.UserRepositpry;
import org.jboss.logging.annotations.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * |** @author 'Gihan Rathnayaka'**|
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserRepositpry userRepositpry;

    @PostMapping(value = "create")
    public ResponseEntity<?> createUser(@RequestBody User user){
        User u = userRepositpry.save(user);
        return new ResponseEntity(u,HttpStatus.OK);
    }
}
