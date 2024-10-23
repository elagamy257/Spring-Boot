package com.elagamy.cruddemo.dao;

import com.elagamy.cruddemo.entity.Student;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentDAO {
    @Transactional
    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
