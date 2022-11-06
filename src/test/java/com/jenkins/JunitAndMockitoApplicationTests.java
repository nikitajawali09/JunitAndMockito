package com.jenkins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.jenkins.impl.SomeBusinessDaoImp;
import com.jenkins.impl.SomeBusinessServiceImpl;

@SpringBootTest
class JunitAndMockitoApplicationTests {

//	@Test
//	void contextLoads() {
//		
//		
//	}
	
	@Test
	public void name() {
		SomeBusinessServiceImpl business = new SomeBusinessServiceImpl();
		
		String name= business.nameGiven();
		assertNotNull(name);
	}
	
	@Test
	public void cal() {
		SomeBusinessDaoImp business = new SomeBusinessDaoImp();
		int a = business.cal(10, 10);
		int expected = 20;
		assertEquals(expected, a);
	}

}
