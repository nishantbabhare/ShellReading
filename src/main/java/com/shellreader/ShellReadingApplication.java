package com.shellreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShellReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShellReadingApplication.class, args);
	}
	
//	@Scheduled(cron = "0 0/2 * * * ?")
//	public void run() {
//	    System.out.println("Current time is :: " + Calendar.getInstance().getTime());
//	}

}
