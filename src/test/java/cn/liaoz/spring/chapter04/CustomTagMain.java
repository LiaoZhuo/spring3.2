package cn.liaoz.spring.chapter04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomTagMain {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("chapter04.xml");
		User user = (User) bf.getBean("testbean");
		System.out.println(user.getUsername() + "," + user.getEmail());
	}

}
