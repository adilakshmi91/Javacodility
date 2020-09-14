package com.test.javacode;
import java.util.Map;
import java.util.TreeMap;

public class StudentInformationQ1 {

	public static void main(String[] args) {

      TreeMap<Integer,Student> studentMap=new TreeMap<Integer,Student>();
      Student student = new Student();
      student.setStudentName("lakshmi");
      student.setStudentId(1);
      studentMap.put(1,student);
      
      Student student1 = new Student();
      student1.setStudentName("kavya");
      student1.setStudentId(2);
      studentMap.put(2,student1);
       
      Student student2 = new Student();
      student2.setStudentName("dwitika");
      student2.setStudentId(3);
      studentMap.put(3,student2);
      
      Student student3 = new Student();
      student3.setStudentName("prasanna");
      student3.setStudentId(4);
      studentMap.put(4,student3);
      
      Student student4 = new Student();
      student4.setStudentName("krishna");
      student4.setStudentId(5);
      studentMap.put(5,student4);
      
       for(Student s : studentMap.values()) {
       
	    System.out.println(s.getStudentId() + s.getStudentName() );
	    }
	}
}
