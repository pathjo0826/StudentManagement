package se.yrgo.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import se.yrgo.domain.Student;

@Stateless
@Default
public class StudentDataAccessProdVersion implements StudentDataAccess {
	
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * This method uses an EntityManager to persist an object (Student) to the databaase.
	 * @param Student
	 * @throws nil
	 * @return void
	 */

	@Override
	public void insertStudent(Student newStudent) {
		em.persist(newStudent);
	}

	/**
	 * This method uses JPA SQL to find a specific Student in the database predicated on the ID input parameter.
	 *@param int student's id;
	 *@throws nil
	 *@return Student object
	 *@author Patrik Hjortberg
	 */
	
	@Override
	public Student findStudentById(int id) {
		Query q = em.createQuery("select student from Student as student where student.id = :id");
		q.setParameter("id", id);
		Student student = (Student)q.getSingleResult();
		return student;
	}
	
	/**
	 * This method uses JPA SQL to find all Students in the database.
	 * @param nil
	 * @throws nil
	 * @return List of Student objects
	 * @author Patrik Hjortberg
	 */

	@Override
	public List<Student> findAllStudents() {
		Query tq2 = em.createQuery("select student from Student as student");
		List<Student> students = tq2.getResultList();
		return students;
	}
	
	/**
	 * This method uses JPA SQL to find all Students in the database with a particular last name.
	 * @param String student's last name
	 * @throws nil
	 * @return List of Student objects
	 * @author Patrik Hjortberg
	 */

	@Override
	public List<Student> findStudentByLastName(String lastName) {
		TypedQuery<Student> tq3 = em.createQuery("select student from Student as student where student.lastName = :lastName", Student.class);
		tq3.setParameter("lastName", lastName);
		List<Student> students = tq3.getResultList();
		return students;
	}
	
	/**
	 * This method uses an EntityManager to delete an object (Student) from the databaase.
	 * @param int student's id
	 * @throws nil
	 * @return void
	 * @author Patrik Hjortberg
	 */
	
	@Override
	public void deleteStudent(int id) {
		Student student = findStudentById(id);
		em.remove(student);
	}

	/**
	 * This method takes in the id of the Student to be updated. Additionally it takes the two attributes of the Student that can be updated.
	 * Those are the admission year and school.
	 * @param int student's id, String student's admission year, String student's school
	 * @throws nil
	 * @return void
	 * @author Patrik Hjortberg
	 */
	
	@Override
	public void updateStudent(int id, String admissionYear, String school) {
		Student student = findStudentById(id);
		student.setSchool(school);
		student.setAdmissionYear(admissionYear);
		
	}
	
}