package com.kh.variable;

public class A_Variable {

	// 변수 : Memory(SSD, HDD, USB, DISK 등 포함된 용어이지만) 자바에서 Memory 는 무조건 램이라는 저장장치를 의미한다.
	// Memory(RAM)에 값을 저장하기 위한 공간
	
	// 변수를 사용하면 뭐가 좋을까?
	
	// 예제 뭘로 할까요 ~! ? ?!?!?!?!?!?!?!?!?!?!?!?!?
	
	// 뚝섬플레이스 키오스크(시즌 메뉴)
	public void findSeasonMenu() {
		// 1. 시즌메뉴들을 출력(메뉴명, 가격)
		
		// 2. 사용자가 메뉴판을 보고 주문을 했다고 가정해봅시다.
		
		// 3. 고객이 구매한 메뉴의 가격을 출력
		
		System.out.println("--- 변수를 사용하기 전 ---");
		System.out.println("시즌 메뉴 : ");
		//System.out.println("1. 딸기라떼(6700)");
		System.out.println("1. 한교동 갈릭 쉬림프 프레첼(1856)");
		System.out.println("2. 요거 젤리 소다 플랫치노(3900)");
		System.out.println("3. 케로케로케로피 멜론라떼(4200)");
		
		// 가정
		// 딸기라떼 25잔 시킴
		// 케로케로케로피 멜론라떼 30잔 시킴
		
		System.out.println("---------------------");
		//System.out.println("딸기라떼 25잔 시키셨습니다.");
		System.out.println("한교동 갈릭 쉬림프 프레첼을 17개 시키셨습니다.");
		// 주문가격 165,000원을 출력하고 싶습니다.
		// 메뉴가격 X 개수
		// 자바에서 곱하기 연산을 해야하는 경우
		// * 기호를 사용합니다.
		// 167,500원 입니다.
		//자바에서 문자열 값과 다른 형태의 값을 붙여서 사용하고 싶은 경우
		// + 기호를 사용합니다.
		//System.out.println((6700 * 25) + "원 입니다.");
		System.out.println((1856 * 17) + "원 입니다");
		
		// 출력문을 두 번 작성하여
		// 다음과 같이 출력하시오.
		// 케로케로케로피 멜론라떼 30잔을 시키셨습니다.
		// (메뉴가격 X 가격)원 입니다.
		System.out.println("케로케로케로피 멜론라떼 30잔 시키셨습니다");
		System.out.println((4200 * 30) + "원 입니다.");
		// 메뉴와 가격이 바뀐다고 가정해봅시다.
		// 딸기라떼 대신 한교동 갈릭 프레첼 1800원으로 갑시다.
		
		System.out.println("============================");
		
		System.out.println("변수를 사용해봅시다.");
		
		System.out.println("시즌 메뉴 : ");
		// 메뉴명과 가격이라는 값을 담을 공간
		// 즉, 변수를 선언하고 변수공간에 값을 대입해서 사용
		
		String seasonMenu = "KH정보교육원 A강의장에서 만든 딸기라떼"; //문자를 담는 자료형 ; String = 선언 (시즌메뉴를) 변수를 선언했다는 것은 값을 담을 수 있는 공간을 하나 만들었다는 것. 공간을 식별하기 위한 이름을 시즌메뉴라고 갖다붙인 겁니다. 프로그래밍 언어에서 이퀄'='은 대입연산자라고 불러요. 대입연산자를 기준으로 왼쪽은 공간 오른쪽은 값(절대예외없음)
		int price = 4700; //정수값을 담는 자료형 ; price = 정수식별자
		/*
		 * System.out.println("1. 딸기라떼 (6700)");
		System.out.println("딸기라떼 17개 시켰니?");
		System.out.println("가격은 " + (6700 * 17) + "원 입니다.");
		System.out.println("딸기라떼 12개 시켰니?");
		System.out.println("가격은 " + (6700 * 12) + "원 입니다.");
		 */
		System.out.println("메뉴명 : " + seasonMenu);
		System.out.println("가격 : " + price);
		System.out.println(seasonMenu + "를 17개 시켰니?");
		System.out.println((price * 17) + "원 입니다.");
		System.out.println(seasonMenu + "를 12개 시켰니?");
		System.out.println((price * 12) + "원 입니다.");
		
		/*
		 * 변수를 사용했더니?
		 * 1. 단 한번 값을 대입해서 필요한 순간마다 다시 사용할 수 있음
		 *    => 재사용성이 높아짐
		 * 2. 값에 의미를 부여할 수 있음
		 *    => 가독성이 높아짐
		 * 
		 * 가독성과 재사용성이 높아지면 유지보수가 용이해짐
		 * 
		 */
		String seasonMenu1 = "씨쏠트 카라멜크림 콜드브루";
		int price1 = 100;
		//String seasonMenu = "요거 젤리 "
		System.out.println("메뉴명 : " + seasonMenu1);
		System.out.println("가격 : " + price1);
		System.out.println(seasonMenu1 + "를 17개 시켰니?" );
		System.out.println((price1 * 17) + "원 입니다");
	}

