package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.service.StudService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(DemoApplication.class, args);

		Student s = con.getBean(Student.class);
		s.setAge(21);
		s.setSex("M");
		s.setStd(10);

		StudService service = con.getBean(StudService.class);
		service.add(s);
		List<Student> students = service.fetch();
		System.out.println(students);

	}

}
