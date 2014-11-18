package org.algorithms.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorialPass() {
		Factorial fact = new Factorial();
		assertEquals("factorial(5) should return 120", 120, fact.factorial(5));
	}
	
	@Test
	public void factorialWith0() {
		Factorial fact = new Factorial();
		assertEquals("factorial(0) should return 1", 1, fact.factorial(0));
	}
	
	@Test
	public void factorialLinearSearchPass() {
		Factorial fact = new Factorial();
		int[] table = {1, 5, 7, 2, 3 };
		assertEquals("factorialLinearSearch(2) should return 3",
				3, fact.factorialLinearSearch(table, 0, 2));
	}
	
	@Test
	public void factorialLinearSearchNotFound() {
		Factorial fact = new Factorial();
		int[] table = {1, 5, 7, 2, 3 };
		assertEquals("factorialLinearSearch(10) should return -1",
				-1, fact.factorialLinearSearch(table, 0, 10));
	}
	
	@Test
	public void factorialLinearSearchTableEmpty() {
		Factorial fact = new Factorial();
		int[] table = {};
		assertEquals("factorialLinearSearch(10) should return -1",
				-1, fact.factorialLinearSearch(table, 0, 10));
	}

}
