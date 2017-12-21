package cn.liaoz.spring.chapter01;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {
	@Test
	public void test1() {
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertNotNull(bean);
		System.out.println(bean.getTestStr());
	}
	
	@Test
	public void test2() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
	}
}
