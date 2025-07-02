package com.telusko.SpingJDBCEx;

import com.telusko.SpingJDBCEx.Model.Students;
import com.telusko.SpingJDBCEx.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.security.Provider;
import java.util.List;

@SpringBootApplication
public class SpingJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpingJdbcExApplication.class, args);

		Students s = context.getBean(Students.class);
		s.setName("Kamlesh");
		s.setROllNo(1);
		s.setMarks(96.45f);

		StudentService ss=context.getBean(StudentService.class);

		ss.addStudent(s);

		List<Students> stud = StudentService.getStudents();
		System.out.println(stud);
	}



}
