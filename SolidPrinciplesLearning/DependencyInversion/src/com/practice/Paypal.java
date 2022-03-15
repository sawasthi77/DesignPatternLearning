package com.practice;

public class Paypal implements IPayment{

    @Override
    public void paymentMethod() {
        System.out.println("Paypal as payment method");
    }
}
