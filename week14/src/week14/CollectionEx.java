package week14;

import java.util.ArrayList;
import java.util.*;

public class CollectionEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//ArrayList 생성
		int idx = 0;
		//for문 변수
		list.add("Java");
		//list에 Java 추가
		list.add("OOP");
		//list에 OOP 추가
		list.add("객체지향프로그래밍");
		//list에 객체지향프로그래밍 추가
		
		int size = list.size();
		//리스트에 추가된 원소 개수 저장
		System.out.println("리스트 총 개수 = " + size);
		//출력
		
		String item = list.get(2);
		//리스트의 2번 원소 저장
		System.out.println("리스트 2번 : " + item);
		//출력
		System.out.println();
		//줄바꿈
		
		for(String s: list) {
		//list의 원소들을 String 형태로 가져온다
			System.out.println(idx++ + " : " + s);
			//idx를 증가 시키며 출력
		}
		
		System.out.println();
		//줄바꿈
		
		list.remove(1);
		//list의 1번 원소를 지운다
		idx = 0;
		//for문 변수
		for(String s: list) {
		//list의 원소들을 String 형태로 가져온다
			System.out.println(idx++ + " : " + s);
			//idx로 증가 시키며 출력
		}
		
		System.out.println();
		//줄바꿈
		
		list.remove(1);
		//list의 1번 원소를 지운다
		idx = 0;
		//for문 변수
		for(String s: list) {
		//list의 원소들을 String 형태로 가져온다
			System.out.println(idx++ + " : " + s);
			//idx로 증가 시키며 출력
		}
		
		System.out.println("--- Map ----");
		//map
		Map<String, String> map = new HashMap<>();
		//키와 값을 String타입으로 저장하는 HashMap 생성
		map.put("name" , "홍길동");
		//map에 원소 추가
		map.put("gender", "남자");
		//map에 원소 추가
		map.put("id", "admin");
		//map에 원소 추가
		map.put("password", "1234");
		//map에 원소 추가
		for(String k : map.keySet()) {
		//keySet() : 키만 가져온다
			System.out.println(k + " = " + map.get(k));
			//키 값 출력
		}
		
		Set<String> keyset = map.keySet();
		//Set객체에 map의 key값 저장
		Iterator<String> keyIter = keyset.iterator();
		//keyset 객체에 따른 반복자 생성
		while(keyIter.hasNext()) {
		//반복자가 다음 요소를 가지고 있다면 계속 실행
			String k = keyIter.next();
			//반복자의 다음 요소를 저장하고 다음으로 이동
			System.out.println(k);
			//출력
		}
		
	}
}
