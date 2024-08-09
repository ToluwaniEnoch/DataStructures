package com.data.functionalProgramming.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Mary", "235890723636");
        greetCustomer(customer);

        //consumer accepts one argument but returns nothing
        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerV2.accept(customer, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " +
                    customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    //bi-consumer accepts two inputs and returns nothing
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " +
                    customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello " +
                customer.customerName
                + ", thanks for registering phone number "
        + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
