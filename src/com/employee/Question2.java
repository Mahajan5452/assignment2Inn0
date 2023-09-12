package com.employee;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question2 {
	public void printAllDepartment(List<Employee> employeeList) {
		Set<String> departments = employeeList.stream().map(employee -> employee.getDepartment())
				.collect(Collectors.toSet());
		System.out.println(departments);
	}

}
