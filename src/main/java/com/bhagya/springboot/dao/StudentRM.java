package com.bhagya.springboot.dao;

import com.bhagya.springboot.hibernate.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class StudentRM implements RowMapper<Student> {
    /**
     * maps rows dfor stu
     * @param resultSet
     * @param i
     * @return St
     * @throws SQLException some issue
     */
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student stud = new Student();
        stud.setEmail(resultSet.getString(2));
        stud.setFirstName(resultSet.getString(3));
        return stud;
    }
}
