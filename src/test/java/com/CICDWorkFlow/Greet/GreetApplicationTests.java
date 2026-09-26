package com.CICDWorkFlow.Greet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetApplicationTests {

	@Test
	void greetingTest() {
		Assertions.assertEquals("Hello World", "Wrong");
	}

}
