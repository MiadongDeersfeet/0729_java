package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	// 변수(Variable)
	// 변수란?
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간이다.

	// 변수의 특징
	//
	// 1. 고유한 식별자를 가진다.
	// 2. 공간에 새로운 값을 대입해서 사용할 수 있다.
	// 3. 자료형이 정해져있다.
	// 4. 지역변수의 경우 메모리의 Stack 영역에 올라간다.
	// 5. **하나의 변수공간에는 하나의 값만 대입될 수 있다.** => 선생님이 바랐던 답변
	// 6. 초기화를 해야만 사용이 가능하다.
	// 7. 초기화는 한 번만 가능하다.
	// 8. 자료형은 크기가 정해져있다.
	// 9. 자료형끼리의 변환이 가능하다.
	// 10. 선언된 Scope 안에서만 사용이 가능하다.
	// 11. 변수끼리 연산도 가능하다.

	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음 단, "같은 자료형의 값들"만 담을 수 있음 동종
	 * 모음(homogeneous collection)이라고도 함. ※int형끼리만, char형끼리만, String형끼리만 담을 수 있고···
	 * 
	 * 자바라는 언어 자체에 내장된 ★유일한★ 자료구조 => 값을 어떻게 저장할 것인가에 대한 이야기(자료구조)
	 * 
	 * => 배열의 각 인덱스에 실제 값이 담김 index는 '0'부터 시작한다.
	 * 
	 */

	public void method1() {

		// 임의의 정수 5개를 선언하고 초기화를 진행해야지!
		/*
		 * int num1 = 3; int num2 = 16; int num3 = 23; int num4 = 8; int num5 = 119;
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5;
		 * 
		 * for(int i = 1; i <= 5; i++) { sum += numi //문법적으로 말이 안돼요. }
		 * 
		 * System.out.println(sum);
		 */

		// 배열

		// 1. 배열 선언

		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언 방법
		 * 
		 * 1) 자료형 배열식별자[]; 2) 자료형[] 배열식별자; --> 요 방법을 사용할
		 * 것!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * 
		 * 
		 */

		// 변수 선언!
		// int num;

		// 배열 선언!
		// int[] nums;

		// int[] nums = 0; *불가능*

		// 2. 배열 할당

		/*
		 * 배열에 몇 개의 값이 들어갈지 배열의 크기를 정해주는 과정 지정한 개수만큼 값이 들어갈 공간이 할당됨
		 * 
		 * [ 표현법 ]
		 * 
		 * int[] numbers; // 배열선언 numbers = new int[5]; // 할당
		 * 
		 * int[] arr = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조 자료형이다.
		 */

		// int[] nums = new int[2]; // 배열선언 및 할당

		// nums 라는 정수형 배열을 선언하고 5칸 할당받아보기

		int[] nums = new int[5]; // 참조자료형

		// 3. 배열의 각 인덱스에 값 대입
		/*
		 * [ 표현법 ]
		 * 
		 * 배열식별자[인덱스] = 값; <= 배열에다가 값을 대입하는 방법
		 */

		nums[0] = 23;
		nums[1] = 17;
		nums[2] = 316;
		nums[3] = 114;
		nums[4] = 55;

		// System.out.println(nums); <= 이게 아니네?
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += nums[i];
		}
		System.out.println(sum); // nums 1 ~ 4 까지 출력 후 합계 525
		// 현시점에서 우리가 배열을 사용해서 얻을 수 있는 장점 : 반복문 사용 가능
	}

	public void methodA() {

		// 배열을 공부해보자

		// 1. 배열선언 및 할당

		int[] integers = new int[3]; // 0, 1, 2
		double[] doubles = new double[2]; // 0, 1

		// 배열식별자.

		// integers.length : 배열의 크기(길이) => 정수
		System.out.println(integers.length);
		System.out.println(doubles.length);

		int i;
		// System.out.println(i); localvariable == 초기화를 진행하지 않으면 사용할 수 없음
		i = 1;
		System.out.println(i);
		System.out.println(integers);
		System.out.println(integers[0]);
		integers[0] = 1;
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double => 변수 공간에 실제 값을
		 * 바로 담을 수 있음 : (지역)변수 <= 여기서 말하는 지역은 내가 선언된 스코프 내 !
		 * 
		 * 참조자료형 : boolean[], char[], byte[], int[] ... String => 주소값을 담고 있는 변수 : 참조
		 * 변수(레퍼런스)
		 */

		// 인포, A강의장, B강의장, C강의장, 사무실
		String[] KH정보교육원종로지원;
		KH정보교육원종로지원 = new String[5];
		System.out.println("종로점 주소 : " + KH정보교육원종로지원);

		KH정보교육원종로지원[0] = "인포";
		KH정보교육원종로지원[1] = "A강의장";
		KH정보교육원종로지원[2] = "B강의장";
		KH정보교육원종로지원[3] = "C강의장";
		KH정보교육원종로지원[4] = "사무실";

		System.out.println(KH정보교육원종로지원[0]);
		System.out.println(KH정보교육원종로지원[1]);
		System.out.println(KH정보교육원종로지원[2]);
		System.out.println(KH정보교육원종로지원[3]);
		System.out.println(KH정보교육원종로지원[4]);

		System.out.println("-------반복문-------");

		for (int index = 0; index < 5; index++) {
			System.out.println(KH정보교육원종로지원[index]);
		}

		int number1 = 3;
		int number2 = 3;
		System.out.println(number1 == number2); // true

		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		System.out.println(numbers1 == numbers2); // false

		// 참조자료형에서는 ==(동등비교 연산자) 사용 시
		// 주소값을 비교하기 때무에 원하는 결과를 얻을 수 없음
		// 문자열 == 문자열 <= 주소값이 들어있는 상태
		// 문자열.equals("비교할 문자열");

		// 해시코드 : 주소값을 10진수(int형태)형태로 나타낸 것
		System.out.println(numbers1.hashCode());
		System.out.println(numbers2.hashCode());
	}

	public void lotto() {

		// 로또번호생성기 ver_0.2
		int[] lotNum = new int[6]; // 0, 1, 2, 3, 4, 5

		lotNum[0] = (int) (Math.random() * 45) + 1;
		lotNum[1] = (int) (Math.random() * 45) + 1;
		lotNum[2] = (int) (Math.random() * 45) + 1;
		lotNum[3] = (int) (Math.random() * 45) + 1;
		lotNum[4] = (int) (Math.random() * 45) + 1;
		lotNum[5] = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < 6; i++) {
			lotNum[i] = (int) (Math.random() * 45) + 1;
			// System.out.print(lotNum[i]);
		}

		// Arrays.toString(배열식별자) <= 빨간줄 뜨면 임폴트 해라~~
		System.out.println(Arrays.toString(lotNum));
	}

	public void methodB() {

		// 5개의 요소를 담을 수 있는 String형 배열을 선언 및 할당하시오.
		// 동물 5총사

		String[] animals = new String[5];

		animals[0] = "호랑이";
		animals[1] = "사자";
		animals[2] = "곰";
		animals[3] = "양";
		animals[4] = "사슴";
		animals[5] = "강아지"; // 잘못됐는데 실행 전에 빨간줄이 없네!? <-- 문법적으로는 문제가 없다는 이야기임.
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 5 at com.kh.array.Array.methodB(Array.java:236) at
		 * com.kh.array.Run.main(Run.java:12)
		 */
		// at com.kh.array.Array.methodB(Array.java:236) <= Stack Trace 스택을 추적해서 화면상에
		// 보여주는 것.
		// ArrayIndexOutOfBounds
		// 배열의 인덱스가 범위를 벗어났다.

	}

	public void methodC() {
		
		// 사용자에게 세 개의 정수를 입력받아서 입력받은 정수 중 최소값 구하기
		
		// 현 시점에서 배열을 선택할 때의 기준
		// 1. 두 개 이상의 같은 자료형의 값을 다룰 것
		// 2. 다룰 값의 개수가 명확하게 정해져 있을 것
		
		// 1) 사용자로부터 값을 입력받아서 배열의 각 인덱스에 대입
		Scanner sc = new Scanner(System.in);   //입력도구
		int[] nums = new int[3];               //저장소
		
		// 배열의 특징 : 배열은 물리적인 구조와 논리적인 구조가 동일합니다.
		/*
		System.out.print("첫 번째 정수를 입력해주세요 > ");
		nums[0] = sc.nextInt();
		System.out.println("nums라는 배열의 0번째 인덱스에 대입된 값 : " + nums[0]);
		
		System.out.print("두 번째 정수를 입력해주세요 > ");
		nums[1] = sc.nextInt();
		System.out.println("nums라는 배열의 1번째 인덱스에 대입된 값 : " + nums[1]);
		
		System.out.print("세 번째 정수를 입력해주세요 > ");
		nums[2] = sc.nextInt();
		System.out.println("nums라는 배열의 2번째 인덱스에 대입된 값 : " + nums[2]);
		*/
	
		for(int i = 0; i < nums.length; i++) {
			System.out.println("정수를 입력하세요 > ");
			nums[i] = sc.nextInt();
			//System.out.println("nums라는 배열의 " + i + "번째 인덱스 값 : " + nums[i]);
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		// 2. 해당 배열의 요소 중 가장 작은 값 == 최소값을 출력하는 것이 목적
		
		int min = nums[0];
		/*
		if(min > nums[1]) {
			min = nums[1];
		}
		
		if(min > nums[2]) {
			min = nums[2];
		} */
		
	for(int i = 1; i < nums.length; i++) {
		if(min > nums[i]) {
			min = nums[i];
		}
		System.out.println("배열의 요소 중 가장 작은 값 : " + min);
	}

	public void methodD() {
		/*
		 * 한 번 할당받은 배열의 크기를 변경할 수 없음!
		 */
		String[] name = new String[3];

		name[0] = "김";
		name[1] = "윤";
		name[2] = "기";
		System.out.println(Arrays.toString(name));
		name[0] = "곰";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		name = new String[4];
		name[3] = "짱";
		System.out.println(Arrays.toString(name));
		System.out.println(name.hashCode());

		// 기본적으로 해싱 알고리즘은 전제가 있습니다.
		// 같은 주소값을 가지고 있다면 해시코드값이 똑같이 나옵니다.
		// ※함정이 있는데요※ 커리젼이라고 하는데요(????????????)
		// 수학익힘책을 생각하실 필요가 있어요.
		// 비둘기집의 원리라는 게 있죠? (네?)
		// 비둘기집이 열개고 비둘기가 열마리면 한 집에 한마리씩 들어가면 되는데
		// 비둘기집이 열개고 비둘기가 열한마리면 그 중 한 집에는 두마리가 들어가야해요.
		// 이게 해시에 똑같이 반영이 되는건데
		// 위에 해시코드 출력해보면 주소값을 int로 알려주는 거란 말이죠. int로 표현할 수 있는 범위가 43억개정도 돼요.
		// 43억1개가 된다면 비둘기집처럼 중복이 일어나고 해시충돌이라고 합니다.

		/*
		 * 연결이 끊긴 기존의 배열은 일정 시간이 지나면 G.C가 알아서 삭제 해준다 : 자동 메모리 관리
		 * 
		 * 기존배열식별자에 할당만 새롭게 한다면 => 기존 참조하고 있던 연결이 끊기고 새로운 배열을 참조함
		 * 
		 */

		/*
		 * null => 널값이라고 부릅니다. G.C가 청소해줬으면 좋겠는데? 하는 마음이 생길 수 있죠. 이 때 널값을 이용해줍니다. 여기에서
		 * 중요한 건 '값'이에요.
		 * 
		 * null => 아무 것도 존재하지 않음을 의미하는 값
		 * 
		 * 배열 변수 선언하고 값을 대입하지 않고 출력했을 때 기본적으로 0이 나왔었잖아. 여기에는 늘 기본적으로 뭐라도 들어가있어야하거든.
		 * 
		 * 기본값
		 * 
		 * 정수 = 0 실수 = 0.0 문자 = ''
		 * 
		 * 참조자료형
		 * 
		 * 참조자료형에는 null이라는 값이 들어가는데 주소값이 존재하는가 그렇지 않은가
		 * 
		 */

		name = null; // 현재 연결고리를 끊고싶다.
		System.out.println(name); // null 이 나오네 <-- "나는 주소값이 없음" 이란 의미
		name[0] = "홍길동";
		// Exception in thread "main" java.lang.NullPointerException: Cannot store to
		// object array because "name" is null
		// 가리키고 있는 대상이 null인데 주소가 없는데 어디 접근함????
		// 지금 이 순간부터 여러분들이 자바 개발자로 살아가는 이상 항상 여러분들을 괴롭히는 존재입니다.

	}

	public void methodE() {

		// 그래서 배열 보통 어케씀?
		// 사실 앞에서는 배우려고 그랬던 거고 배열은 그렇게 쓰는 거 아닙니다!!!!
		// ↓ 이게 앞에서 배웠던 예시 *입력값을 쓸 땐 이렇게 쓰면 되긴 합니다만
		int[] arr = new int[3]; // 0, 1, 2
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(Arrays.toString(arr));

		// 배열은 보통 선언과 동시에 요소를 대입해서 사용하곤 합니다.
		int[] arr1 = new int[] { 10, 20, 30 };
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = { 100, 200, 300 };
		System.out.println(Arrays.toString(arr2)); // <== 사실은 요게 가장 흔히 사용하는 방법입니다.

	}

	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사 ☆★☆★
	 * 
	 * 2. 깊은 복사
	 * 
	 */

	public void methodF() {
		// 얘가 중요함
		int[] origin = { 1, 2, 3, 4, 5 };
		// new int[5];
		// origin[0] = 1; origin[1] = 2; ....
		System.out.println(Arrays.toString(origin));

		// 얕은 복사로 배열을 복사
		int[] copy = origin;
		System.out.println(Arrays.toString(copy));

		origin[2] = 33; // 3번 인덱스(2)를 33으로 다시 대입해볼게요.
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		// 얕은 복사 => 주소값을 대입하는 것이기 때문에 가리키고 있는 대상이 같다.

		System.out.println(origin.hashCode());
		System.out.println(origin.hashCode());

	}

	// 2. 깊은 복사
	public void methodG() {

		int[] origin = { 1, 2, 3, 4, 5 };

		int[] copy = new int[6];

		/*
		 * copy[0] = origin[0]; copy[1] = origin[1]; copy[2] = origin[2]; copy[3] =
		 * origin[3]; copy[4] = origin[4];
		 */

		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];

		}

		// 배열의 깊은 복사의 경우 기존 배열의 크기보다 큰 배열로 복사하는 경우가 많음

		// 행 이동 => alt + ↑, ↓
		// 행 복사 => ctrl + alt + ↑, ↓
		// 행 삭제 => ctrl + D
		// 행 주석 => ctrl + /
		// 코드정리 => ctrl + shift + F
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy));

		
		int[] copy2 = new int[10];
		
		System.arraycopy(origin, 0, copy2, 0, 5); // 배열을 복사하는 메서드
		System.out.println(Arrays.toString(copy2)); // 1, 2, 3, 4, 5, 0, 0, 0, 0, 0
		/*System.arraycopy(origin, 0, copy2, 5, 5); // 배열을 복사하는 메서드
		System.out.println(Arrays.toString(copy2)); // 0, 0, 0, 0, 0, 1, 2, 3, 4, 5*/
		
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스 / 인터페이스
		 * arraycopy() ==> System. 시스템을 참조했다. 첫글자가 대문자네? 그럼 System 은 클래스이겠구나. 
		 * 
		 * System.arraycopy(원본 배열 식별자, 원본배열에서 복사를 시작할 인덱스,
		 * 					복사본 배열 식별자, 복사본 배열에서 복사가 시잘될 인덱스,
		 * 					복사할 개수);
		 */
		
		// Arrays = 첫 글자가 대문자네? 클래스겠네? ㅇㅇ
		// Arrays클래스에서 제공하는 copyOf() 라는 메서드를 호출해봅시다!
		
		int[] copy3 = Arrays.copyOf(origin, 15); // 원본 배열을 카피할 건데 15칸짜리로다가~~ 얘는 크기를 늘리는데에 치중
		System.out.println(Arrays.toString(copy3));
		
		int[] copy4 = origin.clone(); // 클론? 복제인간이네 하하하하하
		System.out.println(Arrays.toString(copy4));
	}

}
