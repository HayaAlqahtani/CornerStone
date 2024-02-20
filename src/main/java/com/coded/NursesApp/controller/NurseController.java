package com.coded.NursesApp.controller;

import com.coded.NursesApp.service.nurse.NurseService;
import com.coded.NursesApp.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/nurse")
public class NurseController {
    private final NurseService nurseService;
    private final UserService userService;

    public NurseController(NurseService nurseService, UserService userService) {
        this.nurseService = nurseService;
        this.userService = userService;
    }
}
