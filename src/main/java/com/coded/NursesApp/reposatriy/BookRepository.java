package com.coded.NursesApp.reposatriy;

import com.coded.NursesApp.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Long> {
    //void setNurse(NursesInformation nurse);

    //List<Booking> findByUserId(Long userId);

   // void setBookingDate(Date date);

   // void setUser(User user);

   // String getId();
}
