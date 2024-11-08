package com.demo.poc.encapsulation.dates.models;

/**
 * El encapsulamiento consiste en proteger el estado (atributos) de un objeto de los demás. Esto se logra con los métodos getters y setters.
 * Como regla general, todas las variables de instancia deben ser privadas.
 */
public class Date {

  private Day day;
  private String month;
  private int year;

  public Date() {}

  public Date(Day day, String month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Day getDay() {
    return day;
  }

  public void setDay(Day day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "{"
        + "\"day\": {"
        + "\"description\": \"" + this.day.getName() + "\", "
        + "\"number\": \"" + this.day.getNumber() + "\""
        + "}, "
        + "\"month\": \"" + this.month + "\", "
        + "\"year\": \"" + this.year + "\""
        + "}";
  }

}