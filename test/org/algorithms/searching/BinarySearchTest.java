package org.algorithms.searching;

import static org.junit.Assert.*;

import org.algorithms.recursion.RecurentBinarySearch;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {
	private BinarySearch search;
	private RecurentBinarySearch rsearch;
	private int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	@Before
	public void setUp() throws Exception {
		search = new BinarySearch();
		rsearch = new RecurentBinarySearch();
	}

	@Test
	public void testBinearySearch() {
		assertEquals("binearySearch(16) should return 15",
				15, search.binearySearch(table, 16));
	}
	
	@Test
	public void testBinearySearchNotFound() {
		assertEquals("binearySearch(34) should return -1",
				-1, search.binearySearch(table, 34));
	}
	
	@Test
	public void testBinearySearchValueAtFirstIndex() {
		assertEquals("binearySearch(1) should return 0",
				0, search.binearySearch(table, 1));
	}
	
	@Test
	public void testBinearySearchValueAtLastIndex() {
		assertEquals("binearySearch(20) should return 19",
				19, search.binearySearch(table, 20));
	}
	
	
    @Test
    public void testRecurentBinearySearch() {
    	assertEquals("recurentBinearySearch(16) should return 15",
    			15, rsearch.recurentBinarySearch(table, 0, table.length - 1, 16));
    }
    
    @Test
    public void testRecurentBinearySearchNotFound() {
    	assertEquals("recurentBinearySearch(34) should return -1",
    			-1, rsearch.recurentBinarySearch(table, 0, table.length - 1, 34));
    }
    
    @Test
    public void testRecurentBinearySearchValueAtFirstIndex() {
    	assertEquals("recurentBinearySearch(1) should return 0",
    			0, rsearch.recurentBinarySearch(table, 0, table.length - 1, 1));
    }
    
    @Test
    public void testRecurentBinearySearchValueAtLastIndex() {
    	assertEquals("recurentBinearySearch(20) should return 19",
    			19, rsearch.recurentBinarySearch(table, 0, table.length - 1, 20));
    }

}
