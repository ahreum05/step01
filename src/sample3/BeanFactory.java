package sample3;
// 팩토리 패턴 클래스
// => 공장에서 물건을 찍어내듯이, 객체를 생성하는 기능의 클래스
public class BeanFactory {
	public MessageBean getBean(String beanName) {
		MessageBean bean = null;
		if(beanName.equals("kr")) {
			bean = new MessageBeanKr();
		} else if(beanName.equals("en")) {
			bean = new MessageBeanEn();
		}
		return bean;
	}
}
