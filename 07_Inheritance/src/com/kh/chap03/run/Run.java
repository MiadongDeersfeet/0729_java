package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book("편안함의 습격", "수오서재", "마이클 이스터", 19800);
		ElectronicBook eb = new ElectronicBook("다크심리학", "어센딩", "다크사이드프로젝트", 15000, "교보문고");
		PaperBook pb = new PaperBook("경험의 멸종", "어크로스", "크리스틴 로제", 20700, 0);
		
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		
		System.out.println(book);  // <= 사실 이 친구는 주소값이라고 하기엔 애매하고 toString 이라는 메소드 호출의 반환값이 찍히는 거예요.
		System.out.println(book.toString()); 
		// <= toString 가보면 return 값에 getClass = 패키지 경로 + getName = 클래스명이 붙어있는 부분을 각각 반환함.
		// 패키지경로 + 클래스명 => 풀클래스라고 합니다.
		// "@" 는 보편적으로 가운데 구분하려고 써주는 의미입니다.
		// 맨 뒤에 2d98a335 이런 식으로 나온 것은 정수값인데 toHexString(hashCode) 16진수 정수값 형태로 문자열이 반환되는 것입니다.
		// 해쉬코드 메소드의 반환값인데 자바에는 값이 없어요. ???? 운영체제상에 C언어로 만들어진 함수를 참조해서 메모리상의 주소값을 가져오는 거예요.
		
		// toString() : 해당 객체의 풀클래스명 + "@" + 해당 객체의 주소값(16진수형) : String
		System.out.println(eb); // <= information 안쓰고 toString으로 메소드 만든 뒤 호출한 결과
		System.out.println(pb); // <= information 안쓰고 toString으로 메소드 만든 뒤 호출한 결과
		
		LastTime lt = new LastTime();
		System.out.println(lt);
		
	}

}
