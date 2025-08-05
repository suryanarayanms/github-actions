package com.prep.prep;

import com.prep.prep.playarea.UnpredictableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.prep.prep")
public class PrepApplication {

	@Autowired
	public UnpredictableService unpredictableService;

	public static void main(String[] args) {
		SpringApplication.run(PrepApplication.class, args);
	}

	public void run(String... args) {
		unpredictableService.unpredicatable();
	}

}
