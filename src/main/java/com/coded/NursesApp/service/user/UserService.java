package com.coded.NursesApp.service.user;


import com.coded.NursesApp.bo.patient.CreateUserDetails;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    List<String> getALlUsersWithStrongPassword();

    void saveUser(CreateUserDetails createUserDetails);

    User getUserById(Long userId);
}


