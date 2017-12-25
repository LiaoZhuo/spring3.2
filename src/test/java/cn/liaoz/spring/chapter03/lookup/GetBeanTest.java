package cn.liaoz.spring.chapter03.lookup;

public abstract class GetBeanTest {
	public void showMe() {
		getBean().showMe();
		getBean().hello();
	}
	
	public abstract User getBean();
}
