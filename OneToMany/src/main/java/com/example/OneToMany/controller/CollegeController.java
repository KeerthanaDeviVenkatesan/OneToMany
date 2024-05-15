package com.example.OneToMany.controller;


import com.example.OneToMany.entity.College;
import com.example.OneToMany.service.Impl.CollegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OneToMany")
public class CollegeController {
    @Autowired
    CollegeServiceImpl collegeServiceIml;

    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeServiceIml.saveCollege(college);
    }


    @GetMapping("/collegeById/{college_id}")
    public College getCollegeById(@PathVariable Long college_id) {
        return collegeServiceIml.getCollegeById(college_id);
    }

    @GetMapping("/allColleges")
    public List<College> getAllCollege() {
        return collegeServiceIml.getAllCollege();
    }

    @PutMapping("/{college_id}")
    public College updateCollege(@PathVariable Long college_id, @RequestBody College college) {
        college.setCollege_id(college_id);
        return collegeServiceIml.updateCollege(college);
    }

    @DeleteMapping("/{college_id}")
    public void deleteCollege(@PathVariable Long college_id) {
        collegeServiceIml.deleteCollege(college_id);
    }
}
