package com.webcorestone.DMS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DmsApplication {

	public static void main(String[] args) {
		System.out.println("Main start..");
		SpringApplication.run(DmsApplication.class, args);
		System.out.println("end ");
	}

}
