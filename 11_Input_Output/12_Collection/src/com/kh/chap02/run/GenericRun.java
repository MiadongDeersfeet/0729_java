package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun { // 제네릭을 해야지 리스트가 끝나요.

	public static void main(String[] args) {
		/*
		 * 제네릭 <Generic> 
		 * 
		 * 컬렉션을 사용하면서 다루고자 하는 타입들을 미리 지정할 수 있는 기능 
		 * => 명시적으로 <Integer>, <Plant>
		 * => 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있음 
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성 (E == Object)
		 * 
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음 => 코드 짤 때 쫌 편함
		 */
		int i = 1;
		System.out.println((Object)i);			// <= 기본자료형 값인데 이걸 Object 형 배열에 담고 싶은 거예요.  
		
	//	ArrayList<Plant> plants = new ArrayList();            //  <=  대충 다 들어간다는 이야기 // <Plant> 추가 : 나는 플랜트만 담을 수 있는 어레이 리스트를 만들 거야.
		List<Plant> plants = new ArrayList(); //  <=  좋은 개발자라면 이렇게 써주는 게 유지보수에 좋습니다. 큰 차이는 없지만...^^; 상위 클래스인 List 쓰기였습니다.
		plants.add(new Plant("관엽", "산세베리아"));
		//plants.add("누르"); // <Plant> 넣으니까 안되네???
		plants.add(new Plant("누르", "알람"));
		//plants.add(1); // <Plant> 넣으니까 안되네???
		//plants.add(1.1); // <Plant> 넣으니까 안되네???
		
		String name = ((Plant)plants.get(0)).getName();
		// 아까는 요렇게 뽑았었어요. 근데 제네릭을 달았기 때문에 이제 플랜트밖에 못들어가네요???
		
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		
		
		
		

	}

}
