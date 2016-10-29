package com.expanion.cgpa.calculator.model;

public class Subject {

  private String subName;
  private Integer subCredits;
  private String teacherName;
  private int semesterNumber;

  public Integer getSubCredits() {
    return subCredits;
  }

  public String getSubName() {
    return subName;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setSubCredits(Integer subCredits) {
    this.subCredits = subCredits;
  }

  public void setSubName(String subName) {
    this.subName = subName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  public int getSemesterNumber() {
    return semesterNumber;
  }
  public void setSemesterNumber(int semesterNumber) {
    this.semesterNumber = semesterNumber;
  }
  

  public Subject(String subName, Integer subCredits, int semesterNumber) {
    this.subCredits = subCredits;
    this.subName = subName;
    this.semesterNumber = semesterNumber;
  }
}
