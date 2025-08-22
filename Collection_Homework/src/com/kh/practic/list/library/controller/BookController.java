package com.kh.practic.list.library.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.kh.practic.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList();

	
	public BookController() {
	// 초기 값을 넣어줄 기본 생성자
		
	}
	
	public boolean insertBook(String title, String author, String category, int price) {
		list.add(new Book(title, author, category, price));
		return true;
	}
	
	public List<Book> searchBook(String keyword) {
		
		List<Book> searched = new ArrayList();
		
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			
			if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getCategory().contains(keyword)) {
				searched.add(book);
			}
		}
		return searched;
	} 
	
	public List<Book> selectList() {
		// 모든 리스트를 출력하는 메소드
		// BookMenu에서 나를 호출했네?
		return list;
		
		
		
		
		
	}
	
	public Book deleteBook(String removeTitle, String removeAuthor) {
		// 책 제목과 저자 명으로 책을 삭제하는 메소드
		// list에 담긴 책 목록에 가서 전달받은 값과 둘 다 일치하는 것이 있는지 동등비교를 한 후
		// 같은 게 있다면 삭제 후 결과를 전달해줍시다. 불린으로 해볼까?
		
		for(int i = 0; i < list.size(); i++) {
			Book removeList = list.get(i);
			if(removeList.getTitle().equals(removeTitle) && removeList.getAuthor().equals(removeAuthor)) {
				return list.remove(i);
				
			}
			
		}
			return null;
		
	}
	
	public List<Book> ascBook() {
	// 책 명 오름차순 정렬하는 메소드
		list.sort(Comparator.comparing(Book::getAuthor));
	 return list;
	}
	
	
	
}
