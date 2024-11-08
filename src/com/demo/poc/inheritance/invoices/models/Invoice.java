package com.demo.poc.inheritance.invoices.models;

public abstract class Invoice {

  protected long invoiceNumber;
  protected double totalAmount;
  protected String date;

  public Invoice() {}

  public Invoice(long invoiceNumber, double totalAmount, String date) {
    this.invoiceNumber = invoiceNumber;
    this.totalAmount = totalAmount;
    this.date = date;
  }

  public long getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(long invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}
