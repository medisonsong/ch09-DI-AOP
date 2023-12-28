package kr.spring.ch11;

import java.util.Map;

public class ProtocolHandlerFactory {
	private Map<String,Object> map; // map이 프로퍼티 명

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ProtocolHandlerFactory [map=" + map + "]";
	}
	
}
