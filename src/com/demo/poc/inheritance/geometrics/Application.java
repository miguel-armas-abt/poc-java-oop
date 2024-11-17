package com.demo.poc.inheritance.geometrics;

/**
 * Caso de uso:  Figuras geométricas
 */
public class Application {

  public static void main(String[] args) {
    Square square = new Square();
    square.setLength(2);

    double squareAreaResult = square.calculateArea();
    System.out.println("El area del cuadrado es: " + squareAreaResult);

    square.printMessage();

    System.out.println("########################");

    Triangle triangle = new Triangle();
    triangle.setBase(10);
    triangle.setHeight(5);

    double triangleAreaResult = triangle.calculateArea();
    System.out.println("El area del triángulo es: " + triangleAreaResult);

    triangle.printMessage();
  }
}