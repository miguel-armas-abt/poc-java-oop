package com.demo.poc.encapsulation.employees;

import com.demo.poc.encapsulation.employees.models.Employee;
import com.demo.poc.encapsulation.employees.service.MeritIncreaseService;

/**
 * Caso de uso:  Mérito del empleado
 *
 * Reglas de negocio:
 * - Para promover a sus empleados, una compañía decide aumentar el salario en s/200 por cada 10 puntos de mérito acumulados.
 *
 * Criterios de aceptación:  La aplicación debe permitir incrementar el mérito de los empleados.
 */
public class Application {

  public static void main(String[] args) {
    MeritIncreaseService service = new MeritIncreaseService();
    Employee employee = new Employee("Linus Torvald", "Sofware developer", 3500, "76543210");

    for (int i=0; i < 22; i++) {
      employee = service.increaseMerit(employee);
      System.out.println(employee);
    }
  }


}
