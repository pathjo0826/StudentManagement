package se.yrgo.rest;

import se.yrgo.domain.Student;
import se.yrgo.service.*;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author Gabriella Quintero
 */

@Stateless
@Path("/students")
public class StudentResource {

    @Inject
    private StudentManagementService service;

    /**
    *  This method is using GET and JSON format. 
    *  The method is a routing part that decides which HTTP verb we want to use. 
    *  We are retrieving data, so it is safe to repeat this so it uses @GET.
    *
    *  studentNo is the argument that is our path parameter and it is using annotation @PathParam. 
    */
    
    @GET
    @Produces("application/JSON")
    @Path("{studentNo}")
    public Student findStudentById(@PathParam("studentNo") int id) {
    	return service.findStudentById(id);
    }
    
    /*
    @GET
    @Produces("application/JSON")
    @Path("{lastName}")
    public List<Student> findStudentByLastName(@PathParam("lastName") String lastName) {
    	return service.findStudentByLastName(lastName);
    }
    */
    
    @GET
    @Produces("application/JSON")
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
    
    /**
     *  This method is using POST and JSON format. It is going to pass information about student across the server.
     *  It tells the server what the format of the information is.
     *  The method consumes JSON. To do that it needs @Produce and @Consume annotations.
     */
    
    @POST
    @Produces("application/JSON")
    @Consumes("application/JSON")
    public Student insertStudent(Student student) {
    	service.insertStudent(student);
    	return student;
    }
    
    @DELETE
    @Path("{studentNo}")
    public void deleteStudent(@PathParam("studentNo")int id) {
    	service.deleteStudent(id);
    }
    
    @PUT
    @Path("{studentNo}")
    @Produces("application/JSON")
    @Consumes("application/JSON")
    public void updateEmployee(@PathParam("studentNo") int id, Student student) {
    	service.updateStudent(id, student.getAdmissionYear(), student.getSchool());
    }
    
}
