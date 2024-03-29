package com.coded.NursesApp.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BookEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "nurse_id", nullable = false)
    private NurseEntity nurse;

    @Column(name = "booking_date", nullable = false)
    private LocalDate bookingDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NurseEntity getNurse() {
        return nurse;
    }

    public void setNurse(NurseEntity nurse) {
        this.nurse = nurse;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
