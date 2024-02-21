package com.coded.NursesApp.bo.nurse;

import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;

public class CreateNurseRequest {
    private Long id;
    private String name;
    private String age;
    private String rating;
    private Gender gender;
    private Hours WorkingHours;
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
        return WorkingHours;
    }

    public void setWorkingHours(Hours workingHours) {
        WorkingHours = workingHours;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
