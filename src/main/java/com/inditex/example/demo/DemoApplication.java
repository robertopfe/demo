package com.inditex.example.demo;

import com.inditex.example.demomodel.entity.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Iniciando");
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId( 2 );
		LOGGER.info("Iniciando " + productEntity.getId() );

		SpringApplication.run(DemoApplication.class, args);
	}

}
