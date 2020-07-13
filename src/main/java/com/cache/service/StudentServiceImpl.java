package com.cache.service;

import com.cache.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    @Cacheable(cacheNames = {"student"})
    public List<Student> findStudnts() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://192.168.206.183:3306/test?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String pcode = "root";

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, pcode);
        String sql  = "SELECT sname,sage,ssex FROM student";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        Student student;
        ArrayList<Student> students = new ArrayList<>();
        while (resultSet.next()){
            student = new Student();
            student.setSname(resultSet.getString(1));
            student.setSage(resultSet.getString(2));
            student.setSsex(resultSet.getString(3));
            students.add(student);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return students;
    }
}
