package com.employee;

import java.util.List;
import java.util.Optional;

public class Question8 {
	public void  getYoungestEmpInPro(List<Employee> employeeList) {
              Optional<Employee> e = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("Product Development"))
                .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
              System.out.println(e);
    }

}
