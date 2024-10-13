package sample3;

// 의존성이 낮은 프로그램
// => factory 패턴 클래스 이용
public class HelloSpring {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		//MessageBean bean = factory.getBean("en");
		MessageBean bean = factory.getBean("kr");
		bean.sayHello();
	}
}
