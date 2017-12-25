package cn.liaoz.spring.chapter06;

import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class SimplePostProcessor implements BeanFactoryPostProcessor {
	private Set<String> obscenities;
	
	
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	}

}
