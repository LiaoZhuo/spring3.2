package cn.liaoz.spring.chapter06;

import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceBundleMain {

	public static void main(String[] args) {
		String[] configs = new String[] {"cn/liaoz/spring/chapter06/chapter06.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(configs);
		
		Object[] params = new Object[] {"John", new GregorianCalendar().getTime()};
		String str1 = ac.getMessage("test", params, Locale.US);
		String str2 = ac.getMessage("test", params, Locale.CHINA);
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
