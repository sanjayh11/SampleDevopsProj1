package devops.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import devops.src.WelcomeClass;

public class TestWelcomeClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testGreetings() {
		//fail("Not yet implemented"); // TODO
		
		WelcomeClass wc = new WelcomeClass();
		String greet = wc.greetings();
		assertEquals("Hello - welcome to devops", greet);
		//Hello - welcome to devops
	}

}
