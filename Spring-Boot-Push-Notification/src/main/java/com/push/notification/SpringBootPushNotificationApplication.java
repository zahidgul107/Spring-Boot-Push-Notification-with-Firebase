package com.push.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPushNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPushNotificationApplication.class, args);
		System.err.println("My Push notification");
	}

}
