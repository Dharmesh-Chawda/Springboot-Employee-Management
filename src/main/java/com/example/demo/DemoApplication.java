package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//	ProdDB pd;
	@Autowired
	DB db;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		pd = new ProdDB();
//		System.out.println(pd.getData());

	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println(db.getData());

	}
}
