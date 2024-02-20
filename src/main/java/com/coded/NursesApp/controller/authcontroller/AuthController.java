package com.coded.NursesApp.controller.authcontroller;

import com.coded.NursesApp.bo.auth.AuthenticationResponse;
import com.coded.NursesApp.bo.auth.CreateLoginRequest;
import com.coded.NursesApp.bo.auth.CreateSignUpRequest;
import com.coded.NursesApp.bo.auth.LogOutResponce;
import com.coded.NursesApp.service.auth.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("signup")
    public ResponseEntity<String> createUser(@RequestBody CreateSignUpRequest createSignupRequest){
        try {
            authService.signup(createSignupRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body("created");
        }catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error");
        }
    }

    public ResponseEntity<AuthenticationResponse> login(@RequestBody CreateLoginRequest createLoginRequest){
        AuthenticationResponse responce= authService.login(createLoginRequest);
        HttpStatus status=HttpStatus.OK;
        if (responce==null){
            status=HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(responce,status);
    }
    @PostMapping("logout")
    public ResponseEntity<Void>logout(@RequestBody LogOutResponce logoutResponce){
        authService.logout(logoutResponce);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
