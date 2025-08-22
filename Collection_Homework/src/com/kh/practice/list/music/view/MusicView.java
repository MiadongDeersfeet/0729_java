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
		System.out.println("******** �� �� �� �� ********");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴���ȣ�� �Է����ּ��� > ");
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
		case 9 : System.out.println("���α׷��� �����մϴ�."); return;
		}
		
	}//while
		
  } //mainMenu
	
	public void addList() {
		// ������ ��ġ�� �� �߰�
		System.out.print("����� �Է����ּ��� > ");
		String title = sc.nextLine();
		System.out.print("�������� �Է����ּ��� > ");
		String singer = sc.nextLine();
		
		int add = mc.addList(title, singer);
		
		if(add == 1) {
			System.out.println("������ �߰��߽��ϴ�.");
		} else {
			System.out.println("������ �߰��ϴµ� �����߽��ϴ�.");
		}
	
		
	}
	
	public void addAtZero() {
		
		System.out.println("����� �Է����ּ��� > ");
		String title1 = sc.nextLine();
		System.out.println("�������� �Է����ּ��� > ");
		String singer1 = sc.nextLine();
		
		int add1 = mc.addAtZero(title1, singer1);
		if(add1 == 1) {
			System.out.println("������ ù ��° ����Ʈ�� �߰��߽��ϴ�.");
		} else {
			System.out.println("������ �߰��ϴµ� �����߽��ϴ�.");
		}
		
	}
	
	public void printAll() {
		// ��ü �� ��� ���
		List<Music> list = mc.printAll();
		if(list.isEmpty()) {
			System.out.println("���� ����Ʈ�� �����ϴ�.");
		} else {
			System.out.println(list);
		}
		
	}
	
	public void searchMusic() {
		// Ư�� �� �˻�
		System.out.println("�˻��� ����� �Է����ּ��� > ");
		String searchTitle = sc.nextLine();
		
		Music searchMusic = mc.searchMusic(searchTitle);
		System.out.println("�˻��Ͻ� ���� �����Դϴ�.");
		System.out.println(searchMusic);
		
	}
	
	public void removeMusic() {
		// ����ڿ��� ������ ���� �̸��� ���� �ް� MC�� removeM ���� ���� �ѱ��.
		// ��ȯ ���� ������ "������ ���� �����ϴ�."
		// ��ȯ ���� ������ "OOO(���, ������)�� �����߽��ϴ�. ���
		
		System.out.print("������ ����� �Է����ּ��� > ");
		String removeMusic = sc.nextLine();
		
		Music removeResult = mc.removeMusic(removeMusic);
		
		if(removeResult == null) {
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
		} else {
			System.out.println(removeResult.getSinger() + "�� " + removeResult.getTitle() +  "�� �����߽��ϴ�.");
		}
		
	}
	
	public void setMusic() {
		// Ư�� �� ���� ����
		// ����ڿ��� ������ ���� �Է��Ͽ� mc.setMusic ���� �˻��� �� �ְ� �Ѵ�.
		// ������ �� ��� ���� ���� �޾� setMusic ���� �ѱ��.
		List<Music> print = mc.printAll();
		System.out.println(print);
		System.out.println("�����ϰ� ���� ����� �Է����ּ��� > ");
		String title = sc.nextLine();
		System.out.print("���ο� ����� �Է����ּ��� > ");
		String setTitle = sc.nextLine();
		System.out.print("���ο� �������� �Է����ּ��� > ");
		String setSinger = sc.nextLine();
		
		Music set = mc.setMusic(title, setTitle, setSinger);
		if(set == null) {
			System.out.println("������ ���� �����ϴ�.");
			
		} else {
			System.out.println("������ �Ϸ�ƽ��ϴ�.");
		}
	}
	
	
	
	
	
	
}
