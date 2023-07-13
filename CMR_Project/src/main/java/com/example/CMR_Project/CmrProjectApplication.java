package com.example.CMR_Project;

import com.example.CMR_Project.entity.Employee;
import com.example.CMR_Project.ripository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmrProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmrProjectApplication.class, args);
	}


}
