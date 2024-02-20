package com.coded.NursesApp.service.user;

import com.coded.NursesApp.bo.patient.CreateUserDetails;
import com.coded.NursesApp.entity.UserEntity;
import com.coded.NursesApp.reposatriy.UserRepository;
import org.hibernate.engine.spi.Status;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(CreateUserDetails createUserDetails) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(createUserDetails.getUsername());
        userEntity.setCivilId(createUserDetails.getCivilId());
        userEntity.setAge(createUserDetails.getAge());
        userEntity.setMedicalRecord(createUserDetails.getMedicalRecord());
    }

    @Override
    public List<String> getAllusersWithStrongPassword() {
        return null;
    }


    @Override
    public List<String> getALlUsersWithStrongPassword() {
        return userRepository.findAll().stream()
                .filter(user -> user.getPassword().length() > 8)
                .map(UserEntity::getUsername)
                .collect(Collectors.toList());
    }

}

