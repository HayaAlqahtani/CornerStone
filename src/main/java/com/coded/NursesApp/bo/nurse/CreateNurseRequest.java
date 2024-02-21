package com.coded.NursesApp.bo.nurse;

import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;

public class CreateNurseRequest {
    private String name;
    private String age;
    private String rating;
    private String gender;
    private String WorkingHours;
    private String specialized;


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

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
