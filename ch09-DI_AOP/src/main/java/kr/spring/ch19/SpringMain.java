package kr.spring.ch19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//xml이 아니라 class를 설정파일로 이용함 그래서 컨테이너를 만드는 class가 달라짐
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//자바코드 기반 설정
		Executor executor = (Executor)context.getBean("executor");
		executor.addUnit();
		
		context.close();
		
	}
}
