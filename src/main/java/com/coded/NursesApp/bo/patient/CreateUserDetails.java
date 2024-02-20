package com.coded.NursesApp.bo.patient;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class CreateUserDetails {
    private String username;
    private String CivilId;
    private String age;
    private String MedicalRecord;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCivilId() {
        return CivilId;
    }

    public void setCivilId(String civilId) {
        CivilId = civilId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMedicalRecord() {
        return MedicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        MedicalRecord = medicalRecord;
    }
}
