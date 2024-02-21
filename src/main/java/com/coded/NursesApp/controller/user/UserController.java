package com.coded.NursesApp.controller.user;

import com.coded.NursesApp.bo.patient.CreateUserDetails;
import com.coded.NursesApp.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {
    private final UserService userService; //injection this is the constructor with similar class name


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody CreateUserDetails createUserDetails) {
        try {
            userService.saveUser(createUserDetails);


        } catch (IllegalArgumentException e) {

            return ResponseEntity.badRequest().body(" ACTIVE or INACTIVE");
        }
        return ResponseEntity.ok(" User Has Been Created");
    }
}