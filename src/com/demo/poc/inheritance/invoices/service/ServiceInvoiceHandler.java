package com.demo.poc.inheritance.invoices.service;

import com.demo.poc.inheritance.invoices.models.Invoice;
import com.demo.poc.inheritance.invoices.models.ServiceInvoice;

public class ServiceInvoiceHandler extends InvoiceHandler {

  @Override
  public void print(Invoice invoice) {
    ServiceInvoice serviceInvoice = (ServiceInvoice) invoice;

    String message = "Servicio: " + serviceInvoice.getServiceName() + "\n"
        + "Total: " + serviceInvoice.getTotalAmount();

    System.out.println(message);
  }

}