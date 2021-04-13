package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest2 {
	@Test
	public void testSubtraction() {
		int x = 20;
		int y = 15;
		int expectedResult = 5;
		int result = Calculation.subtraction(x, y);
		Assert.assertEquals(expectedResult, result);;
		System.out.println("Test 2");
	}
}
