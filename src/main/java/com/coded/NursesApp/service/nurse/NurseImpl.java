package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.reposatriy.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NurseImpl implements NurseService {

    @Autowired
    private NurseRepository nurses;

    @Override
    public List<NurseEntity> getAllNurses() {
        return nurses.findAll();
    }

    @Override
    public NurseEntity getNurseById(Long id) {
        Optional<NurseEntity> optionalNurse = nurses.findById(id);
        return optionalNurse.orElse(null);

    }

    @Override
    public boolean isNurseAvailableForBooking(Long nurseId) {
        Optional<NurseEntity> optionalNurse = nurses.findById(nurseId);

        if (optionalNurse.isPresent()) {
            NurseEntity nurse = optionalNurse.get();
            return nurse.isAvailable();
        }

        return false;
    }


    @Override
    public void updateNurseAvailability(Long nurseId, boolean available) {
        Optional<NurseEntity> optionalNurse = nurses.findById(nurseId);

        if (optionalNurse.isPresent()) {
            NurseEntity nurse = optionalNurse.get();
            nurse.setAvailable(available);
            nurses.save(nurse);
        }
    }
}