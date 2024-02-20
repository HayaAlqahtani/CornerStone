package com.coded.NursesApp.reposatriy;

import com.coded.NursesApp.entity.NurseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity,Long>{
}
