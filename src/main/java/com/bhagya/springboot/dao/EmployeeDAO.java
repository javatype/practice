package com.bhagya.springboot.dao;

import com.bhagya.springboot.hibernate.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  class EmployeeDAO {

    private final JdbcTemplate jdbcTemplate;
    private final StudentRM roowmapper;

    @Autowired
    public EmployeeDAO(JdbcTemplate jdbcTemplate, StudentRM roowmapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.roowmapper = roowmapper;

    }

    public int  getCount(){
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM student", Integer.class);
    }

    public List<Student> getAll(){
        return jdbcTemplate.query(
                "SELECT * FROM student", roowmapper);
    }
}
