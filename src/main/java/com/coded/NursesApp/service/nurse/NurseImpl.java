package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.entity.NursesInformation;
import com.coded.NursesApp.reposatriy.Nurses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NurseImpl implements NurseService {

    @Autowired
    private Nurses nurses;

    @Override
    public List<NursesInformation> getAllNurses() {
        return nurses.findAll();
    }

    @Override
    public NursesInformation getNurseById(Long id) {
        Optional<NursesInformation> optionalNurse = nurses.findById(id);
        return optionalNurse.orElse(null);

    }

    @Override
    public boolean isNurseAvailableForBooking(Long nurseId) {
        Optional<NursesInformation> optionalNurse = nurses.findById(nurseId);

        if (optionalNurse.isPresent()) {
            NursesInformation nurse = optionalNurse.get();
            return nurse.isAvailable();
        }

        return false;
    }


    @Override
    public void updateNurseAvailability(Long nurseId, boolean available) {
        Optional<NursesInformation> optionalNurse = nurses.findById(nurseId);

        if (optionalNurse.isPresent()) {
            NursesInformation nurse = optionalNurse.get();
            nurse.setAvailable(available);
            nurses.save(nurse);
        }
    }
}