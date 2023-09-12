package com.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {

	public static void countEmployees(List<Employee> employeeList) {
		Map<String, Long> departmentCounts = employeeList.stream()
				.collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));

		departmentCounts.forEach((department, count) -> {
			System.out.println( department + ": " + count);
		});
	}

}
