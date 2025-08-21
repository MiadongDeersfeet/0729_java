package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	public void outputToFile() {
		// XXXWriter ---> "�� �̰� 2Byte ���� ��Ʈ���̱���!"
		// FileWriter ---> ���Ϸ� �����͸� 2Byte ������ ����ϴ� ��Ʈ��
		
		// 0. ��Ʈ������
		/*FileWriter fw = null;
		
		try {
			// 1. ��Ʈ������
			fw = new FileWriter("b_char.txt");
			
			// 2. ��������� => write()
			fw.write("��....IO...�ű��ϴ�...");
			fw.write("E");
			
			
		} catch(IOException e) {
			System.out.println("�ٽ� �õ����ּ���.");
		} finally {
			// 3. �ڿ��ݳ� => �� ���Ѿ��ϴ� ��� => close()
			try {
				if(fw != null) {
				fw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	} */
	
		/* �ڵ��ݳ� ���
		 * try ~ with ~ resource ����
		 * 
		 * - JDK 7�̻���� ��밡��
		 * 
		 * try(��Ʈ����ü����; ...) {
		 * 	���ܰ� �߻��� ���� �ִ� ����;
		 * } catch(����Ŭ���� e) {
		 * 	���ܰ� �߻����� �� ������ ����;
		 * }
		 * ���� ������ ������ close()�� ȣ���ؼ� �ڵ����� �ڿ��� �ݳ����ش�.
		 * Ȥ���� �� ���� �ִ� �Ǽ��� ���� �� �ִ� ���� �Ǹ��� �����̴�.
		 * 
		 * �ٵ� ���������� �־��.
		 * Closeable �������̽��� ������ ��.
		 */
	
	try(FileWriter fw = new FileWriter("c_char.txt")) {
		fw.write("��..IO..����..");
		fw.write("E");
		
	} catch(IOException e) {
		e.printStackTrace();
	}
	} //<=== Ʈ���̸� ���� ���� ���� ����� �ϴ� �Ǽ��� �ٿ��ش�~~~
	
	public void writeTil() {
		
		// ����ڿ��� ���� �н������� �Է¹޾Ƽ�
		// �ܺ� ���Ͽ� ������ ���
		
		// ������ ���ϸ��� : 2025�� 08�� 14�� ������ �н�����
		Date now = new Date(); // java.util.date ������~!
	//	System.out.println(now); // Thu Aug 14 17:21:14 KST 2025 => 2025�� 08�� 14�� ������� �����غ���.
		// 2025�� 08�� 14��
		String titleDate = new SimpleDateFormat("yyyy�� MM�� dd��").format(now); // m�� '��'�� ������ �����ϱ� M���� ������. // �̷� ������ ��Ʈ�� Ÿ������ �޾ƿ�.
		System.out.println(titleDate); // <= �Ǹ��ϴ�
		String fileName = titleDate + "������ �н�����.txt";
		// �� ���ڿ��� ���ڿ��� ���ϱ⸦ �����ðڴٱ���?
		// ��Ʈ�����۸� ������ ������ ������.
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append(" ������ �н�����.txt");
		
		FileWriter fw = null; // ����� ���Ѿ��ϴϱ� ���⼭ ���� �� �ʱ�ȭ���� �� �� �����.
		Scanner sc = new Scanner(System.in);
		
		try {
		fw = new FileWriter(sb.toString()); // sb�� �������� toString ���ָ� ���ñ� ģ���� ���Ϳ�^-^ �Ƹ� ��µȴٴ� �ǹ��ε�
		System.out.print("���� �н��� ������ �ۼ��غ����� > ");
		String content = sc.nextLine();
		fw.write("���� �н��� ���� : \t" + content);
		
		} catch(IOException e) {
			System.out.println("��� ��� �����߻� ��� ���");
			
		} finally {
			
			try {
				if(sc != null) sc.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				System.out.println("�ڿ� �ݳ� �ϴٰ� ���� �߻� ��� ��� ���");
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
