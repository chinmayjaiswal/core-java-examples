package com.java.examples.v1ch4;

import java.time.LocalDate;
/*
 * This is example of how classes are written in java. Note datatypes, constructors and methods, access modifiers.
 */
public class Employee {

  // instance fields
  private String name;

  private double salary;

  private LocalDate hireDay;

  // constructor
  public Employee(String name, double salary, int year, int month, int day) {
    this.name = name;
    this.salary = salary;
    hireDay = LocalDate.of(year, month, day);
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public LocalDate getHireDay() {
    return hireDay;
  }

  public void setHireDay(LocalDate hireDay) {
    this.hireDay = hireDay;
  }

  public void raiseSalary(double byPercent) {
    double raise = salary * byPercent / 100;
    salary += raise;
  }
}
