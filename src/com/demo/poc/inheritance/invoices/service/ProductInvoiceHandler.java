package com.demo.poc.inheritance.invoices.service;

import com.demo.poc.inheritance.invoices.models.Invoice;
import com.demo.poc.inheritance.invoices.models.ProductInvoice;

public class ProductInvoiceHandler extends InvoiceHandler {

  @Override
  public void print(Invoice invoice) {
    ProductInvoice productInvoice = (ProductInvoice) invoice;

    String message = "";

    for (String product : productInvoice.getProducts()) {
      message += (product + ", ") ;
    }

    message = message + "\n"
        + "Total: " + productInvoice.getTotalAmount() + "\n"
        + "Fecha: " + productInvoice.getDate();

    System.out.println(message);
  }
}
