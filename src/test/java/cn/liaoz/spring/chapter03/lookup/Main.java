package cn.liaoz.spring.chapter03.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("chapter03_lookup.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}
}
