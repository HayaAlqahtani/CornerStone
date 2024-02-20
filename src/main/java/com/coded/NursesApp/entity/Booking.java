package com.coded.NursesApp.entity;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "nurse_id")
    private NursesInformation nurse;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;

    public Booking(Long id, User user, NursesInformation nurse, Date bookingDate) {
        this.id = id;
        this.user = user;
        this.nurse = nurse;
        this.bookingDate = bookingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NursesInformation getNurse() {
        return nurse;
    }

    public void setNurse(NursesInformation nurse) {
        this.nurse = nurse;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
