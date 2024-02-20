package com.coded.NursesApp.entity;


import com.coded.NursesApp.bo.patient.CreateUserDetails;

import javax.persistence.*;

@Table(name = "account_user")
@Entity
public class UserEntity  {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "CivilId", nullable = false)
    private String CivilId;
    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "Address", nullable = false)
    private String Address;

    @Column(name = "MedicalRecord", nullable = false)
    private String MedicalRecord;

    @OneToOne
    @JoinColumn(name = "role_id")
    private RoleEntity roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public RoleEntity getRoles() {
        return roles;
    }

    public void setRoles(RoleEntity roles) {
        this.roles = roles;
    }
}


