package se.yrgo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.yrgo.dataaccess.StudentDataAccess;
import se.yrgo.domain.Student;

@Stateless
public class StudentManagementImplementation implements StudentManagementService {
	
	
	@Inject
	private StudentDataAccess dao;
		
	public void insertStudent(Student newStudent) {
		dao.insertStudent(newStudent);
	}

	@Override
	public List<Student> findAllStudents() {
	 return dao.findAllStudents();
		
	}

	@Override
	public List<Student> findStudentByLastName(String lastName) {
		return dao.findStudentByLastName(lastName);
	}
	
	@Override
	public Student findStudentById(int id) {
		return dao.findStudentById(id);
	}
	
	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}

	@Override
	public void updateStudent(int id, String admissionYear, String school) {
		dao.updateStudent(id, admissionYear, school);
		
	}


}