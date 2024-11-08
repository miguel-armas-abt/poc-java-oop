package com.demo.poc.inheritance.invoices.service;

import com.demo.poc.inheritance.invoices.models.Invoice;

public abstract class InvoiceHandler {

  abstract void print(Invoice invoice);

  public void printDefault(Invoice invoice) {
    long invoiceNumber = invoice.getInvoiceNumber();
    double totalAmount = invoice.getTotalAmount();
    System.out.println("Default: La factura " + invoiceNumber + " tiene un monto de " + totalAmount);
  }
}
