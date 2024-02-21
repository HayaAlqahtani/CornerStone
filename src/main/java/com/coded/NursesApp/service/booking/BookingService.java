package com.coded.NursesApp.service.booking;

import com.coded.NursesApp.entity.BookEntity;

import java.util.List;

public interface BookingService {
    void SaveBook(Long nurseID);

    BookEntity getBookDetails(Long bookId);

    List<BookEntity> getAllBookingDetails();
}
