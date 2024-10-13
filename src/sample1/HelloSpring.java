package sample1;

// 의존성이 높은 프로그램
public class HelloSpring {
	public static void main(String[] args) {
		//MessageBeanEn beanEn = new MessageBeanEn();
		//beanEn.sayHello();
		
		// 한글 출력
		MessageBeanKr beanKr = new MessageBeanKr();
		beanKr.tellMe();
	}
}
