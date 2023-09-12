package com.employee;

import java.util.List;
import java.util.stream.Collectors;

public class Question3 {

	public void printAgesAverage(List<Employee> employeeList) {
		double avgMaleAge = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.averagingInt(employee_->employee_.getAge()));
		double avegFeamleAge = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
                .collect(Collectors.averagingInt(employee_->employee_.getAge()));
		System.out.println("male avg age"+avgMaleAge);
		System.out.println("Female Avg Age:"+avegFeamleAge);
	}
}
