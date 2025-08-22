package com.kh.practic.list.library.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practic.list.library.controller.BookController;
import com.kh.practic.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		// 사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복 실행. 각 메뉴를 누를 시 해당 메소드로 이동
		
		System.out.println("=============KH정보교육원 도서관에 오신 것을 환영합니다^^!=============");
		System.out.println();
		int menuNo = 0;
		
		while(true) {
		try {	
		System.out.println("******** 메인 메뉴 ********");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 > ");
		menuNo = sc.nextInt();
		sc.nextLine();
		
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요 > ");
			sc.nextLine();
		}
		switch(menuNo) {
		
		case 1 : insertBook(); break;
		case 2 : selectList(); break;
		case 3 : searchBook(); break;
		case 4 : deleteBook(); break;
		case 5 : ascBook(); break;
		case 9 : System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
		
		} // switch
		
		
		} // while
	}
	
	public void insertBook() {
		// 도서 추가를 위해 정보를 받는 메소드
		String category = "";
		System.out.print("새 도서명 > ");
		String title = sc.nextLine();
		
		System.out.print("저자이름 > ");
		String author = sc.nextLine();
		
		System.out.println("1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타");
		System.out.print("장르번호 > ");
		int categoryNo = sc.nextInt();
		sc.nextLine();
		
		if(categoryNo < 1 || categoryNo > 4) {
			System.out.println("없는 장르입니다. 다시 선택해주세요.");
		} else { 
			switch(categoryNo) {
			case 1 : category = "인문"; break;
			case 2 : category = "자연과학";  break;
			case 3 : category = "의료"; break; 
			case 4 : category = "기타"; break;			
			}
		
		}
		/*
		if(categoryNo <= 0 && categoryNo > 4) {
			System.out.println("없는 장르입니다. 다시 선택해주세요.");
		} else if(categoryNo == 1) {
			category = "인문";
			} else if(categoryNo == 2) {
				 category = "자연과학";
			
				} else if(categoryNo == 3) {
					 category = "의료";
					
					} else {
						 category = "기타";
					}
		*/
		System.out.print("가격 > ");
		int price = sc.nextInt();
		
		boolean result = bc.insertBook(title, author, category, price);
		
		if(result) {
			System.out.println("새로운 도서가 추가되었습니다.");
		} else {
			System.out.println("도서 추가를 실패하였습니다.");
		}
		
		

		
		
	}
	
	public void selectList() {
		// 전체 도서 목록 출력 성공을 알리는 메소드
		// 컨트롤러에 있는 셀렉트리스트야 리스트<북>에 들어있는 책 정보를 출력해서 전달해줄래?
		// 니가 값을 반환해주면 내가 비어있나 안비어있나에 따라 출력문을 작성해볼게.
		
		List<Book> bookList = bc.selectList();
		// 다녀왔더니 책 정보를 담고 있는 list 의 주소값이 반환되었네?
		// 비어있는지 비어있지 않은지 확인해보고 문구를 출력하자
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
			
		}
		
		
		
	}
	
	public void searchBook() {
		// 특정 도서 검색 결과를 보여주는 메소드
		// 1. 검색할 도서명 키워드로 입력받기 (String keyword)
		// 컨트롤러의 searchBook() 메소드로 키워드 입력값 전달 후
		// 결과값을 임의의 리스트에 대입하고
		// 결과값이 북 객체가 아닌 리스트인 이유 --> 보통 프로그램에서 키워드로 검색하고, 결과가 여러개일 수 있기에 ...
		
		System.out.print("키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		List<Book> book = bc.searchBook(keyword);
		
		if(book == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			
			for(int i = 0; i < book.size(); i++) {
				
				System.out.println(book.get(i));
			}
			
		}
	}
	
	public void deleteBook() {
		// 특정 도서 삭제 성공을 알리는 메소드
		// 1. 삭제할 도서명 입력 받기 (String title)
		// 2. 삭제할 저자명 입력 받기 (String author)
		// ** 도서명과 저자명을 같이 입력 받는 이유 --> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		// 3. bc의 deleteBook() 메소드로 위의 title / author 값 전달 후 결과값을 임의의 Book(Book remove)에 대입하라
		// 4. 조건식을 이용해서 remove 가 존재하는 경우 "성공적으로 삭제했습니다" cnffur
		// 5. remove 가 없으면 삭제할 도서를 찾지 못했습니다. 출력
		
		System.out.println("삭제할 도서명을 입력해주세요 > ");
		String removeTitle = sc.nextLine();
		
		System.out.println("삭제할 도서의 저자명을 입력해주세요 > ");
		String removeAuthor = sc.nextLine();
		
		Book removeBook = bc.deleteBook(removeTitle, removeAuthor);
		
		if(removeBook != null) {
		System.out.println("삭제를 성공했습니다.");
		System.out.println(removeTitle + "을(를) 삭제했습니다.");
		} else {
			System.out.println("없는 도서입니다.");
		}
		
	}
	
	public void ascBook() {
		// 책 명 오름차순 정렬 성공을 알리는 메소드
		List<Book> ascBook = bc.ascBook();
		System.out.println(ascBook);
	}
}
