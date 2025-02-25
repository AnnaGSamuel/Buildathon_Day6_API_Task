package com.example.StudentResultPublisher.Repository;

import com.example.StudentResultPublisher.Models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Students, Long> {
}
