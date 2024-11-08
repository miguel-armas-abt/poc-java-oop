package com.demo.poc.inheritance.invoices.models;

public class ServiceInvoice extends Invoice {

  private String serviceName;

  public ServiceInvoice(String serviceName, long invoiceNumber, double totalAmount, String date) {
    super(invoiceNumber, totalAmount, date);
    this.serviceName = serviceName;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }
}
