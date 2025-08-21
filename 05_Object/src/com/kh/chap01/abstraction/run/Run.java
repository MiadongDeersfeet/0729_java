package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) { // main -> ctrl + space -> enter
		/*
		 * 객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서 객체간의 상호작용을 통해 프로그래밍 하는
		 * 기법 <= 보편적인 설명
		 * 
		 * 구현하고자 하는 프로그램에 객체를 만들기 위해서는(생성하기 위해서는) => 클래스를 먼저 생성해야함!
		 * 
		 * 클래스란? 각 객체들의 정보(속성, 행위)들을 담아내는 그릇 또는 틀 또는 설계도 또는 명세
		 * 
		 * 클래스 : VO(Value Object = 값을 담는 객체)
		 * 햄버거라면 브랜드, 재료, 칼로리 등이 들어갈 것이고 .....
		 * 
		 * 오늘의 숙제!
		 * 
		 * 현실세계에 존재하는 나만의 그 무언가를 찾아서
		 * VO클래스를 만들고
		 * PuppyCareRun클래스를 참고하여 생성한 객체를 관리할 수 있는 프로그램을 작성하시오.
		 * 
		 * 개수 ) VO 클래스 5개 + VO관리프로그램 5개
		 * 각 VO클래스의 최소 필드 수 5개
		 * 최소 한 개 이상의 필드 값을 변경할 수 있는 메소드 생성 --> Puppy 클래스의 bark()처럼
		 * 
		 * 제출할 곳 : 우리반 게시판 게시글 작성
		 * 제한시간 : 2025.08.07 07시 59분까지
		 * 게시글 제목 : 김윤기 VO클래스 만들기
		 * 
		 * + 메모리구조 그리기 (하나만 선택해서 그림 그려오세요)
		 */

		// 현실세계
		// 동물 => 강아지 (윤기네 강아지를 자바 세상으로 옮겨봅시다.)

		// 강아지
		// 정보
		// 종 : 포메라니안
		// 이름 : 똘똘이
		// 나이 : 4살
		// 성별 : 암컷
		// 색상 : 갈색
		// 몸무게 : 3kg
		// 내가 만들게 되는 소프트웨어에 필요한 정보들만 추출하는 작업이 필요해요.
		// 똘똘이의 아침산책시간 이런 것까지 다 끌고올 수는 없잖아요.
		// 이 작업을 추상화라고 합니다. (너무 정보가 많으니까 DNA 정보를 다 끌고올 수 없으니까 소프트웨어에 필요한 정보들만 추상화를 해서
		// 객체로 만들어내는 거예요.)
		// 클래스의 뜻이 뭐예요? 오늘 제가 말하고 싶은 건 '강'이라는 의미예요. => 생물분류단계(종목강) => 계문강목에서 '강'이
		// class예요.
		//

		// 객체 생성해보기
		// 강아지 객체 생성 자료형 쓰고 변수명 쓰고 대입을 한다고.
		Puppy smart = new Puppy(); // 객체 생성 ; 사실은 계속하고 있었음. 오른쪽이 객체 생성. 객체를 생성해서 변수에 대입한다구요.
		// new 라는 예약어를 사용 == 자바에서 배열도 이미 객체라고.
		// Memory의 heap영역에 데이터를 생성
		//smart.sniff(); // smart 에 주소값이 있지. 주소를 찾아가서(객체) 얘가 가지고 있는 기능을 호출해오는 거지.

		// System.out.println(smart); // 주소가 나오네? 당연하지 주소니까.
		// System.out.println(smart.name);

		smart.name = "똘똘이";
		// System.out.println(smart.name);
		smart.species = "포메";
		smart.age = 4;
		smart.gender = "암";
		smart.color = "갈색";
		smart.weight = 3;
		System.out.println(smart.name + "는 " 
						 + smart.color + " " 
						 + smart.species + "입니다.");
		System.out.println(smart.age + "살 " + smart.gender + "컷에 " + smart.weight + "kg입니다.");
		// 똘똘이를 자바의 세상에서 객체로 만들어 데려오는 것까지 성공했습니다.
		
		Puppy soldier = new Puppy(); // new를 만나는 순간 heap영역에 데이터가 올라가는 거예요. 공간할당은 Puppy 만큼
		
		soldier.name = "상근이";
		soldier.species = "그레이트 피레니즈";
		soldier.age = 9;
		soldier.gender = "수";
		soldier.color = "하얀색";
		soldier.weight = 60;
		
		System.out.println(soldier.name 
						   + "는 " + soldier.color 
						   + " " 
						   + soldier.species 
						   + "입니다.");
		System.out.println(soldier.age 
				           + "살 " 
				           + soldier.gender 
				           + "컷에 " 
				           + soldier.weight 
				           + "kg입니다.");
		
		System.out.println("===========================");
		
		smart.sniff();
		soldier.sniff();
		soldier.bark();
		smart.bark();
		
		System.out.println("짖기전 상근이 몸무게 : ");
		System.out.println(soldier.weight);
		
		soldier.bark();
		soldier.bark();
		soldier.bark();
		smart.bark();
		smart.bark();
		smart.bark();
		
		
		
		System.out.println("난 후 : ");
		System.out.println(soldier.weight);
		
		
	}

}
