package by.gsu.winter20.spring_boot_demo;

import by.gsu.winter20.spring_boot_demo.context.TestInitializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(initializers = {TestInitializer.class})
class SpringBootDemoApplicationTests {


	@Test
	void contextLoads() {
	}

}
