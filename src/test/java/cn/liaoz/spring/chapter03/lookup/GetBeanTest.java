package cn.liaoz.spring.chapter03.lookup;

public abstract class GetBeanTest {
	public void showMe() {
		getBean().showMe();
	}
	
	public abstract User getBean();
}
