package com.demo.poc.encapsulation.employees.models;

/**
 * El encapsulamiento consiste en proteger el estado (atributos) de un objeto de los demás. Esto se logra con los métodos getters y setters.
 * Como regla general, todas las variables de instancia deben ser privadas.
 */
public class Employee {

  private String name;
  private String position;
  private double salary;
  private String dni;
  private int merit;

  public Employee() {}

  public Employee(String name, String position, double salary, String dni) {
    this.name = name;
    this.position = position;
    this.salary = salary;
    this.dni = dni;
    this.merit = 0;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setMerit(int merit) {
    this.merit = merit;
  }

  public String getName() {
    return name;
  }

  public String getPosition() {
    return position;
  }

  public String getDni() {
    return this.dni;
  }

  public double getSalary() {
    return this.salary;
  }

  public int getMerit() {
    return this.merit;
  }

  @Override
  public String toString() {
    return "{" +
        "merit=" + merit +
        ", id=" + dni +
        ", salary=" + salary +
        '}';
  }
}
