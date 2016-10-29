package com.expanion.cgpa.calculator.model;


public class GetCoursesResponse {

  private String subName;
  
  private Integer subCreadits;
  
  public Integer getSubCreadits() {
    return subCreadits;
  }
  public String getSubName() {
    return subName;
  }
  public void setSubCreadits(Integer subCreadits) {
    this.subCreadits = subCreadits;
  }
  
  public void setSubName(String subName) {
    this.subName = subName;
  }
  
  public GetCoursesResponse(String subName, Integer subCreadits) {
    this.subCreadits = subCreadits;
    this.subName = subName;
  }
}
