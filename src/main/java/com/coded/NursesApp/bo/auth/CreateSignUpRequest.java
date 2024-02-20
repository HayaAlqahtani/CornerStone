package com.coded.NursesApp.bo.auth;

public class CreateSignUpRequest {

    private String MedicalRecord;
    private String username;
    private String password;
    private String CivilId;
    private String age;
    private String Address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public String getMedicalRecord() {
        return MedicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        MedicalRecord = medicalRecord;
    }
}
