package cn.liaoz.spring.chapter04;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
				
	}
}
