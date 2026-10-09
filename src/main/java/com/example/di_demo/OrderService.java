package com.example.di_demo;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final EmailService emailService;

    public OrderService(EmailService emailService){
        this.emailService=emailService;
    }

    public void placeOrder(){
        System.out.println("Order placed SuccessFully");

        emailService.sendEmail();
    }
}
