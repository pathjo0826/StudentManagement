package se.yrgo.dataaccess;

import java.util.List;
import javax.ejb.Local;
import se.yrgo.domain.Student;

/**
 * This interface defines which methods the Data Access Layer (dao) implements.
 * @author Patrik Hjortberg
 *
 */
@Local
public interface StudentDataAccess {
	
	public void insertStudent(Student newStudent);
	public Student findStudentById(int id);
	public List<Student> findAllStudents();
	public List<Student> findStudentByLastName(String lastName);
	public void deleteStudent(int id);
	public void updateStudent(int id, String admissionYear, String school);
}
