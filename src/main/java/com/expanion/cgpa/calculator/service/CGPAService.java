package com.expanion.cgpa.calculator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.expanion.cgpa.calculator.data.CourcesData;
import com.expanion.cgpa.calculator.model.GetCoursesResponse;
import com.expanion.cgpa.calculator.model.Subject;

public class CGPAService {

  public List<GetCoursesResponse> getCouses(int semNumber) {
    
    List<GetCoursesResponse> response = new ArrayList<GetCoursesResponse>();
    for (Map.Entry<String, Subject> entry : CourcesData.getData().entrySet()) {
      if(semNumber == entry.getValue().getSemesterNumber()) {
        response.add(new GetCoursesResponse(entry.getValue().getSubName(), entry.getValue().getSubCredits()));
      }
    }
    return response;
  }

}
