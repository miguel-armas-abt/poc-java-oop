package com.demo.poc.inheritance.geometrics;

/**
 * La herencia consiste en construir nuevas clases con el estado (atributos) y el comportamiento (métodos) heredados de clases ya existentes.
 * La herencia solo aplica para métodos y atributos públicos y protegidos.
 */
public abstract class GeometricFigure {

  abstract double calculateArea();

  void printMessage() {
    System.out.println("Hello world from GeometricFigure");
  }

}