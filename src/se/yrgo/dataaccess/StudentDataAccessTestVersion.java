package se.yrgo.dataaccess;


import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import se.yrgo.domain.Student;

@Stateless
@Alternative
public class StudentDataAccessTestVersion implements StudentDataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertStudent(Student newStudent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudents() {
		Student stu1 = new Student("Gabriella", "Q", "2021", "Yrgo");
		Student stu2 = new Student("Oscar", "N", "2021", "Yrgo");
		Student stu3 = new Student("Patrik", "H", "2021", "Yrgo");
		
		List<Student> students = new ArrayList<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		return students;
	}

	@Override
	public List<Student> findStudentByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(int id, String admissionYear, String school) {
		// TODO Auto-generated method stub
		
	}

}