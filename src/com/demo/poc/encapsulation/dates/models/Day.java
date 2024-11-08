package com.demo.poc.encapsulation.dates.models;

public class Day {

  private String name;
  private int number;

  public Day() {}

  public Day(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
