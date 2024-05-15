package com.example.OneToMany.repo;

import com.example.OneToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
