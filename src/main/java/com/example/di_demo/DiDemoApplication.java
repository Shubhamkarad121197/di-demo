package com.example.di_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DiDemoApplication.class, args);
		EmailService emailService =
				new EmailService();

		EmailService springEmailService =
				context.getBean(EmailService.class);

		System.out.println(emailService == springEmailService);

		OrderService orderService=context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
