package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/*
 * @SpringBootApplication 메타 annotation
 * 
 * + @SpirngBootConfiguration : cf. @Configration ex01, ex02 참고
 * + @ComponentScan : 하위 패키지 스캐닝을 한다. ex03 참고.
 * + @EnableAutoConfiguration :
 * 		1. MVC, AOP, Security, JPA 등을 자동 "디폴트"(미세 설정 필수) 설정
 * 		2. 발견된 Dependency(Library) 기반으로 설정한다.
 */

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){}
		
	}
}
