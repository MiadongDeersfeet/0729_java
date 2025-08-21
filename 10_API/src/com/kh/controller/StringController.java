package com.kh.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {

	// String 클래스 => 불변(변하지 않음을 의미)
	
	/*
	 * String 클래스 사용방법
	 * 
	 * 1. new 연산자를 사용해서 String 클래스의 생성자를 호출하는 방법 <= 회사에서 이 방법쓰면 팀장님이 등짝을 때리면서 나가라고 할 수 있어요.
	 * 2. 대입연사자를 이용해서 문자열 리터럴값을 대입하는 방법
	 */
	
	// 생성자를 호출해서 문자열 객체를 생성하는 방법
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		String str3 = "hello";
		
		System.out.println(str1); // 이건 뭐지? hello
		System.out.println(str2); // 투스트링이 오버라이딩을 되어있겠구나. hello
		System.out.println(run); // 런의 부모인 오브젝트에 가서 부모가 가진 투스트링 메소드를 호출해서 반환값을 찍어준 거죠. 이렇게 나와야 정상이죠. com.kh.run.Run@2ff4acd0
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 리터럴 value 값을 반환하겠다고 오버라이딩
		
		Run run2 = new Run();
		System.out.println(run.equals(run2)); // false
		// 내 주소랑 인자로 받은 주소랑 동등비교

		// equals()
		System.out.println(str1.equals(str2)); // true
		// true => 같다
		// 스트링 클래스에서 이퀄스 메소드를 '값'이 같은지 비교할 수 있도록 오버라이딩 해놨겠네? (개발자적 접근방식)
		// 주소값 비교는 물론이고 문자열 값도 비교하도록 오버라이딩
		
		// hashCode()
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		System.out.println("hello".hashCode()); // 99162322
		// 3. String 클래스의 hashCode()
		// 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해시코드 값을 만들도록 오버라이딩
		
		// 진짜 저 참조형 변수들을 식별할 수 있는 값을 알아내는 법
		// System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str1)); // 1421795058
		System.out.println(System.identityHashCode(str2)); // 1555009629
		
		
		System.out.println(str1 == str2); // false
		
	}
	
	// 문자열 리터럴 대입 방식
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
	
		// toString()
		System.out.println(str1); // hello
		System.out.println(str2); // hello
		
		// equals()
		System.out.println(str1.equals(str2)); // true
		
		// hashCode()
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1)); // 804564176
		System.out.println(System.identityHashCode(str2)); // 804564176
		
		System.out.println(str1 == str2); // true
		
		
	}
	
	// String Constant Pool => 스트링 풀이라고도 함.
	public void method3() {
		
		String exam = new String("hello");
		String str = "hello";
		
		// 문자열 리터럴은 대입 연사자를 사용해 대입할 때
		// String Contant Pool 영역에 등록됨
		// 특 : 동일한 내용의 문자열 리터럴이 존재할 수 없음
		
		System.out.println(System.identityHashCode(str)); // 804564176
		
		str = "bye";
		System.out.println(System.identityHashCode(str)); // 1421795058
		
		// 상수풀에 올라가는데 hello 라는 5칸짜리? 올라갔는데
		// bye 라는 3칸짜리? 로 바뀌니까
		// 주소값이 달라요
		
		str += "!!";
		System.out.println(System.identityHashCode(str)); // 2001049719
		
		String a = "a";
		String b = "b";
		
		System.out.println("결과 : " + a == b);
		System.out.println("이름 : " + a + ", 나이 : " + b);
		
		//StringBuilder 문자열을 더해줄 때
	}
		public void method4() {
			//Arrays.toString(new int[2]);
			
			// StringBuffer
			// Buffer == 임시저장공간
			// 문자열은 불변객체라서 내용물이 변경될 때마다 새로운 공간을 할당해서 집어넣는다.
			// 이를 해결하기 위해서 임시공간(Buffer)을 준비해서
			// 임시공간에 차곡차곡 담았다가 한 번에 처리해주는 클래스
			
			StringBuffer sb = new StringBuffer();     // <= 얘는 동시제어기능이 들어있어요. 홍길동과 고길동의 칫솔재고쟁탈전에서 스스로 순위를 정할 수 있는 기능이 있음.
			// System.out.println("Hello" + "World!");
			sb.append("Hello ");
			sb.append("World!");
			System.out.println(sb);
			// 더하기는 낭비가 심하니까 더하기 대신에 쓰는 방법인 append 입니다.
			
			// StringBuilder    // <= 얘는 동시제어기능이 빠졌어. 그래서 이론적으로 속도는 빌더가 더 빠르다고 함. 동시제어기능이 다른데서 이미 많이 지원이 되고 있어서 일반적으로는 빌더를 씁니다.
			StringBuilder sr = new StringBuilder();
			sr.append("Hello ");
			sr.append("World!");
			System.out.println(sr);
			
			// 동시제어기능(Thread-Safe)이
			// 외부에서 제공이 많이 되고 있기 때문에
			// 충돌환경이 아니라면 굳이 구현할 필요가 없음
	}
	
		// 문자열과 관련된 메소드들 ※ 면접/코딩테스트 관련해서 문자열과 관련된 것들은 잘 알아두는 게 좋아요.
	public void stringMethod() {
		
		String str1 = "경실련하이텔 아카데미";
		
		// 1. 문자열.length() : int
		// 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length()); // 문자열도 배열에 들어갈 수 밖에 없어요 ???
		
		// 2. 문자열.charAt(int index) : char
	char ch = str1.charAt(3);
	System.out.println("하 : " + ch);
	
	String phoneNumber = "010-1234-5678";
	// 3. 문자열.substring(int beginindex) : String
	// => 문자열의 beginindex 위치에서 문자열 끝까지의 문자열을 추출해서 반환
	System.out.println(phoneNumber.substring(4)); 
	System.out.println(phoneNumber.substring(4, 8)); // <= 오버로딩이 잘되어있어서 두 개 값 가능.
	
	// 4. 문자열.indexOf(str) : int
	System.out.println(str1.indexOf("텔"));
	
	String[] emails = {"hong@kh.com", "kim@kh.com", "hitel@kh.com", "hhaahhoo@kh.com"};
	
	for(int i = 0; i < emails.length; i++) {
		System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		
	}
	
	// 5. 문자열.toCharArray() : char[]      <= 문자열을 char형 배열로
	// 문자열의 각 문자들을 char[]로 반환해주는 메소드
	char[] chArr = emails[0].toCharArray();
		
	for(int i = 0; i < chArr.length; i++) {
		System.out.println(chArr[i]);
		
	}
	for(char c : chArr) {
		System.out.println(c);
	}
	
	new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
	
	// char[] -> String
	System.out.println(String.valueOf(chArr));
	
	// 6. 문자열.replace(char old, char new) : String
	System.out.println(emails[0].replace("kh", "naver"));
	
	String str3 = "                         Java                               ";
	// 7. 문자열.trim() : String
	System.out.println(str3.trim());
	
	// 8. 문자열.toUpperCase() : String => 싹다 대문자로 바꾸기
	//    문자열.toLowerCase() : String => 싹다 소문자로 바꾸기
	Scanner sc = new Scanner(System.in);
	System.out.println("정말 하시겠어요?(Y/N) > ");
	String answer = sc.nextLine();//.toUpperCase();
	// String upperAnswer = answer.toUpperCase();

	if(answer.toUpperCase().equals("Y") || answer.equals("y")) {
		System.out.println("나 찐으로 해야겠다 참을 수가 없다.");
		
	}
	
	}
	public void split() {
		
		// 문자열 분리시키기
		String str = "배고파요,졸려요,하기싫어요,즐거워요";
		
		// 문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// 향상된 for문
		for(String s : arr) {
			System.out.println(s);
		}
		// 초기식, 조건식, 증감식 안씀
		// for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 배열 || 컬렉션 ){ }
		// 배열의 요소를 수정할 순 없음
		
		
		// java.util.StringTokenizer 클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ",");
	/*	System.out.println(stn); //<= NoNoNo
		System.out.println("토크나이저로 뽑아야지~!");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken()); // <= 예외요소 오류 발생!
		*/
		System.out.println("하하하하 구분선");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	
		
	}
	
		
		
		
		
		
		
	
}
