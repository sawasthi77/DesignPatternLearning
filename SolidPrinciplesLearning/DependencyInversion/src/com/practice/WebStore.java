package com.practice;

public class WebStore {

    private PaymentController paymentController;

    public WebStore(){
        paymentController = new PaymentController();
        paymentController.setPaymentController(new Paypal());
    }

    public void pay(){
        this.paymentController.pay();
    }
}
