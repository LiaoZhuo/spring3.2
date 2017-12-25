package cn.liaoz.spring.chapter06;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionDefaults;
import org.springframework.util.StringValueResolver;

public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private Set<String> obscenities;
	
	public ObscenityRemovingBeanFactoryPostProcessor() {
		this.obscenities = new HashSet<>();
	}
	
	public Set<String> getObscenities() {
		return obscenities;
	}

	public void setObscenities(Set<String> obscenities) {
		this.obscenities.clear();
		for (String obscenity : obscenities) {
			this.obscenities.add(obscenity);
		}
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanNames = beanFactory.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
			StringValueResolver valueResolver = new StringValueResolver() {
				
				@Override
				public String resolveStringValue(String strVal) {
					return isObscene(strVal) ? "******" : strVal;
				}
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
			visitor.visitBeanDefinition(bd);
		}
		
	}
	public boolean isObscene(Object value) {
		String potentialObscenity = value.toString().toUpperCase();
		return this.obscenities.contains(potentialObscenity);
	}
}
