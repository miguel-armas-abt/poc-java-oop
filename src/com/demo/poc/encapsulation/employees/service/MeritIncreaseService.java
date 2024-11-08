package com.demo.poc.encapsulation.employees.service;

import com.demo.poc.encapsulation.employees.models.Employee;

public class MeritIncreaseService {

  private static final int BONUS = 200;
  private static final int MERIT_LIMIT = 10;

  public Employee increaseMerit(Employee employee) {
    int merit = employee.getMerit();
    employee.setMerit(merit + 1);

    if(merit == MERIT_LIMIT) {
      double currentSalary = employee.getSalary();
      employee.setSalary(currentSalary + BONUS);
      employee.setMerit(0);
    }

    return employee;
  }
}
