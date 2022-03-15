package com.practice;

public class Payoneer implements IPayment{
    @Override
    public void paymentMethod() {
        System.out.println("Payoneer as payment method");
    }
}
