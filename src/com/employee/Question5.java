package com.employee;

import java.util.List;
import java.util.stream.Collectors;

public class Question5 {

	public static void getEmployeesJoinedAfter2015(List<Employee> employeeList) {
		List<String> eList = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015)
				.map(employee -> employee.getName()).collect(Collectors.toList());
		eList.forEach(employeeName -> System.out.println("Employee Name: " + employeeName));
	}
}
