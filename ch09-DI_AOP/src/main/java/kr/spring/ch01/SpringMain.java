package kr.spring.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		/*
		 * applicationContext.xml 설정파일을 읽어들여 스프링 컨테이너를 생성
		 */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // 컨테이너 생성
		
		//객체를 컨테이너로부터 읽어들임
		MessageBean messageBean = (MessageBean)context.getBean("messageBean"); //getBean이 messageBean을 찾고 messageBean의 주소를 찾아 호출 및 접근함
		messageBean.sayHello("홍길동");
		
		//애플리케이션 종료시 컨테이너에 존재하는 모든 빈(객체)를 종료 /자원정리와 똑같음
		context.close();
	}
}
