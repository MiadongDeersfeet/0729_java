package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {

	public static void main(String[] args) {
		
		Book book = new Book("������� ����", "��������", "����Ŭ �̽���", 19800);
		ElectronicBook eb = new ElectronicBook("��ũ�ɸ���", "���", "��ũ���̵�������Ʈ", 15000, "��������");
		PaperBook pb = new PaperBook("������ ����", "��ũ�ν�", "ũ����ƾ ����", 20700, 0);
		
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		
		System.out.println(book);  // <= ��� �� ģ���� �ּҰ��̶�� �ϱ⿣ �ָ��ϰ� toString �̶�� �޼ҵ� ȣ���� ��ȯ���� ������ �ſ���.
		System.out.println(book.toString()); 
		// <= toString ������ return ���� getClass = ��Ű�� ��� + getName = Ŭ�������� �پ��ִ� �κ��� ���� ��ȯ��.
		// ��Ű����� + Ŭ������ => ǮŬ������� �մϴ�.
		// "@" �� ���������� ��� �����Ϸ��� ���ִ� �ǹ��Դϴ�.
		// �� �ڿ� 2d98a335 �̷� ������ ���� ���� �������ε� toHexString(hashCode) 16���� ������ ���·� ���ڿ��� ��ȯ�Ǵ� ���Դϴ�.
		// �ؽ��ڵ� �޼ҵ��� ��ȯ���ε� �ڹٿ��� ���� �����. ???? �ü���� C���� ������� �Լ��� �����ؼ� �޸𸮻��� �ּҰ��� �������� �ſ���.
		
		// toString() : �ش� ��ü�� ǮŬ������ + "@" + �ش� ��ü�� �ּҰ�(16������) : String
		System.out.println(eb); // <= information �Ⱦ��� toString���� �޼ҵ� ���� �� ȣ���� ���
		System.out.println(pb); // <= information �Ⱦ��� toString���� �޼ҵ� ���� �� ȣ���� ���
		
		LastTime lt = new LastTime();
		System.out.println(lt);
		
	}

}
