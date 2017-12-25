package cn.liaoz.spring.chapter06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter06Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/liaoz/spring/chapter06/chapter06.xml");
		UserManager um = (UserManager) ac.getBean("userManager");
		System.out.println(um);
	}

}
