package cn.liaoz.spring.chapter07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@ContextConfiguration(classes=TestConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Tester {
	@Autowired
	TestBean bean2;
	@Test
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/liaoz/spring/chapter07/applicationContext.xml");
	
		TestBean bean = (TestBean) context.getBean("testBean");
		bean.test();
		
	}
	@Test
	public void test2() {
		bean2.test();
		System.out.println(bean2.getClass().getName());
	}
}
