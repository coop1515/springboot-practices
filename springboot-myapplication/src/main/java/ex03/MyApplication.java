package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
@ComponentScan //하위를 모두 스캔.
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){}
		
	}
}
