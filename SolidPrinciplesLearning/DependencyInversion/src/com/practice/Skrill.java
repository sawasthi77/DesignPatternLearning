package com.practice;

public class Skrill implements IPayment{
    @Override
    public void paymentMethod() {
        System.out.println("Skrill as payment method");
    }
}
