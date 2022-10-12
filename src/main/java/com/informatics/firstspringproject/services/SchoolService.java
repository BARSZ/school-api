package com.informatics.firstspringproject.services;

import com.informatics.firstspringproject.data.entity.School;
import com.informatics.firstspringproject.data.entity.Teacher;

import java.util.List;

public interface SchoolService {
    List<School> getSchools();

    School getSchool(long id);

    School create(School school);

    School updateSchool(long id, School school);

    void deleteSchool(long id);

    List<School> getSchoolsByMaxNumberOfStudents(int maxNumberOfStudents);

    List<School> getSchoolsByName(String name);

    List<School> getSchoolsByNameAndMaxNumberOfStudents(String name, int maxstudents);

    List<School> getAllHighSchools();

    List<Teacher> getAllTeachersBySchoolId(long id);
}
