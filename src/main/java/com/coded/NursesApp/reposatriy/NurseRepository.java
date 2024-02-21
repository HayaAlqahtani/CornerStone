package com.coded.NursesApp.reposatriy;

import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.util.enums.Gender;
import com.coded.NursesApp.util.enums.Hours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity,Long>{
    List<NurseEntity> findBySpecialized(String specialty);
    @Query(value = "SELECT * FROM nurse r where r.gender = :gender",nativeQuery = true)
    List<NurseEntity> findByGender(String gender);

    @Query(value = "SELECT * FROM nurse r where r.Working_Hours = :workingHours",nativeQuery = true)
    List<NurseEntity> findByWorkingHours(String workingHours);

}

