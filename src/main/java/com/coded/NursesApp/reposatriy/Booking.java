package com.coded.NursesApp.reposatriy;

import com.coded.NursesApp.entity.NursesInformation;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;

@Repository
public interface Booking extends JpaRepository<Booking ,Long> {
    void setNurse(NursesInformation nurse);

    List<Booking> findByUserId(Long userId);

    void setBookingDate(Date date);

    void setUser(User user);

    String getId();
}
