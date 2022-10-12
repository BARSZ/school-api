package com.informatics.firstspringproject.data.repository;

import com.informatics.firstspringproject.data.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
