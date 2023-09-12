package com.employee;
import java.util.Comparator;
import java.util.List;
public class Question4 {

	  public static void findHighestPaidEmployee(List<Employee> employeeList) {
	               System.out.println( (employeeList.stream()
	                .max(Comparator.comparingDouble(Employee::getSalary))).get().getSalary());
	    }
	}


