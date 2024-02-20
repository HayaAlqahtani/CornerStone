package com.coded.NursesApp.service.booking;

import com.coded.NursesApp.reposatriy.Booking;

import java.util.List;

public interface BookingService {
    Booking bookNurse(Long nurseId, Long userId);
    List<Booking> getUserBookings(Long userId);
}
