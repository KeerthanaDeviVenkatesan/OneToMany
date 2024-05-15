package com.example.OneToMany.repo;

import com.example.OneToMany.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College,Long> {
}
