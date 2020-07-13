package com.cache.controller;

import com.cache.Student;
import com.cache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/findStudents")
    public List<Student> findStudents() throws SQLException, ClassNotFoundException {

        return studentService.findStudnts();

    }
}
