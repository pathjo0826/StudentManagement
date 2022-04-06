package se.yrgo.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Gabriella Quintero
 */

@Entity
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String admissionYear;
	private String school;
	
	public Student() {}
	
	public Student(String firstName, String lastName, String admissionYear, String school) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.admissionYear = admissionYear;
		this.school = school;
	}
	
	// All getters and setters
	
	public int getId() {
		return id;
	}
	

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAdmissionYear() {
		return admissionYear;
	}
	
	public String getSchool() {
		return school;
	}
	
		
	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAdmissionYear(String admissionYear) {
		this.admissionYear = admissionYear;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	 /**
     * toString to print out information about student(s).
     */

	@Override
	public String toString() {
		return "Student: id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", admissionYear="
				+ admissionYear + ", school=" + school;
	}
	
	
	
}