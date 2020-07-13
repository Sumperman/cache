package com.cache.service;

import com.cache.Student;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    List<Student> findStudnts() throws SQLException, ClassNotFoundException;
}
