package com.bhagya.springboot;

import com.bhagya.springboot.annotation.User;
import com.bhagya.springboot.aop.CustomerBo;
import com.bhagya.springboot.hibernate.Article;
import com.bhagya.springboot.hibernate.Writer;
import com.bhagya.springboot.map.MapExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class ApplicationTests {
	@Test
	void filtertest() {
		JdbcTemplate template1 = Mockito.mock(JdbcTemplate.class);

	}
}
