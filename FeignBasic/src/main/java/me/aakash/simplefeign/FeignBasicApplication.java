package me.aakash.simplefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignBasicApplication.class, args);
	}

}
