package kr.spring.ch19;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//자바 코드 기반 설정
@Configuration
public class SpringConfig {
	//@Bean 어노테이션을 명시함으로써 bean 객체 설정
	//메서드명이 빈의 이름이 됨 (여기선 worker가 빈의 이름)
	@Bean
	public Worker worker() {
		return new Worker();
	}
	
	@Bean
	public Executor executor() {
		return new Executor();
	}
	
}
