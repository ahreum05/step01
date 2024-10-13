package sample2;

// 의존성이 낮은 프로그램
// => 다형성 이용
public class HelloSpring {
	public static void main(String[] args) {
		//MessageBean bean = new MessageBeanEn();
		MessageBean bean = new MessageBeanKr();
		bean.sayHello();
	}
}
