package com.kh.chap01.condition;
import java.util.Scanner;
public class TwoSome {​

	public void method1() {

	// 5. XXX메뉴를 XXX잔 주문하셨습니다. 출력

	// 6. 진짜 주문할건지 물어보기

	// 사용자에게 입력 받아서 Y/N 확인하기

	// 7. 6번에서 Y / N에 일치하다면 메뉴명과 수량과 가격 출력하기

	// if + 중첩if + 출력문

	System.out.println("투썸플레이스에 오신 것을 환영합니다");

	System.out.println("=======메뉴판=======");

	System.out.println("1. 아이스 아메리카노");

	System.out.println("2. 아이스 카페라떼");

	System.out.println("3. 콜드브루");

	System.out.println("4. 바닐라 아포가토");

	Scanner sc = new Scanner(System.in);

	System.out.println("");

	System.out.print("메뉴번호를 입력해주세요 > ");

	int menuNum = sc.nextInt();

	if(menuNum < 1 || menuNum > 4) { System.out.println("없는 메뉴입니다."); return; }

	String menuName = "";

	System.out.print("수량을 입력해주세요 > ");

	int ea = sc.nextInt(); 

	sc.nextLine();

	if(menuNum == 1) { menuName = "아이스 아메리카노";

	System.out.print(menuName + "를 " + ea + "개 주문하시겠습니까?(Y/N) > ");

	} else if(menuNum == 2) { menuName = "아이스 카페라떼"; 

	System.out.print(menuName + "를 " + ea + "개 주문하시겠습니까?(Y/N) > ");

	} else if(menuNum == 3) { menuName = "콜드브루"; 

	System.out.print(menuName + "를 " + ea + "개 주문하시겠습니까?(Y/N) > ");

	} else if(menuNum == 4) { menuName = "바닐라 아포가토"; 

	System.out.print(menuName + "를 " + ea + "개 주문하시겠습니까?(Y/N) > ");

	}

	char order = sc.nextLine().charAt(0);

	if(order == 'Y' || order == 'y') { System.out.print(menuName + "를 " + ea + "개 주문하셨습니다.");

	} else {

	System.out.print("주문을 취소하셨습니다.");

	}

	​



	}

}
