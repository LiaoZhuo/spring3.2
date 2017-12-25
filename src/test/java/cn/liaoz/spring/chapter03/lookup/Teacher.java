package cn.liaoz.spring.chapter03.lookup;

public class Teacher extends User {
	@Override
	public void showMe() {
		System.out.println("I am teacher");
	}
	public void hello() {
		System.out.println("hello teacher");
	}
}
