package com.employee;

import java.util.List;

public class Question9 {
   public void countinSalesDepat(List<Employee> employeeList) {
	   long male = employeeList.stream()
               .filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales And Marketing"))
               .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
               .count();

       long female = employeeList.stream()
               .filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales And Marketing"))
               .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
               .count();

       System.out.println("Number of male : " + male);
       System.out.println("Number of female : " + female);
}
}
