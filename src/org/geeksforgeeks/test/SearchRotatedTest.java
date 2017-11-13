package org.geeksforgeeks.test;

import static org.junit.Assert.*;

import org.geeksforgeeks.main.SearchRotated;
import org.junit.Test;

public class SearchRotatedTest {

	@Test
	public void test() {
		SearchRotated test1 = new SearchRotated();
		assertEquals( 8, test1.searchRotated( new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3 ));
		SearchRotated test2 = new SearchRotated();
		assertEquals( 4, test2.searchRotated( new int[]{5, 6, 7, 1, 2, 3}, 2 ));
	}

}
