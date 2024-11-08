package com.demo.poc.encapsulation.dates;

import com.demo.poc.encapsulation.dates.models.Date;
import com.demo.poc.encapsulation.dates.service.DateFormatterService;

/**
 * Caso de uso: Formatear la fecha
 * 
 * Reglas de negocio: 
 * - El usuario brindará la fecha en formato YYYYMMDD. Ej. 20240908.
 * - La aplicación debe devolver la fecha formateada. Ej. Mié 9 Octubre 2024.
 *
 * Criterios de aceptación:  La aplicación debe mostrar la fecha formateada.
 */
public class Application {

  public static void main(String[] args) {
    DateFormatterService formatterService = new DateFormatterService();
    Date date = formatterService.mapDate("20241009");
    System.out.println(date);
  }
}
