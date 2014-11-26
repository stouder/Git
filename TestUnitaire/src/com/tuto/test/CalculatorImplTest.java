package com.tuto.test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.tuto.Calculator;
import com.tuto.CalculatorImpl;

public class CalculatorImplTest {

	@Test
	public void testAdd() {
		Calculator calc = new CalculatorImpl();
		
		int a,b,res;
		a = 5;
		b = 3;
		res = 8;
		
		assertTrue("a et b positif",calc.add(5,3)==res);
		
		
	}

}
