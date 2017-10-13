package Assignment3.Part1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class calcRunTest2 {
	
	int a, b;
	calcRun obj;

	@Before
	public void setUp() throws Exception {
		a = 8;
		b = 4;
		obj = new calcRun();
		
	simpleCalc mockObj = mock(simpleCalc.class);
	when(mockObj.add(a, b)).thenReturn((double) (a+b));
	when(mockObj.subtract(a, b)).thenReturn((double) (a-b));
	when(mockObj.multiply(a, b)).thenReturn((double) (a*b));
	when(mockObj.divide(a, b)).thenReturn((double) (a/b));
	obj.setInterfaceObj( mockObj );
	}

	@After
	public void tearDown() throws Exception {
		a = 0;
		b = 0;
		obj = null;
	}

	@Test
	public void testAdd() {
		assertEquals( obj.add(a, b), 12, 0);
	}

	@Test
	public void testSubtract() {
		assertEquals( obj.subtract(a, b), 4, 0);
	}

	@Test
	public void testMultiply() {
		assertEquals( obj.multiply(a, b), 32, 0);
	}

	@Test
	public void testDivide() {
		assertEquals( obj.divide(a, b), 2, 0);
	}

}
