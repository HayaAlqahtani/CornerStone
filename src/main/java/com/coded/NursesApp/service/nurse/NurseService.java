package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.entity.NursesInformation;


import java.util.List;

public interface NurseService {
    List<NursesInformation> getAllNurses();

    NursesInformation getNurseById(Long id);

    boolean isNurseAvailableForBooking(Long nurseId);

    void updateNurseAvailability(Long nurseId, boolean available);
}
