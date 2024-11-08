package com.demo.poc.inheritance.geometrics;

public class Triangle extends GeometricFigure {

  private double base;
  private double height;

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  double calculateArea() {
    return this.base * this.height / 2;
  }
}
