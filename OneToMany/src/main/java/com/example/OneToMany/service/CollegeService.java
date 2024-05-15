package com.example.OneToMany.service;

import com.example.OneToMany.entity.College;

import java.util.List;

public interface CollegeService {
    College saveCollege(College college);

    List<College> getAllCollege();

    College getCollegeById(Long college_id);

    College updateCollege(College college);
    void deleteCollege(Long college_id);
}
