package JUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculationTest {

	@Before
	public void beforeAnnotation() {
		System.out.println("Before Test");
	}
	
	@Test
	public void testAddition() {
		int a = 15;
		int b = 20;
		int expectedResult = 35;
		int result = Calculation.addition(a, b);
		Assert.assertEquals(expectedResult, result);;
		System.out.println("Test 1");
	}

/*	@Test
	public void testSubtraction() {
		int x = 20;
		int y = 15;
		int expectedResult = 5;
		int result = Calculation.subtraction(x, y);
		Assert.assertEquals(expectedResult, result);;
		System.out.println("Test 2");
	}*/

}
