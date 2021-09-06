package com.megakruk.springdatajpacourse;

import com.megakruk.springdatajpacourse.student.Student;
import com.megakruk.springdatajpacourse.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaCourseApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student maria = new Student(
					"Maria",
					"Smith",
					"maria@gmail.com",
					22
			);
			studentRepository.save(maria);
		};
	}
}
