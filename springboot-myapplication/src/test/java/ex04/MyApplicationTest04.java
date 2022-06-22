package ex04;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex04.component.MyComponent;

@SpringBootTest // 대신 configuration에는 위처럼 지정해야하고 springbootconfiguration을 쓰면 굳이 안적어도 됨.
public class MyApplicationTest04 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
