package de.example.springbootmongodbatlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class SpringbootMongodbAtlasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbAtlasApplication.class, args);
	}
}