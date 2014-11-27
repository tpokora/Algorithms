package org.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortingTest {
	
	private InsertionSorting sort = new InsertionSorting();
	private int[] unsortedTable = {4, 6, 2, 1, 5, 3};
	private int[] sortedTable = {1, 2, 3, 4, 5, 6};

	@Test
	public void testInsertionSorting() {
		assertArrayEquals(sortedTable, sort.insertionSorting(unsortedTable));
	}

}
