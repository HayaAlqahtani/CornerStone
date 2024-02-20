package com.coded.NursesApp.controller;

import com.coded.NursesApp.reposatriy.BookRepository;
import com.coded.NursesApp.service.booking.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> bookNurse(@RequestParam Long nurseId) {
        bookingService.SaveBook(nurseId);
        return ResponseEntity.ok("Booking create successfully");
    }

    @GetMapping("/user/{userId}")
    public List<BookRepository> getUserBookings(@PathVariable Long userId) {
        //return bookingService.getUserBookings(userId);
        return null;
    }
}