package day7;

import static org.junit.Assert.*;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class JunitTest2 {

	private JunitTest1 junitTest1;
	@Before
	public void setUp(){
		junitTest1 = new JunitTest1();
	}
	
	@Test
	public void testDivide() {
//		Double double1=new Double(2);
//		assertTrue(double1.compareTo(junitTest1.divide(4, 2))==0);
		try {
			junitTest1.divide(4, 0);
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("error", e.getMessage());
		}
		
		Assert.assertEquals(2.0, junitTest1.divide(4, 2));
		
	}

}
