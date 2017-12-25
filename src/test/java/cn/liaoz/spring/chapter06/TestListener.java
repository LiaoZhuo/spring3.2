package cn.liaoz.spring.chapter06;

import org.springframework.context.ApplicationListener;

public class TestListener implements ApplicationListener<TestEvent> {

	@Override
	public void onApplicationEvent(TestEvent event) {
		((TestEvent) event).printMsg();
	}

}
