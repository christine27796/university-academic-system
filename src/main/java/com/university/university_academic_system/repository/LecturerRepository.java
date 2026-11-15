package com.university.university_academic_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.university_academic_system.model.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

}