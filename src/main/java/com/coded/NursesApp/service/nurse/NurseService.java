package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.entity.NurseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface NurseService {
    List<NurseEntity> getAllNurses();

    NurseEntity getNurseById(Long id);

    boolean isNurseAvailableForBooking(Long nurseId);

    void updateNurseAvailability(Long nurseId, boolean available);
}
