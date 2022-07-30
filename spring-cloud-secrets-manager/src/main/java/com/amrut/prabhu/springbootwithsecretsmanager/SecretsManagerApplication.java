package com.amrut.prabhu.springbootwithsecretsmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SecretsManagerApplication {

	@Value("${property1}")
	private String property1;

	@Value("${property2}")
	private String property2;

	public static void main(String[] args) {
		SpringApplication.run(SecretsManagerApplication.class, args);
	}

	@EventListener(classes = { ApplicationReadyEvent.class })
	public void ready() {
		System.out.println("Fetched Property1 value ->  " + property1);
		System.out.println("Fetched Property2 value ->  " + property2);
	}
}
