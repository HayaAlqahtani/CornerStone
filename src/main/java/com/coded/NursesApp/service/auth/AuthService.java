package com.coded.NursesApp.service.auth;

import com.coded.NursesApp.bo.auth.AuthenticationResponse;
import com.coded.NursesApp.bo.auth.CreateLoginRequest;
import com.coded.NursesApp.bo.auth.CreateSignUpRequest;
import com.coded.NursesApp.bo.auth.LogOutResponce;

public interface AuthService {
    void signup(CreateSignUpRequest createSignupRequest);
    AuthenticationResponse login(CreateLoginRequest createLoginRequest);
    void logout(LogOutResponce logoutResponce);
}
