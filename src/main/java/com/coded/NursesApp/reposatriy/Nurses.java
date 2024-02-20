package com.coded.NursesApp.reposatriy;

import com.coded.NursesApp.entity.NursesInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nurses extends JpaRepository<NursesInformation,Long>{
}
