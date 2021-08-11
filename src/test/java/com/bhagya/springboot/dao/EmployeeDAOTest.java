package com.bhagya.springboot.dao;

import com.bhagya.springboot.hibernate.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

class EmployeeDAOTest {
@BeforeEach
public void seetupEch(){
    System.out.println("before..");
}

    @AfterEach
    public void tearDown(){
        System.out.println("after..");
    }
    @Test
    void getCountTest(){
        System.out.println("running test..");
        JdbcTemplate template1 = Mockito.mock(JdbcTemplate.class);
        StudentRM rm = Mockito.mock(StudentRM.class);
        Mockito.when(template1.queryForObject("SELECT COUNT(*) FROM student",Integer.class)).thenReturn(2);
       EmployeeDAO dao = new EmployeeDAO(template1, rm);
        Assert.assertEquals(2 ,dao.getCount());
    }
}