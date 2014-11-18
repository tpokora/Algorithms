package org.algorithms.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTest {

	@Test
	public void testLinearSearchPass() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 }; 
		assertEquals("linearSearch returns index value of a search value" 
				+ "\nnumber 1 in table should return 2",
				2, linearSearch.linearSearch(table, 1));
	}
	
	@Test
	public void testLinearSearchNotFound() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 };
		assertEquals("linearSearch returns index value of a search value" 
				+ "\nnumber 10 is not in table should return -1",
				-1, linearSearch.linearSearch(table, 10));
	}
	
	@Test
	public void testBetterLinearSearchPass() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 }; 
		assertEquals("betterLinearSearch returns index value of a search value"
				+ " and stop the loop"
				+ "\nnumber 2 appears two times in table but first one has index 3" 
				+ "\nshould return 3",
				3, linearSearch.betterLinearSearch(table, 2));
	}
	
	@Test
	public void testBetterLinearSearchNotFound() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 };
		assertEquals("betterLinearSearch returns index value of a search value"
				+ " and stop the loop"
				+ "\nnumber 10 doesn't appear in table" 
				+ "\nshould return -1",
				-1, linearSearch.betterLinearSearch(table, 10));
	}
	
	@Test
	public void testLinearSearchWithSentinelPass() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 }; 
		assertEquals("testLinearSearchWithSentinel " 
				+ "returns index value of a search value" 
				+ "\nnumber 1 in table should return 2",
				2, linearSearch.linearSearchWithSentinel(table, 1));
	}
	
	@Test
	public void testLinearSearchWithSentinelLastPass() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 6 }; 
		assertEquals("testLinearSearchWithSentinel " 
				+ "returns index value of a search value"
				+ "\nnumber 6 is last in table should return 5",
				5, linearSearch.linearSearchWithSentinel(table, 6));
	}
	
	@Test
	public void testLinearSearchWithSentinelNotFound() {
		LinearSearch linearSearch = new LinearSearch();
		int[] table = { 3, 5, 1, 2, 3, 2 };
		assertEquals("testLinearSearchWithSentinel " 
				+ "returns index value of a search value" 
				+ "\nnumber 10 is not in table should return -1",
				-1, linearSearch.linearSearchWithSentinel(table, 10));
	}
	

}
