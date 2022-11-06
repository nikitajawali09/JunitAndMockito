package com.jenkins.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessDaoImpTest {
	
	
	@Test
	public void cal() {
		SomeBusinessDaoImp business = new SomeBusinessDaoImp();
		int a = business.cal(10, 10);
		int expected = 20;
		assertEquals(expected, a);
	}
	
	

}
