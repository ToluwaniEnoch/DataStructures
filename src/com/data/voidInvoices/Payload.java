package com.data.voidInvoices;

import java.lang.reflect.Field;

public class Payload {
    private String InvoiceNumber;

    private String status;

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    @Override
    public String toString() {
        return "Payload{" +
                "InvoiceNumber='" + InvoiceNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String toJson() {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                json.append("\"").append(fields[i].getName()).append("\":\"").append(fields[i].get(this)).append("\"");
            } catch (IllegalAccessException e) {
                e.printStackTrace(); // Handle the exception according to your needs
            }
            if (i < fields.length - 1) {
                json.append(",");
            }
        }
        json.append("}");
        return json.toString();
    }

    public void setInvoiceNumber(String invoiceNumber) {
        InvoiceNumber = invoiceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payload(String invoiceNumber, String status) {
        InvoiceNumber = invoiceNumber;
        this.status = status;
    }
}
