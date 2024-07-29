package com.itwill.springboot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 기능 활성화.
//-> AuditingEntityListener를 사용할 수 있게 설정.
@SpringBootApplication
public class Springboot5Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot5Application.class, args);
	}

}
