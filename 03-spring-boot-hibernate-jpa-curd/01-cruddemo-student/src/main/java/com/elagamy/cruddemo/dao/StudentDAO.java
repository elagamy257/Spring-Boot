package com.elagamy.cruddemo.dao;

import com.elagamy.cruddemo.entity.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StudentDAO {
    @Transactional
    void save(Student theStudent);
}
