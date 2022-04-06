package se.yrgo.service;

import java.util.List;
import javax.ejb.Local;
import se.yrgo.domain.Student;

/**
 * This interface tells the data access object layer which methods it should implement.
 * @author Oscar Nordgren
 *
 */

@Local
public interface StudentManagementService {
	public void insertStudent(Student newStudent);
	public List<Student>findAllStudents();
	public List<Student>findStudentByLastName(String lastName);
	public Student findStudentById(int id);
	public void deleteStudent(int id);
	public void updateStudent(int id, String admissionYear, String school);
	
}
