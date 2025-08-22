package com.kh.practice.list.music.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.model.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		int menuNo = 0;
		while(true) {
		try {	
		System.out.println("******** 메 인 메 뉴 ********");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴번호를 입력해주세요 > ");
		menuNo = sc.nextInt();
		sc.nextLine();
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
		
		switch(menuNo) {
		case 1 : addList(); break;
		case 2 : addAtZero(); break;
		case 3 : printAll(); break;
		case 4 : searchMusic(); break;
		case 5 : removeMusic(); break;
		case 6 : setMusic(); break;
		case 7 : break;
		case 8 : break;
		case 9 : System.out.println("프로그램을 종료합니다."); return;
		}
		
	}//while
		
  } //mainMenu
	
	public void addList() {
		// 마지막 위치에 곡 추가
		System.out.print("곡명을 입력해주세요 > ");
		String title = sc.nextLine();
		System.out.print("가수명을 입력해주세요 > ");
		String singer = sc.nextLine();
		
		int add = mc.addList(title, singer);
		
		if(add == 1) {
			System.out.println("음악을 추가했습니다.");
		} else {
			System.out.println("음악을 추가하는데 실패했습니다.");
		}
	
		
	}
	
	public void addAtZero() {
		
		System.out.println("곡명을 입력해주세요 > ");
		String title1 = sc.nextLine();
		System.out.println("가수명을 입력해주세요 > ");
		String singer1 = sc.nextLine();
		
		int add1 = mc.addAtZero(title1, singer1);
		if(add1 == 1) {
			System.out.println("음악을 첫 번째 리스트에 추가했습니다.");
		} else {
			System.out.println("음악을 추가하는데 실패했습니다.");
		}
		
	}
	
	public void printAll() {
		// 전체 곡 목록 출력
		List<Music> list = mc.printAll();
		if(list.isEmpty()) {
			System.out.println("음악 리스트가 없습니다.");
		} else {
			System.out.println(list);
		}
		
	}
	
	public void searchMusic() {
		// 특정 곡 검색
		System.out.println("검색할 곡명을 입력해주세요 > ");
		String searchTitle = sc.nextLine();
		
		Music searchMusic = mc.searchMusic(searchTitle);
		System.out.println("검색하신 곡의 정보입니다.");
		System.out.println(searchMusic);
		
	}
	
	public void removeMusic() {
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MC의 removeM 으로 값을 넘긴다.
		// 반환 값이 없으면 "삭제할 곡이 없습니다."
		// 반환 값이 있으면 "OOO(곡명, 가수명)을 삭제했습니다. 출력
		
		System.out.print("삭제할 곡명을 입력해주세요 > ");
		String removeMusic = sc.nextLine();
		
		Music removeResult = mc.removeMusic(removeMusic);
		
		if(removeResult == null) {
			System.out.println("일치하는 곡이 없습니다.");
		} else {
			System.out.println(removeResult.getSinger() + "의 " + removeResult.getTitle() +  "를 삭제했습니다.");
		}
		
	}
	
	public void setMusic() {
		// 특정 곡 정보 수정
		// 사용자에게 수정할 곡을 입력하여 mc.setMusic 으로 검색할 수 있게 한다.
		// 수정할 곡 명과 가수 며을 받아 setMusic 으로 넘긴다.
		List<Music> print = mc.printAll();
		System.out.println(print);
		System.out.println("수정하고 싶은 곡명을 입력해주세요 > ");
		String title = sc.nextLine();
		System.out.print("새로운 곡명을 입력해주세요 > ");
		String setTitle = sc.nextLine();
		System.out.print("새로운 가수명을 입력해주세요 > ");
		String setSinger = sc.nextLine();
		
		Music set = mc.setMusic(title, setTitle, setSinger);
		if(set == null) {
			System.out.println("수정할 곡이 없습니다.");
			
		} else {
			System.out.println("수정이 완료됐습니다.");
		}
	}
	
	
	
	
	
	
}
