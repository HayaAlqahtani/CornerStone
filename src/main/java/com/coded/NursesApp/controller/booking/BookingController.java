package com.coded.NursesApp.controller.booking;

import com.coded.NursesApp.entity.BookEntity;
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

    @GetMapping("/get-book-details")
    public ResponseEntity<BookEntity> getBookDetail(@RequestParam Long bookId){
        return ResponseEntity.ok(bookingService.getBookDetails(bookId));
    }

    @GetMapping("/get-all-book-details")
    public ResponseEntity<List<BookEntity>> getAllBookDetails(){
        return ResponseEntity.ok(bookingService.getAllBookingDetails());
    }
}