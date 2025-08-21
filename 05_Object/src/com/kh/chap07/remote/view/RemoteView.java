package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// ����ڿ��� ���� �Է¹ް� ������ ������ִ� �޼ҵ带 �־�� Ŭ����
public class RemoteView {
	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();
	// ���α׷� ���� �� ������ ���θ޴��� ������ִ� �޼ҵ�
	public void mainMenu() {
		while(true) {
		System.out.println("������ ���� ���α׷��Դϴ�.");
		System.out.println("�̷��� ������ ������ ������ �غ�����.");
		System.out.println("�̿��Ͻ� �޴��� �������ּ���.");
		System.out.println("1. �����ѱ�");
		System.out.println("2. ä�� �ٲٱ� ��");
		System.out.println("3. ä�� �ٲٱ� ��");
		System.out.println("4. ��������");
		System.out.println("5. ���α׷� ����");
		System.out.print("� ����� �̿��Ͻðڽ��ϱ� > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : powerOn(); break;
		case 2 : channelUp(); break;
		case 3 : break;
		case 4 : break;
		case 5 : System.out.println("������ �����ϱ�� ��ſ�̳���? �ȳ���������."); return; /* break; */// �극��ũ�� ����ġ ������ ������ ���; ������ ���θ޼ҵ�� ���ư��� ���;
		default : System.out.println("�ٽ� �Է����ּ���.");           // �޴���ȣ�� ���� �̻��� �� ������ ���
		} // ����ġ ������
		
	} // ���� ������
		
  } //���θ޴�() �޼ҵ� ������
	
	private void powerOn() {
		//RemoteController rc = new RemoteController(); <= �� ģ���� �ʵ�� �Ű�����
		System.out.println("==================================");
		System.out.println("���� �ѱ� �޴��Դϴ�.");
		System.out.println("==================================");
		
		int result = rc.powerOn();
		if(result > 0) {
		System.out.println("������ �������ϴ� ���ϵ帳�ϴ�~~");
		} else {
		System.out.println("�̹� ������ �����ֽ��ϴ�.");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
	} // �Ŀ��� ������
	
	private void channelUp() {
		
		// 0�� ä��
		// 1�� ä��
		// ��Ʈ�ѷ��� ä�� �÷��� �׸��� ���ϴ��� �˷��� <= �޼ҵ� ȣ��
		// ��ü ���� ��ȣ�ۿ� �� (�������ڷ� ������� ���ϸ�)
		String channel = rc.channelUp();
		//if(channel != null) {
		int channelNo = rc.getChannelNo();
		System.out.println(channelNo + "�� ä���Դϴ�.");    //   <= ��Ʈ�ѷ��� �ʵ忡 �� �� ä������ ��Ƶ�.
		System.out.println("=================================");
		System.out.println(channel + "��(��) �濵 ���Դϴ�.");
		System.out.println("=================================");
		//} else {
		//		System.out.println("���� ������ ���ֽñ� �ٶ��ϴ�.");
		//}
		//		System.out.println();
				
	}
	
	
} // Ŭ���� ������
