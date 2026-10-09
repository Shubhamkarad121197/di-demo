package com.example.di_demo;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public void sendEmail(){
        System.out.println("Email sent Successfully");
    }
}
