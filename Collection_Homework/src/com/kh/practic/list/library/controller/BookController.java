package com.kh.practic.list.library.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.kh.practic.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList();

	
	public BookController() {
	// �ʱ� ���� �־��� �⺻ ������
		
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
		// ��� ����Ʈ�� ����ϴ� �޼ҵ�
		// BookMenu���� ���� ȣ���߳�?
		return list;
		
		
		
		
		
	}
	
	public Book deleteBook(String removeTitle, String removeAuthor) {
		// å ����� ���� ������ å�� �����ϴ� �޼ҵ�
		// list�� ��� å ��Ͽ� ���� ���޹��� ���� �� �� ��ġ�ϴ� ���� �ִ��� ����񱳸� �� ��
		// ���� �� �ִٸ� ���� �� ����� �������ݽô�. �Ҹ����� �غ���?
		
		for(int i = 0; i < list.size(); i++) {
			Book removeList = list.get(i);
			if(removeList.getTitle().equals(removeTitle) && removeList.getAuthor().equals(removeAuthor)) {
				return list.remove(i);
				
			}
			
		}
			return null;
		
	}
	
	public List<Book> ascBook() {
	// å �� �������� �����ϴ� �޼ҵ�
		list.sort(Comparator.comparing(Book::getAuthor));
	 return list;
	}
	
	
	
}
