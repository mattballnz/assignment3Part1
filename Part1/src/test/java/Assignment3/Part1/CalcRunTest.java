package Assignment3.Part1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CalcRunTest {
	calcRun calcObj;
	Integer a;
	Integer b;
	
	@Before
	public void setUp() throws Exception {
		calcObj = new calcRun();
		a = 20;
		b = 10;
	}

	@After
	public void tearDown() throws Exception {
		calcObj = null;
		a = 0;
		b = 0;
	}

	@Test
	public void testAdd() {
		assertEquals( calcObj.add( a, b ), 30, 0 );
	}

	@Test
	public void testSubtract() {
		
	}

	@Test
	public void testMultiply() {
		
	}

	@Test
	public void testDivide() {
		
	}

}
