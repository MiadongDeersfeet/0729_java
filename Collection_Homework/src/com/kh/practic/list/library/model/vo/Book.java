package com.kh.practic.list.library.model.vo;

import java.util.Objects;

public class Book {
	// �ʵ��
	private String title;
	private String author;
	private String category;
	private int price;
	
	// �⺻ ������
	public Book() {
		super();
	}

	// �Ű������� �ִ� ������
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	//���� ���ͺ�
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
	
	// ��ü�� ������ �����ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	
	// �ؽ��ڵ带 �����ϴ� �޼ҵ�
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	
	// ��ü�� ������ ���θ� �����ϴ� �޼ҵ�
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
	
	// ���� ������ ������ �ִ� �޼ҵ�
	//public int compareTo() {
		
	//}
	
	
	
}
