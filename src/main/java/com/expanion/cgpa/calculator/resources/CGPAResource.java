package com.expanion.cgpa.calculator.resources;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.expanion.cgpa.calculator.model.GetCoursesResponse;
import com.expanion.cgpa.calculator.service.CGPAService;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Singleton
@Path("/api")
public class CGPAResource {

  private CGPAService service = new CGPAService();
  
  @Timed
  @GET
  @Path("/server")
  public String server() {
      return "{\"response\":\"Expanion is great\"}";
  }
  
  @GET
  @Path("/courses")
  public List<GetCoursesResponse> getCourses(@QueryParam("semNumber") int semNumber) {
    
    return service.getCouses(semNumber);
  }
  
  
//  
//  APIs
//  1. getCourses:
//     GET
//     Input: Semster Number
//     Output:List<Subname, Sub credits>
//
//
//  2. calculateGPA
//     POST
//     Input List<Subname, Grade>
//     Output GPA
}
