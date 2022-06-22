package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Spirng Boot Test Integration 기반
 * Error: Spring Boot Test Integration(@SpringBootTest) 에서는 
 * @Configuration을 달고 있는 설정 클래스는 자동(스캔) 하지 못한다.
 */

//@SpringBootTest(classes={MyApplication.class})//명시 해도 되지만 보통은 안함.
@SpringBootTest // 대신 configuration에는 위처럼 지정해야하고 springbootconfiguration을 쓰면 굳이 안적어도 됨.
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
