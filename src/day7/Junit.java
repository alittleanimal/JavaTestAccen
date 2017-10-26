package day7;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;

public class Junit {

	@Test
	public void testAdd() {
		JunitTest junitTest = new JunitTest();
		int x = junitTest.add(2, 4);
		assertEquals(6, x);
	}

	@Test
	public void testMinus() {
		JunitTest junitTest = new JunitTest();
		int x = junitTest.minus(4, 3);
		assertEquals(1, x);
	}

}
