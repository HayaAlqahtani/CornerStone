package com.coded.NursesApp.service.booking;

import com.coded.NursesApp.entity.NursesInformation;
import com.coded.NursesApp.reposatriy.Booking;
import com.coded.NursesApp.service.nurse.NurseService;
import com.coded.NursesApp.service.user.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private Booking bookingRepository;

    @Autowired
    private NurseService nurseService;

    @Autowired
    private UserService userService;

    @Override
    public Booking bookNurse(Long nurseId, Long userId) {
        return null;
    }

    @Override
    public List<Booking> getUserBookings(Long userId) {
        return null;
    }

//    @Override
//    public Booking bookNurse(Long nurseId, Long userId) {
//        NursesInformation nurse = nurseService.getNurseById(nurseId);
//        User user = userService.getUserById(userId);
//
//        if (nurse == null || user == null) {
//            throw new RuntimeException("Nurse or user not found");
//        }
//
//        if (!nurseService.isNurseAvailableForBooking(nurseId)) {
//            throw new RuntimeException("Nurse is not available for booking");
//        }
//
//        Booking booking = new Booking();
//        booking.setNurse(nurse);
//        booking.setUser(user);
//        booking.setBookingDate(new Date());
//
//        return bookingRepository.save(booking);
//         }
//
//        @Override
//        public List<Booking> getUserBookings (Long userId){
//            return bookingRepository.findByUserId(userId);
//        }
}
