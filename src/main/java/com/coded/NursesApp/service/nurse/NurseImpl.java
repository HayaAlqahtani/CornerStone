package com.coded.NursesApp.service.nurse;

import com.coded.NursesApp.bo.nurse.CreateNurseRequest;
import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.reposatriy.NurseRepository;
import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class NurseImpl implements NurseService {

    private final NurseRepository nurseRepository;

    public NurseImpl(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }


    @Override
    public List<NurseEntity> getAllNursesBasedOnFilter(Gender gender, Hours workingHours, String specialty) {
        return nurseRepository.findAll()
                .stream()
                .filter(nurse -> gender == null || nurse.getGender() == gender)
                .filter(nurse2 -> workingHours == null || nurse2.getWorkingHours() == workingHours)
                .filter(nurse3 -> specialty == null || Objects.equals(nurse3.getSpecialized(), specialty))
                .collect(Collectors.toList());
    }

    @Override
    public NurseEntity getNurseById(Long id) {
        return nurseRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public void createNurse(CreateNurseRequest createNurseRequest) {
        NurseEntity nurse = new NurseEntity();
        nurse.setName(createNurseRequest.getName());
        nurse.setAge(createNurseRequest.getAge());
        nurse.setWorkingHours(Hours.valueOf(createNurseRequest.getWorkingHours()));
        nurse.setSpecialized(createNurseRequest.getSpecialized());
        nurse.setRating(createNurseRequest.getRating());
        nurse.setGender(Gender.valueOf(createNurseRequest.getGender()));
        nurseRepository.save(nurse);
    }
}