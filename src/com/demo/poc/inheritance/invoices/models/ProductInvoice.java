package com.demo.poc.inheritance.invoices.models;

import java.util.List;

public class ProductInvoice extends Invoice {

  private List<String> products;

  public ProductInvoice(List<String> products, long invoiceNumber, double totalAmount, String date) {
    super(invoiceNumber, totalAmount, date);
    this.products = products;
  }

  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
  }
}
