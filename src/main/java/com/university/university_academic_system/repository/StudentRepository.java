package com.university.university_academic_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.university_academic_system.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}