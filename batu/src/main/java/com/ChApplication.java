package com;

import org.flywaydb.core.Flyway;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.ch.dao")
public class ChApplication {

	@Bean(initMethod = "migrate")
	Flyway flyway() {
		Flyway flyway = new Flyway();
		flyway.setBaselineOnMigrate(true);
		flyway.setDataSource("jdbc:mysql://192.168.1.118:3306/batu?serverTimezone=GMT%2B8", "root", "root");
		return flyway;
	}

	public static void main(String[] args) {
		SpringApplication.run(ChApplication.class, args);
	}

}
