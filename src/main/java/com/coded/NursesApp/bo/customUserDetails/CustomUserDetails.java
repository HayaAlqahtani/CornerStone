package com.coded.NursesApp.bo.customUserDetails;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomUserDetails implements UserDetails {

    private Long id;
    private String userName;
    private String password;
    private String role;
    private String MedicalRecord;
    private String civilId;
    private String age;
    private String address;

    public String getMedicalRecord() {
        return MedicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        MedicalRecord = medicalRecord;
    }



    public String getCivilId() {
        return civilId;
    }

    public void setCivilId(String civilId) {
        this.civilId = civilId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Map<String, Object> getClaims(){
        HashMap<String, Object> claims = new HashMap<>();

        claims.put("id",this.id);
        claims.put("userName", this.userName);
        claims.put("role", role);
        claims.put("MedicalRecord", this.MedicalRecord);
        claims.put("CivilId", this.civilId);
        claims.put("age", this.age);
        claims.put("Address", this.address);

        return claims;
    }
}