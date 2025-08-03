package com.sagara.spring.boot.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	Dao dao;
	
	@Autowired
	Service(Dao dao) {
		System.out.println("Service Created");
		this.dao =dao;
	}
	
	public void save() {
		dao.create();
		
	}

}
