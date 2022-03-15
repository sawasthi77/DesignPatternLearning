package com.practice;

public class PaymentController {
    private IPayment iPayment;

    public PaymentController(){

    }

    public void setPaymentController(IPayment iPayment){
        this.iPayment = iPayment;
    }

    public void pay(){
        this.iPayment.paymentMethod();
    }
}
