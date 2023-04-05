package de.example.springbootmongodbatlas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMongodbAtlasApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void returnTrue() {
		assertEquals("true", "true");
	}

}