	// 변수 선언 방법에 대해 알아봅시다
	public void declareVariable() {
		
		/*
		 * 변수 선언 방법
		 * 
		 * int price;
		 * 
		 * 자료형(DataType) 변수식별자; 
		 * 권장하는 방법은 아니지만 동일한 타입의 변수를 선언할 때는 한번에 선언 가능
		 * int a, b, c; <-- 권장하지 않음 / 한 줄에 하나씩 선언하는 게 권장하는 방법이에요. 개발에서 권장이란 무조건 하라는 거예요.
		 * 변수를 선언하고 난 뒤 처음 값을 대입하는 것을 초기화라고 합니다. 반드시 초기화(initialization)를 해야지만 변수를 사용할 수 있어요!
		 * 초기화를 통해 대입한 값을 초기값☆☆☆☆☆☆☆이라고 합니다.
		 * 
		 * 
		 */
		// System.out.println(price);
		// 변수는 자신이 선언된 {scope} 에서만 사용할 수 있음.
		// local variable(지역 변수) -- 분명히 같은 변수인데 이름이 다르고 또 다르고 또 다르고 목적이 다릅니다.
		
		/*
		 * 식별자(Identifier)
		 * 
		 * 우리가 지어주는 별칭, 이름이라고 생각하시면 됩니다.
		 * 클래스명, 메소드명, 변수명 등등 전부 이름을 지어줘야하는데 싸그리 통틀어서 식별자라고 합니다. 개발자가 만들어서 이용하는 고유의 이름.
		 * 
		 * - 식별자를 생성할 때 꼭 지켜야 하는 규칙!(안 지키면 안 만들어짐)
		 * 
		 * 1. keyword(예약어)는 식별자로 사용할 수 없음 / int price; 라면 int 는 키워드, price 는 식별자 인데 보라보라 글자들은 식별자가 될 수 없습니다.
		 * 2. 공백은 포함할 수 없습니다.
		 * 3. 대, 소문자를 구분하고 길이제한은 없습니다. (대, 소문자를 구분하니 전부 다른 변수로 인식합니다.)
		 * 4. 문자, 숫자, _, $를 포함할 수 있음 (※권장하지 않지만 한글도 됩니다.) (※문자, 특수문자로 시작 가능하지만 숫자로는 시작할 수 없습니다.)
		 * int price;
		 * int pRice;
		 * int prIce;
		 * int priCe;
		 * int pricE;
		 * 
		 * 
		 * - 개발자들끼리의 암묵적인 약속 (안 지키면 안 돌아가는 건 아니지만 ※욕 먹습니다.※) => 영어말고 쓰지말자, 숫자도 가능하면 쓰지말자, 특수문자는 간혹 그러나 쓰지말자.
		 * 
		 * 1. 클래스 / 인터페이스 명명 규칙 =>
		 * 
		 * - 첫글자는 대문자로 표기
		 * - 연결된 단어들의 첫 글자도 대문자로 표기
		 * - 명사, 형용사를 서술적으로 연결해서 사용합니다.
		 * --> Welcometojavaworld --> WelcomeToJavaWorld (더 직관적이네)
		 * 
		 * 2. 변수 명명 규칙
		 * 
		 * - 명사적 의미를 갖게 만들어 줌
		 * - 첫 글자는 소문자로 표기, 연결된 단어들의 첫글자를 대문자로 표기
		 * 
		 * --> phoneNumber
		 * 
		 * 3. 메소드 명명 규칙
		 * 
		 * - 동사적 의미를 갖게 만들어줌(명령어 어조) --> ex. getPhoneNumbe() 어쩌구저쩌구
		 * - 첫 글자를 소문자로 표기, 연결된 단어들의 첫 글자를 대문자로 표기 camel case
		 * - 메소드 식별자의 경우 식별자 뒤에 반드시 한 쌍의 "()"를 붙임
		 * - 메소드에는 일반적으로 _를 사용하지 않음(걸리면 팀장님 책상 뒤집어 엎을 거예요.)
		 * 
		 * --> join(), signUp()
		 * 
		 * 4. 상수 명명 규칙
		 * 
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어 사이는 _를 사용해서 구분한다.
		 * 
		 * --> LOGIN_OK
		 * 
		 * 
		 */
		
		// 변수의 자료형
		// Java의 기본자료형, 원시자료형
		//       PrimitiveType (가장 기본적인 8개)
		
		/*
		 * 1. 논리자료형(논리 값 : true / false)
		 */
		// 자료형 변수식별자;
		
		boolean isTrue; // 변수 선언 (자료형 쓰고 식별자 쓰고 세미콜론 다는 과정)
		// System.out.println(isTrue);
		// 지역번수(localVariable)은 초기화(Initialized)를 하지 않으면 사용할 수 없음
		isTrue = true; //이 과정을 초기화라고 합니다. ※초기값※
		System.out.println(isTrue);
		isTrue = false; //이 과정은 대입이라고 합니다. ※대입※
		System.out.println(isTrue);
		
		/*
		 * 2. 숫자 자료형
		 * 
		 * 정수형
		 * 
		 * 정수형에는 4가지 자료형이 존재합니다.
		 * byte, short, int, long 형이 있음.
		 * 여러분들은 int형을 주로 쓰세요~!
		 * long형을 사용할 때는 대입할 숫자 뒤에 "L"을 붙임
		 * 
		 * 실수형
		 * 
		 * 실수형에는 2가지 자료형이 존재합니다.
		 * float, double(기본)형이 있음.
		 * float형을 사용하기 위해서는 할당할 숫자 뒤에 "F"를 붙여야 함.
		 * 
		 */
		
		// 2_1. 정수형
		byte byteNumber = 1;   // 1Byte
		short shortNumber = 2;   // 2Byte
		int intNumber = 3;   //4Byte
		long longNumber = 4L;   //8Byte //숫자 뒤에 L을 붙여주면 롱형이라는 것입니다. 리터럴
		
		// 2_2. 실수형
		float floatNumber = 2.22F; // 4Byte
		double doubleNumber = 3.33; // 8Byte
		
		// 변수 선언과 동시에 초기화
		
		// 3. (단일)문자형
		char gold = '밥'; // 2Byte
		// 단일문자에는 반~~~~~~~~~~드시 홑 따옴표를 붙여줍니다.
		
		// 여기까지가 기본자료형 / 원시자료형 8개입니다~!
		
		// 4. 문자열 : 참조자료형 (※기본자료형은 아닙니다.)
		String str = "abc"; // 문자열 같은 경우 반드시 쌍따옴표를 앞 뒤로 붙여줌.
		
		// 9개의 자료형을 가지고 변수를 선언
		// 각각의 변수에 초기값을 대입 초기화를 진행
		// 9개의 변수에 값이 잘 대입되었는지 확인을 해보고 싶음!
		
		// 논리자료형 1개
		System.out.println("논리 자료형 : " + isTrue);
		// 정수자료형 4개
		System.out.println("정수 자료형 : " + byteNumber);
		System.out.println("정수 자료형 : " + shortNumber);
		System.out.println("정수 자료형 : " + intNumber);
		System.out.println("정수 자료형 : " + longNumber);
		// 실수자료형 2개
		System.out.println("실수 자료형 : " + floatNumber);
		System.out.println("실수 자료형 : " + doubleNumber);
		// 단일 문자 자료형 1개
		System.out.println("단일 문자 자료형 : " + gold);
		// 문자열 자료형 1개
		System.out.println("문자열 자료형 : " + str);
	
		// 출력문의 종류
		// System.out.print();
		// System.out.println(); => 개행한다 : 행을 새롭게 연다
		// 
		// System.out.println("isTrue라는 변수에 대입한 값 : " + isTrue + ", char형은 : " + gold); //이렇게 안쓸거지만 이런 경우가 있다는 거예요.
		// 새로운 출력문을 배워봅시다.
		// System.out.printf(); // f는 포맷을 의미한다. 출력할 때 형식을 지정할 수 있는 메소드 ※개행 안합니다.
		// 우리가 원하는 출력 결과물 ↓
		// isTrue라는 변수에 대입한 값 : false, char형은 : gold
		System.out.printf("isTrue라는 변수에 대입한 값 : %b, char형 : %c", isTrue, gold); //XXX에 형식을 지정해봅시다.
		
		// %b : true / false 타입의 변수 공간
		// %d : byte, short, int, long 정수형 변수 공간
		// %f : float, double 실수형 변수 공간
		// %c, %C : char문자형 변수를 담기 위한 공간
		// %s, %S : String문자열형 변수를 담기 위한 공간
		// System.out.println(); => 개행하고 싶어서
		System.out.printf("\ndobleNum 값 : %.2f", doubleNumber);
		System.out.printf("\tdobleNum 값 : %.2f", doubleNumber);
		
		
		System.out.println("\n================================");
		
		// 상수 -> 아침에 콘스탄트에서 한 상수는 수학 익힘책의 상수이고, 여기에서의 상수는 ※프로그래밍 언어 에서의 상수입니다. 수 개념으로 접근하지 말란 의미입니다.
		// => 값을 변경하지 않을 변수 공간
		
		// 잘나가는 KH가 설립된 년도를 저장할 공간이 필요함
		int startYear = 1998; // 1998이란 숫자를 절대 누구도 건들지 못하게 하고 싶다!!!!! 
		//startYear = 2025;
		
		
		System.out.println("KH 설립연도 : " + startYear);
		
		final int START_YEAR = 1998; // 상수 명명 규칙에서 모든 문자는 대문자로, 띄어쓰기는 언더바로 => 이 값 절대로 바꾸지 마셈.
		//START_YEAR = 2026; //Variable 클래스는 끝났는데 변수는 아직 안끝났어요. 2025-07-30 8교시
		
		
	

		
		
		
	}
	
	
	
	
	
}
