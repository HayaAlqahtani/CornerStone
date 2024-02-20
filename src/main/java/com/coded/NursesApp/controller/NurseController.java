package com.coded.NursesApp.controller;

import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.service.booking.BookingService;
import com.coded.NursesApp.service.nurse.NurseService;
import com.coded.NursesApp.service.user.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nurse")
public class NurseController {
    @Autowired
    private NurseService nurseService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookingService bookingService;

    @GetMapping("/all")
    public List<NurseEntity> getAllNurses() {
        return nurseService.getAllNurses();
    }

    // Endpoint to fetch details of a specific nurse by ID
    @GetMapping("/{id}")
    public NurseEntity getNurseById(@PathVariable Long id) {
        return nurseService.getNurseById(id);
    }

    // Endpoint to book a nurse
    @PostMapping("/book/{nurseId}/{userId}")
    public ResponseEntity<String> bookNurse(@PathVariable Long nurseId, @PathVariable Long userId) {
        NurseEntity nurse = nurseService.getNurseById(nurseId);
        User user = userService.getUserById(userId);

        if (nurse == null || user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nurse or user not found");
        }

        if (!nurseService.isNurseAvailableForBooking(nurseId)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Nurse is not available for booking");
        }

//        Booking booking = new Booking();
//        booking.setNurse(nurse);
//        booking.setUser(user);
//
//        bookingService.createBooking(booking);

        return ResponseEntity.ok("Nurse booked successfully");
        // filtering nurses by speciality, gender, etc.
    }


}
