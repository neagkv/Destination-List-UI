package com.dev.Spring_Angular_CRUD;

import com.dev.Spring_Angular_CRUD.domain.Destination;
import com.dev.Spring_Angular_CRUD.repository.DestinationRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringAngularCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularCrudApplication.class, args);
	}



	@Bean
	ApplicationRunner init(DestinationRepository repository) {
		return args -> {
			Stream.of("Boston", "Detroit", "Milwaukee", "New York", "Newark",
					"Cincinnati", "Philadelphia", "Chicago", "Atlanta").forEach(name -> {
				Destination destination = new Destination();
				destination.setName(name);
				repository.save(destination);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
