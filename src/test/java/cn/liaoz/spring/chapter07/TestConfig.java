package cn.liaoz.spring.chapter07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class TestConfig {
	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
}
