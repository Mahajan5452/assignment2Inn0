package com.employee;

import java.util.List;
import java.util.stream.Collectors;

public class Question10 {
   public void avgsalary(List<Employee> employees) {
	double maleAvg=  employees.stream().filter(employee->employee.getGender()
			.equalsIgnoreCase("Male"))
	.collect(Collectors.averagingDouble(employee->employee.getSalary()));
	double femaleAvg=  employees.stream().filter(employee->employee.getGender()
			.equalsIgnoreCase("female"))
	.collect(Collectors.averagingDouble(employee->employee.getSalary()));
	
	System.out.println("MaleAvg :"+maleAvg+"\nFemaleAvg :"+femaleAvg);
}
}
