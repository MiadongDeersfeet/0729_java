package com.kh.practic.list.library.model.vo;

import java.util.Objects;

public class Book {
	// 필드부
	private String title;
	private String author;
	private String category;
	private int price;
	
	// 기본 생성자
	public Book() {
		super();
	}

	// 매개변수가 있는 생성자
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	//게터 세터부
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 객체의 정보를 리턴하는 메소드
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	
	// 해시코드를 리턴하는 메소드
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	
	// 객체가 같은지 여부를 리턴하는 메소드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	// 정렬 기준을 가지고 있는 메소드
	//public int compareTo() {
		
	//}
	
	
	
}
