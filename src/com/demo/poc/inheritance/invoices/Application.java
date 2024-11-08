package com.demo.poc.inheritance.invoices;

import com.demo.poc.inheritance.invoices.models.ProductInvoice;
import com.demo.poc.inheritance.invoices.models.ServiceInvoice;
import com.demo.poc.inheritance.invoices.service.ProductInvoiceHandler;
import com.demo.poc.inheritance.invoices.service.ServiceInvoiceHandler;
import java.util.List;

/**
 * Caso de uso: Facturas
 *
 * Reglas de negocio:
 * - Una compañía maneja dos tipos de facturas; facturas de los productos que vende y facturas por los servicios que ofrece.
 *
 * Criterios de aceptación:  La aplicación debe permitir imprimir ambos tipos de facturas.
 */
public class Application {

  public static void main(String[] args) {
    ProductInvoice productInvoice = new ProductInvoice(List.of("Ipad", "Monitor"), 2L, 1650, "07/11/24");
    ProductInvoiceHandler productInvoiceHandler = new ProductInvoiceHandler();
    productInvoiceHandler.print(productInvoice);
    productInvoiceHandler.printDefault(productInvoice);

    System.out.println("######");

    ServiceInvoice serviceInvoice = new ServiceInvoice("Transporte", 1L, 150, "08/11/24");
    ServiceInvoiceHandler serviceInvoiceHandler = new ServiceInvoiceHandler();
    serviceInvoiceHandler.print(serviceInvoice);
    serviceInvoiceHandler.printDefault(serviceInvoice);
  }
}
