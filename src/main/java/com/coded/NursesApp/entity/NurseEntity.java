package com.coded.NursesApp.entity;


import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;

import javax.persistence.*;

@Entity
@Table(name = "nurse")
public class NurseEntity {
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
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "Working_Hours", nullable = false)
    @Enumerated(EnumType.STRING)
    private Hours workingHours;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Hours getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Hours workingHours) {
        this.workingHours = workingHours;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

}



