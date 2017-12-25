package cn.liaoz.spring.chapter06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/liaoz/spring/chapter06/chapter06.xml");
		TestEvent event = new TestEvent("hello", "123");
		ac.publishEvent(event);
	}

}
