package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.bo.nurse.CreateNurseRequest;
import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface NurseService {
    List<NurseEntity> getAllNursesBasedOnFilter(Gender gender, Hours workingHours, String specialty);

    NurseEntity getNurseById(Long id);
    void createNurse(CreateNurseRequest createNurseReques);
}
