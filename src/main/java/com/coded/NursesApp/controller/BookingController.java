package com.coded.NursesApp.controller;

import com.coded.NursesApp.reposatriy.Booking;
import com.coded.NursesApp.service.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book/{nurseId}/{userId}")
    public ResponseEntity<String> bookNurse(@PathVariable Long nurseId, @PathVariable Long userId) {
        try {
            Booking booking = bookingService.bookNurse(nurseId, userId);
            return ResponseEntity.ok("Nurse booked successfully. Booking ID: " + booking.getId());
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId) {
        return bookingService.getUserBookings(userId);
    }
}