package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부
public class Cafe {

	// 필드(Field)부
	/*
	 * 객체가 가질 수 있는 속성
	 * 
	 * 정보(Data)를 담는 부분
	 * 
	 * 필드 == 멤버변수 (= 클래스가 가지고 있는 멤버다) (멤버변수라고 하면 클래스-필드 이야기 하는구나 생각하세요)
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */

	private String name;
	private String address;
	private int signatureMenuPrice;
	
	// 생성자(Constructor)부
	// 메소드(Method)부
	/*
	 * 기능(method)를 구현하는 부분
	 * 주문받기, 결제하기, 문열기, 문닫기, 할인, 이벤트 등 - 카페가 할 수 있는 기능들
	 * 
	 * 접근제한자 (예약어 : static 이라던지 필수는 아님) 반환형 메소드식별자(매개"변수"-필수아님) {
	 * 		메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한할 수 있음
	 * 반환형    : void => return 할 때 돌려줄 값이 없음이라는 의미  
	 * 		  ==> 반환할 때 값을 돌려주고 싶다면? 변환 시 결과 값의 자료형을 명시해준다.
	 * 매개변수  : 메소드 호출 시 전달 값을 받아주는 변수
	 * 			 메소드 범위에서만 사용 가능. 생략 가능 
	 */

	public void open() {
		//dishWash();
		cleaning();
		windowCleaning();
		
	}
	
//	private void dishWash() {
//		System.out.println("깨끗하게 빡빡!!");
//	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡!!");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡!!");
	}

	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	
	/*
	 * DTO -> setter를 만들어줌
	 * VO -> 일반적으로 setter 메소드를 구현하지 않음
	 * 
	 * DTO는 2달 뒤에 배울 건데 DTO 학습 전까지만 VO 클래스에 setter를 구현해서 사용할게요.
	 * 
	 * setter 만들기 규칙
	 * 
	 * 1. setter 메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)을 꼭 지키도록 한다.
	 * 
	 * 3. (예외사항) 우리는 당분간 항상 모든 필드에 대해서 setter를 구현합니다.
	 */
	
	// 고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// (암묵적인 규칙) signatureMenuPrice  <== 이 필드를 셋할 수 있는 메소드예요.
	public void setSignatureMenuPrice(int signatureMenuPrice) {
	/*	System.out.println("stter에서 전달 받은 정수 값 : "
							+ signatureMenuPrice); */
		signatureMenuPrice = signatureMenuPrice;
		//왼쪽은 공간             오른쪽은 값
		// Scope 안에서는 해당 영역 안에 있는 지역변수에 대한 우선권이 있음
	//	System.out.println("내 주소가 뭐지? > " + this);
		
		if(signatureMenuPrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다. 1000 이상의 정수를 입력하세요.");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
		}
		this.signatureMenuPrice = signatureMenuPrice;
		
		
	}
	
	// name필드를 기록 및 수정할 수 있는 메서드 (현재 name 필드는 가려져있음) // setter 생성해서 은닉된 정보를 수정할 것임.
	public void setName(String name) { //문자열 받아야하니까 스트링 선언하고 파라미터 생성
		// 얘는 네임 값을 셋팅하기 위한 목적의 메서드 생성, 이 메서드를 호출하려면 무조건 문자열을 전달해야함.(?) //어쨌든 여기 파라미터에는 인자값 "뚝섬플레이스" 가 대입되어있고
		// 우리는 이 값을 이제 필드에 있는 네임에 대입해야해요.
		// 클래스에 있는 필드에 접근하려면 주소값을 알아야하는데 this 를 쓰면 주소값을 알 수 있음
		this.name = name;
	}
	
	public void setAddress(String address) { //1. 퍼블릭 - 보이드 - set공간이름 // 2. 매개변수 생성 (자료형 매개변수명) // 3.
		this.address = address;	
	}
	public void setNameAndAddress(String name, String address) {
		setName(name);
		setAddress(address);   // <== 똘똘이들이 이렇게 할 수도 있죠. 하지만 우리는 수업 때 이렇게 안할 거예요. 만약에 이렇게 만들면 일단 얘는 ※셋터※가 아니예요. 그래서 메소드명이 셋으로 시작하면 안돼요.
							   // <== 이렇게 해도 코드는 동작을 하지만 관례위반입니다. 하나의 메서드를 통해서 여러개의 필드값을 수정하는 것은 셋터가 아닙니다. 관례위반!!!!!!!
							   // <== set 이 아니라 change 라던지 하여튼 다른 게 들어가야하는 겁니다.
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter()      <= get : 내놔!
	
	/*
	 * 규칙!
	 * 
	 * 1. getter() 는 접근제한자 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다.
	 * 3. 모든 필드에 대해서 반드시 무조건 꼭 다 절대로 만들어주세용!
	 * 
	 */
	
	// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음 // 반환형 void 는 return 할 때 값을 가져갈 수 없다고 나오네? void ---> (변경후) String
	public String getName() {
		return name;
	}
	// 주소지를 반환해주는 메소드를 만들어봅시다.
	public String getAddress() {
		return address;
		// return value;
		// value를 메소드 호출 부분으로 반환하겠다.
		// 메소드의 반환형과 반환받고자 하는 값의 자료형이 일치하는가를 꼭 잘 확인해야함.
	}
	
	public int getSignatureMenuPrice() { // 실제로는 단어가 4개가 넘어간다 싶으면 이게 변수명으로 맞나? 고려해보셔야합니다.
	return signatureMenuPrice;
	}
	
	// 물론 전부 끝난 것은 아니지만 지금 단계에서 이야기 해보자면
	// getter() / setter() 다 만들었당 ! ==> 캡슐화가 끝남(문법적인 관례)
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 public 대신 private으로 선언한다.
	 * 2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다. => getter() / setter() 구현함으로써 캡슐화가 끝났다고 한단 말이에요. / 숨기고 게터 세터
	 * 
	 * 캡슐화를 통해서 얻을 수 있는 장점 ↓
	 * 1) 데이터를 숨김 -> 객체간의 결합도를 낮춤(지금은 좀 어려울 수 있는 개념) -> 책임을 분리시킨다. // 유지보수 할 때 여기서 고칠 부분은 여기서만 고치고 다른데서 고칠 부분은 다른데서만 고치도록 하자.
	 * 2)
	 * 
	 */
	
	// 모든 필드 값을 확인할 수 있도록 반환해주는 메소드 (한꺼번에 반환하고 싶어요. 개수가 많아지면 힘드니까!)
	public String info() {
		
		// name, address, signatureMenuPrice 삼총사를 한꺼번에 반환하고 싶어요.
		// return name; address; signatureMenuPrice; 자료형이 달라서 안되네요.
		// return 할 때 반환할 수 있는 값은 단 한 개!!
		String info = "[name 필드값 : " + name + ", address 필드값 : " + address + ", signatureMenuPrice : " + signatureMenuPrice + "]";
		// 문자열이랑 다른 자료형이랑 합치면 문자열로 바뀐다구요???
		return info;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
