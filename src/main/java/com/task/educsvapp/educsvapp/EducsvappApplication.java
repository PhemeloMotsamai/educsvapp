package com.task.educsvapp.educsvapp;

import com.task.educsvapp.educsvapp.service.SchoolsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class EducsvappApplication {

	public static SchoolsService schoolsService;
	public static void main(String[] args) throws IOException {


//		schoolsService.saveSchoolsData();

		SpringApplication.run(EducsvappApplication.class, args);




	}

}
