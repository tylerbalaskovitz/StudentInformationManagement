package com.revature.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {

		return args -> {
			Student mariam = new Student(
					1L,
					"Mariam",
					"Mariam.Jamal@gmail.com",
					LocalDate.of(2000, Month.MAY, 15)
			);

			Student alex = new Student(
					1L,
					"Alex",
					"Alex.Jones@gmail.com",
					LocalDate.of(2000, Month.MAY, 15)

			);

			repository.saveAll(List.of(mariam, alex));

		};
	}

}
