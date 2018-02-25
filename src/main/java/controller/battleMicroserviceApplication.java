package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class battleMicroserviceApplication {

	@Autowired	
	public static void main(String[] args) {
		SpringApplication.run(battleMicroserviceApplication.class, args);
	}
}
