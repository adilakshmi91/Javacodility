package com.test.javacode;

import java.util.ArrayList;
import java.util.List;

public class StudentArraylistQ7 {

	public static void main(String[] args) {
		
		List<Student> studentList=new ArrayList<Student>();
		 for(int i=0; i<5; i++) {
			 Student student = new Student();
			 student.setStudentId(i);
			 student.setStudentName("Test" +i);
			 
			 student.setMarks(i*20);
			 studentList.add(student);
		 }
		 if(studentList.size() > 0) {
			 System.out.println(studentList.get(3).getStudentId());
			 System.out.println(studentList.get(4).getStudentName());
			 studentList.remove(studentList.get(2));
			 System.out.println(studentList.size());
			 
		 }
		

	}

}
