package com.dio.santander.bankline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.dio.santander.bankline.api.controller.CorrentistaController;

@SpringBootApplication
public class BanklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanklineApiApplication.class, args);
	}

}
