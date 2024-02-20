package com.coded.NursesApp.entity;


import javax.persistence.*;

@Entity
public class NursesInformation {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "rating", nullable = false)
    private String rating;
    @Column(name = "gender", nullable = false)
    private String gender;

    public NursesInformation(Long id, String name, String age, String rating, String gender, String workingHours, boolean available, String specialized) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.gender = gender;
        WorkingHours = workingHours;
        this.available = available;
        this.specialized = specialized;
    }

    @Column(name = "Working Hours", nullable = false)
    private String WorkingHours;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private boolean available = true;


    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Column(name = "specialized", nullable = false)
    private String specialized;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getWorkingHours() {
        return WorkingHours;
    }

    public void setWorkingHours(String workingHours) {
        WorkingHours = workingHours;
    }
}


