package com.test.javacode;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArraylistQ8 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		List<Employee> emplist = new ArrayList<Employee>();

		emp.setEmployeeName("shruthi");
		emp.setEmployeeId(101);

		emp1.setEmployeeName("shaham");
		emp1.setEmployeeId(102);

		emp2.setEmployeeName("shruthi");
		emp2.setEmployeeId(101);

		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp2);
		
		StringBuffer s = new StringBuffer();
		List<String> duplicates = new ArrayList<String>();
		Employee tempemployee = new Employee();
		
		for (Employee employee : emplist) {
			String validate = employee.getEmployeeId() + "/" + employee.getEmployeeName();
			if (!duplicates.isEmpty() && duplicates.contains(validate)) {
				System.out.println("Found Duplicate Value and list size " + emplist.size());
				tempemployee = employee;
			}
				s.append(employee.getEmployeeId()).append("/").append(employee.getEmployeeName());
				duplicates.add(s.toString());

		}
		if(tempemployee != null) {
			emplist.remove(tempemployee);
			System.out.println("List Size after remove duplicate " + emplist.size());
		}
		

	}

}
