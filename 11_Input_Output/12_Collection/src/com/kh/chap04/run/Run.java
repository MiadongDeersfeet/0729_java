package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {

	public static void main(String[] args) {
		// Map 무한보따리 저장소^~^
		// Key + Value 세트로 저장
		
		// HashMap
		// [ 표현법 ]
		// Map 객체이름 = new HashMap();
		
		// 키 == 식별자 => 생선이름
		// 밸류 == 생선객체
		
		Map<String, Fish> aquarium = new HashMap();
		
		// 비어있는 맵에 요소를 추가해보기!
		// List, Set => add()
		// Collection을 구현한 클래스 ※ 맵은 똑 떨어져있는 친구라서 컬렉션을 구현한 친구는 아님.
		// aquarium.add <= 컬렉션 구현X 이기 때문에 없어요.
		
		// HashMap -> put()
		// => key + value 함께 요소로 추가해야함
		
		// 1. put(K key, V value) : Map에 key + value 세트로 요소 추가해줌
		aquarium.put("농어", new Fish("단맛", "회"));
		aquarium.put("대방어", new Fish("기름맛", "회"));
		aquarium.put("연어", new Fish("담백한맛", "스테이크"));
		aquarium.put("고등어", new Fish("기본맛", "구이"));
		aquarium.put("메기", new Fish("흙맛", "매운탕"));

		
		System.out.println(aquarium); // 저장 순서 보장 X
		// Key = Value 키는 밸류 이렇게 나와요.
		aquarium.put("참치", new Fish("기름맛", "회"));
		System.out.println(aquarium); // Value 값의 경우에는 중복 저장 O 기름맛, 회 이런 건 OK
		aquarium.put("참치", new Fish("감칠맛", "후토마키")); // Key 는 식별자 역할이기에 중복 발생 불가능!!! 기존에 있던 참치의 밸류는 사라지고 새롭게 put한 참치의 밸류로 덮어씁니다.
		System.out.println(aquarium);
		
		
		
		// 왜 맵이 좋냐?
		// 2. get(Object key) : Object
		// 전달된 key값에 해당하는 value값을 반환해주는 메소드
		// key -> value를 찾아옴
		
		System.out.println(aquarium.get("농어")); // 식별자인 농어의 밸류값인 단맛, 회가 출력되네???
		System.out.println(aquarium.get("메기"));
		System.out.println(aquarium.get("광어")); // 광어는 없는 거라서 null 값이 나오네???
		
		// 3. size() : Map에 담겨있는 요소의 개수
		System.out.println(aquarium.size());
		
		// 4. replace(K key, V value) : 키값으로 요소를 찾아서 Value값을 바꿔줌.
		aquarium.replace("참치", new Fish("고소한맛", "구이"));
		
		aquarium.replace("없는거", null);
		System.out.println(aquarium);
		// 기존에 존재하지 않는 키값을 인자로 전달하면 추가하지 않는다는 것이 put과의 차이점
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 => 키 + 밸류를 세트로 지워주는 메소드
		aquarium.remove("참치");
		System.out.println(aquarium);
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
		
		// Map에 들어있는 모든 요소들에 순차적으로 접근해야 한다면???
		// for문 X, 향상된 for X, while, X 우리가 지금까지 배웠던 모든 반복문을 쓸 수가 없어요.
		// set도 마찬가지라서 addAll(Collection c)을 사용했는데
		// Map은 컬렉션 구현을 안하니까 못쓰고.....
		// Iterator ?? 이것도 List랑 Set만 쓰는 건데.....어떻게 요소를 반복할 수 있지?
		
	/*	aquarium.forEach((key, value) -> { // functional????? 함수형????? 람다식?!!!?!?!!?!?ㅇ_ㅇ
			System.out.println(key + ": " + value); // 나중에 react 배울 때 합시다 ㅠ_ㅠ
			
		}); */
		
		// Map 이 Key = Value 를 가지고 있는데
		// 여기에서 Key 값들만 Set 으로 바꿀 수 있음
		// Set 을 바꾸면 Iterator 를 사용할 수 있기 때문에 반복을 시킬 수가 있다.
		
		// 1) keySet() 호출하기
		
		// 1_1 Map이 가지고 있는 Key들만 Set에 담는다.
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishSet); // 키 값들만 출력되네?? 키 값들만 담기는구나~~~
		
		// 1_2 Set을 Iterator에 담기
		Iterator<String> itKey = fishSet.iterator();
		
		// 1_3 반복문 사용하기
		
		while(itKey.hasNext()) {
			String key = itKey.next();
			System.out.println(key + "-" + aquarium.get(key));
		}
		
		System.out.println("========================================================================");
		
		// 2) entrySet()을 이용하는 방법
		
		// 2_1 Map이 가지고 있는 Key-Value 세트를 Set에 담기 <= 묶어주는 포장지를 엔트리라고 함.
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();
		
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + "::::::" + e.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
