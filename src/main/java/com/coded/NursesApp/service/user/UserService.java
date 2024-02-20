package com.coded.NursesApp.service.user;


import com.coded.NursesApp.bo.patient.CreateUserDetails;

import java.util.List;

public interface UserService {


    List<String> getAllusersWithStrongPassword();


    List<String> getALlUsersWithStrongPassword();

    void saveUser(CreateUserDetails createUserDetails);
}


