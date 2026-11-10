package com.iob.demo;

public class Loan {

    private final String id;
    private final String customer;
    private final String product;
    private final long amountInr;
    private final String status;

    public Loan(String id, String customer, String product, long amountInr, String status) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.amountInr = amountInr;
        this.status = status;
    }

    public String getId() { return id; }
    public String getCustomer() { return customer; }
    public String getProduct() { return product; }
    public long getAmountInr() { return amountInr; }
    public String getStatus() { return status; }
}
