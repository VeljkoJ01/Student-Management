package com.example.StudentManagement;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		//Student student1 = new Student("Veljko", "Jovanovic", "veljkojovanovic088@gmail.com");
		//studentRepository.save(student1);

	//	Student student2 = new Student("Bogdan", "Jovanovic", "bogdanjovanovic@gmail.com");
	//	studentRepository.save(student2);

	//	Student student3 = new Student("Aleksandar", "Jovanovic", "aleksandarjovanovic@gmail.com");
	//	studentRepository.save(student3);
	}


}
