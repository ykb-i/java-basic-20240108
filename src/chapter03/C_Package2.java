package chapter03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class C_Package2 {

	public static void main(String[] args) {
		
		// Collection Framework: Java에서 데이터 구조에 대한 표준화된 기법을 제공
		
		// List: 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
		// Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정, 참조형 데이터 타입만 지정 가능
		List<Integer> list;
		
		// ArrayList 구현 클래스: 인덱스를 이용한 작업을 수행할 때 유리
		list = new ArrayList<>();
		// LinkedList 구현 클래스: 데이터 추가, 삭제 작업을 수행할 때 유리
		list = new LinkedList<>();
		
		// add(): List에 요소를 추가
		// 추가할 요소는 제너릭으로 지정한 데이터 타입의 요소이어야 함
		list.add(10);
		// list.add("10");
		System.out.println(list);
		
		list.add(20);
		System.out.println(list);
		
		// get(): List의 특정 인덱스 요소를 가져옴
		// List의 인덱스 범위를 초과하지 않도록 주의
		// 기본형 데이터 타입의 변수로 리스트의 요소를 받을 땐 null이 올 수 있음을 주의
		Integer integer = list.get(0);
		System.out.println(integer);
		
		// set(): List의 특정 인덱스 요소를 변경
		// List 인덱스를 범위를 벗어난 인덱스를 지정할 수 없음
		list.set(1, -20);
		System.out.println(list);
		
		// remove(): List의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		
		List<String> fruitsList = new ArrayList<>();
		fruitsList.add("사과");
		fruitsList.add("바나나");
		fruitsList.add("카카오");
		System.out.println(fruitsList);
		
		fruitsList.remove("바나나");
		System.out.println(fruitsList);
		
		// size(): List의 크기를 반환
		System.out.println(list.size());
		
		// int[][] -> List<List<Integer>>
		
		// Set: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조
		Set<String> set;
		
		// HashSet 구현 클래스: 검색이 빠름
		set = new HashSet<>();
		// TreeSet 구현 클래스: 요소를 정렬해서 추가
		set = new TreeSet<>();
		
		// add(): Set에 요소를 추가, 만약 동일한 요소가 존재한다면 추가하지 않음
		set.add("banana");
		System.out.println(set);
		set.add("apple");
		System.out.println(set);
		set.add("banana");
		System.out.println(set);
		
		// contains(): Set에 특정 요소가 존재하는지 확인
		System.out.println(set.contains("banana"));
		
		// remove(): Set에 특정 요소를 제거
		set.remove("banana");
		System.out.println(set);
		
		// List와 Set을 적절히 사용하면 List의 중복 제거 및 정렬을 손쉽게 수행할 수 있음
		list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(4);
		System.out.println(list);
		
		Set<Integer> set2 = new HashSet<>(list);
		System.out.println(set2);
		
		list = new ArrayList<>(set2);
		System.out.println(list);
		
		// Map: key와 value가 한 쌍으로 이루어진 요소들의 집합
		// key는 중복 불가, value는 중복 가능
		Map<String, String> map;
		
		// HashMap 구현 클래스: 검색 속도가 빠름
		map = new HashMap<>();
		// TreeMap 구현 클래스: 키를 기준으로 정렬하여 저장
		map = new TreeMap<>();
		
		// put(): Map에 key와 value의 쌍을 추가
		// 만약 동일한 key가 존재한다면 원래 값을 덮어씌움
		map.put("Apple", "사과");
		System.out.println(map);
		map.put("Banana", "바나나");
		System.out.println(map);
		map.put("Banana", "버네이너");
		System.out.println(map);
		
		// containsKey(): Map에 특정 키가 존재하는지 확인
		System.out.println(map.containsKey("banana"));
		
		// get(): Map에서 특정 키를 가지는 요소를 반환
		// 존재하지 않는 키로 조회하면 null을 반환
		System.out.println(map.get("banana"));
		System.out.println(map.getOrDefault("banana", "없음"));
		
		// remove(): Map에서 특정 key를 가지고 key와 value의 쌍을 제거
		// 삭제 작업에 성공하면 key에 해당하는 value를 반환
		System.out.println(map.remove("Apple"));
		System.out.println(map);
		
		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "이성계";
		human1.address = "개성";
		human1.age = 30;
		// {name=이성계, address=개성, age=30}
		
		Map<String, Object> human2 = new HashMap<>();
		human2.put("name", "이성계");
		human2.put("address", "개성");
		human2.put("age", -30);
		
		// 1. 문제점: 사용 혹은 추가 작업에 실수 발생 가능
		System.out.println(human2.get("Name"));
		// 2. 문제점: 타입의 안정성의 문제
		int age = (int) human2.get("Age");
		// 3. 문제점: 데이터 무결성 보장이 안됨
		
	}

}






