package se.yrgo.main;

import java.util.List;

import se.yrgo.domain.Student;
import se.yrgo.service.StudentManagementImplementation;
import se.yrgo.service.StudentManagementService;

public class Main {
		
	public static void main(String[] args) {

		StudentManagementService service = new StudentManagementImplementation();
		
		List<Student> students = service.findAllStudents();
		for(Student s : students) {
			System.out.println(s);
		}
	}

}
