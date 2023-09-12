package com.employee;

import java.util.List;

public class Question1 {
	

	    public static void printMaleFemaleData(List<Employee> employeeList) {
	        long maleCount = employeeList.stream()
	                .filter(employee -> employee.gender.equalsIgnoreCase("Male"))
	                .count();

	        long femaleCount = employeeList.stream()
	                .filter(employee -> employee.gender.equalsIgnoreCase("Female"))
	                .count();

	        System.out.println("Number of male employees: " + maleCount);
	        System.out.println("Number of female employees: " + femaleCount);
	    }
	

}
