package com.expanion.cgpa.calculator.data;

import java.util.HashMap;
import java.util.Map;

import com.expanion.cgpa.calculator.model.Subject;

public class CourcesData {

  public static Map<String, Subject> getData() {
    return data;
  }

  // courseName:[credits,teacherName,semester,...]
  private static Map<String, Subject> data = new HashMap<String, Subject>();

  static {

    data.put("DataStr", new Subject("DataStr", 5, 1));

    data.put("Net Prog", new Subject("Net Prog", 3, 1));

    data.put("Algorithms", new Subject("Algorithms", 4, 2));

    data.put("Discrete Maths", new Subject("Discrete Maths", 3, 2));

    data.put("Math 1", new Subject("Math 1", 2, 2));
  }



}
