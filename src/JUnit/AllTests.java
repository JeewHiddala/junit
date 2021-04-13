package JUnit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculationTest.class, CalculationTest2.class })

//not working
public class AllTests {
	@Before
	public static void beforeClassAnnotation() {
		System.out.println("Test all classes");
	}
}
