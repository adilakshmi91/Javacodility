package com.test.javacode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRanksQ2 {

	public static void main(String[] args) {
		List<Student> rankList = new ArrayList<Student>();
		
		Student studentlist = new Student();
		studentlist.setStudentName("latha");
		studentlist.setStudentId(101);
		studentlist.setMarks(75);
		rankList.add(studentlist);

		Student studentlist1 = new Student();
		studentlist1.setStudentName("pallavi");
		studentlist1.setStudentId(103);
		studentlist1.setMarks(70);
		rankList.add(studentlist1);

		Student studentlist2 = new Student();
		studentlist2.setStudentName("james");
		studentlist2.setStudentId(106);
		studentlist2.setMarks(80);
		rankList.add(studentlist2);

		Collections.sort(rankList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return String.valueOf(o2.getMarks()).compareTo(String.valueOf(o1.getMarks()));
			}
		});

		for (int i = 0; i < rankList.size(); i++) {
			if (rankList.get(i) != null) {
				System.out.println("Student" + rankList.get(i).getStudentName() + "got" + (i + 1) + "Rank");
			}

		}

	}

}
