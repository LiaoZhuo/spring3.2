package cn.liaoz.spring.chapter03.replacemethod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("chapter03_replacemethod.xml");

		TestChangeMethod method = (TestChangeMethod) bf.getBean("testChangeMethod");
		method.changeMe();
	}

}
