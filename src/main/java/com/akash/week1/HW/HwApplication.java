package com.akash.week1.HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HwApplication implements CommandLineRunner {
	@Autowired
	CakeBaker bkc;

	public static void main(String[] args) {
		SpringApplication.run(HwApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(bkc.BakeCake());
	}
}
