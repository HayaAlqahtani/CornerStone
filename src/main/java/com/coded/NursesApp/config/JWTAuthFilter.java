package com.coded.NursesApp.config;

import com.coded.NursesApp.bo.customUserDetails.CustomUserDetails;
import com.coded.NursesApp.service.auth.CustomUserDetailsService;
import com.coded.NursesApp.util.exception.UserNotFoundException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import static com.coded.NursesApp.config.SecurityConfig.AUTH_PATH;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Configuration
public class JWTAuthFilter extends OncePerRequestFilter {

    private static final String BEARER = "Bearer ";

    private final JWTUtil jwtUtil;

    private final CustomUserDetailsService userDetailsService;

    public JWTAuthFilter(JWTUtil jwtUtil, CustomUserDetailsService userDetailsService) {
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        if(!request.getServletPath().equals(AUTH_PATH + "/login") && authorizationHeader != null && authorizationHeader.startsWith(BEARER)){
            String token = authorizationHeader.substring(7);
            if(jwtUtil.isTokenValid(token)){
                String usernmae = jwtUtil.getUsernameFromToken(token);
                if (usernmae == null){
                    throw new UserNotFoundException("user not found");
                }
                UserDetails userDetails = userDetailsService.loadUserByUsername(usernmae);

                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        filterChain.doFilter(request,response);
    }
}