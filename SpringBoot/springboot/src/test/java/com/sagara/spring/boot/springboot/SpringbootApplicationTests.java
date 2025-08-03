package com.sagara.spring.boot.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class SpringbootApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		Service service = context.getBean(Service.class);
		service.save();
		
	}

}
