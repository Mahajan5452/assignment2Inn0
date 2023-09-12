package com.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {
	

	 public static void calculateAvgByDept(List<Employee> employeeList) {
		 Map<String, Double> departmentAverageSalaries = employeeList.stream()
	                .collect(Collectors.groupingBy(
	                		employee->employee.getDepartment(),
	                        Collectors.averagingDouble(employee->employee.getSalary())
	                ));

	        departmentAverageSalaries.forEach((department, avgSalary) -> {
	            System.out.println( department + ": " + avgSalary);
	        });

	 }
}
