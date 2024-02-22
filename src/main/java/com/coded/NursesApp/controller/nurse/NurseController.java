package com.coded.NursesApp.controller.nurse;

import com.coded.NursesApp.bo.nurse.CreateNurseRequest;
import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.service.booking.BookingService;
import com.coded.NursesApp.service.nurse.NurseService;
import com.coded.NursesApp.service.user.UserService;
import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/nurse")
public class NurseController {

    private final NurseService nurseService;


    private final UserService userService;


    private final BookingService bookingService;

    public NurseController(NurseService nurseService, UserService userService, BookingService bookingService) {
        this.nurseService = nurseService;
        this.userService = userService;
        this.bookingService = bookingService;
    }

    //create nurse
    @PostMapping("/create")
    public ResponseEntity<String> createNurse(@RequestBody CreateNurseRequest createNurseRequest) {
            nurseService.createNurse(createNurseRequest);
            return ResponseEntity.ok("Nurse created successfully");
    }


    @GetMapping("/all")
    public List<NurseEntity> getAllNurses(@RequestParam(required = false) Gender gender,
                                          @RequestParam(required = false) Hours workingHours,
                                          @RequestParam(required = false) String sp) {
        return nurseService.getAllNursesBasedOnFilter(gender,workingHours,sp);
    }

    // Endpoint to fetch details of a specific nurse by ID
    @GetMapping("/id")
    public NurseEntity getNurseById(@PathVariable Long id) {
        return nurseService.getNurseById(id);
    }

}
