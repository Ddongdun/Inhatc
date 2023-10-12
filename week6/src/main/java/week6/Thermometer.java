package week6;

import java.util.HashMap;
import java.util.Map;

public class Thermometer {
	private Map<String, Double> locationMap = new HashMap<>();
	//map에 저장하는 setter()
	public void setCelsius(String location, Double value) {
		locationMap.put(location, value);
	}
	
	//온도를 읽어오는 getter()
	public Double getCelsius(String location) {
		return locationMap.get(location);
	}
	
	//섭씨온도 => 화씨온도로 변환해서 읽어오기
	public Double getFahrenheit(String location) {
		Double celsius = getCelsius(location);
		if(celsius == null) {
			return null;
		}
		return celsius.doubleValue() * 1.8 + 32.0;
	}
}
