package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// �����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ�
// �Է�/����ϴ� �޼ҵ���� �������
public class FileByteDao { //�ܺθ�ü�� ������ϴ� �޼ҵ带 DAO ��Ű���� �ִ� �Ŷ��????
	
	// ���Ͽ� �����͸� ���(Byte Stream ���)
	public void outputToFile() {
		
		// ��� : ���α׷� ���� �����͸� ������ �������ڴ�.
		// ���α׷� --> �ܺ�(����)
		// �������� ������ ������ ���α׷����� ���δ� OutputStream ���� ������.
		// �׷��� �츮�� ���Ϸ� �������� ���� �Ŷ� �տ� File���� �ٿ��ش�.
		// FileOutputStream : "����"�� �����͸� ����� ��, ���ϰ� �����ϴ� 1Byte ������ ��Ʈ��
		
		// 1. FileOutputStream ��ü ����
		// ���ϰ� �����ϴ� ��Ʈ���� �����ϴ� ����
		FileOutputStream fos = null;
		
		try {
		fos = new FileOutputStream("a_byte.txt"/*,true*/);
		// �Ű����� ������ ȣ�� ��
		// �� ��° ���ڷ� true ���� �����Ѵٸ� => �ش� ���� ���뿡 �̾ �ۼ�
		// �Ⱦ��� => �����
		
		
		// 2. ������θ� ������ �����͸� ��� : write() ȣ��
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		byte[] arr = {101, 102, 103};
		fos.write(arr);
		
		fos.write('A');
		fos.write('B');
		
		fos.write('��');
		fos.write('��');
		fos.write('��');
		
		// 1Byte�� ���� : -128 ~ 127
		// �ѱ��� 2Byte �̱� ������ ����
		// ����Ʈ ��Ʈ�����δ� �ѱ� / �Ͼ� / ���� �ذ��� �ȵ�
		// ���� ��Ʈ���� ����ؾ� �ذ��� ����
		
		// 3. ��Ʈ�� ����� �����ٸ� �ݵ�� �� ������ ����� �ʹ��ʹ� �ؾ��ϴ� �۾��� ����
		// �ڵ�󿡼� ����� ���� ����Ǿ��ٸ� �ڿ��ݳ��� ���־���� <-- ��ӡ١�
		// �ʹ� �����������������������������������������߿��߿��߿��߿��߿��߿��߿��߿��߿��� ���
		
		// �ڿ��ݳ� �ϴ� ��� �١ڡ١ڡ١ڡ١١ڡ١ڡ١�
		// .close() �١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�
		// fos.close();   <-- �ٵ� ���� ������ �ȵſ�. �߰��� ���ܹ߻����� ĳġ�ż� �ǳʶپ��� ���� �ְŵ��. �ٺ����δ� ������ ������ �������ϴµ� ....
		// G.C �������÷��Ͱ� ������ ���ϱ� ������ ������ �ݳ��ؾ��Ѵ�. �� �׷��� ������~~~~~~ �١ڡ١ڡ١ڡ١�
		// ��ĳ�ʵ� ������ sc.close(); ���ּž��մϴ�. �١ڡ١ڡ١ڡ١�
		
		return;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
			
		  return;
		  
		} finally { // ��𿡼� return �ϴ��� ������!!! finally �� �ȿ� �ִ� ������ ����
		
		try {
			if(fos != null) {
		fos.close(); // fos�� null�� �ƴ� ���� �ؾ��ؿ�. ���� �޼ҵ忡�� null�� �������ݾ�. // ���� return ���� �־ ������ ��ų �� �ִ� ����� �ִ�.
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		// ������ ȣ�� �� ���ڰ����� ���ϸ��� �����ϴµ� ���ϸ��� �������� ���� ���
		// �ش� ������ �����ϸ鼭 ��θ� ����
		
		}
		
	}
	
	
	// ���α׷� <== �ܺθ�ü(����)
	// �Է� : ���Ϸκ��� �����͸� ������ ���ڴ�.
	// FileInputStream
	// ���Ϸκ��� �����͸� �����ͼ� �Է¹��� �ǵ�, 1Byte ������ �Է¹ްڴ�.
	public void input() {
		
		FileInputStream fis = null;
		
		try {
			//1. ��ü ���� => ��Ʈ�� �����ϱ�
		fis = new FileInputStream("a_byte.txt");
		
		// 2. ��Ʈ������ �Է¹ޱ�
		// read() ȣ��
		// 1Byte ������ �о��
		/*System.out.println((char)fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read()); 
		System.out.println(fis.read()); 
		System.out.println(fis.read()); 
		System.out.println(fis.read()); */
		//������ ������ �����͸� �Է¹ް� ���� read()�� ȣ�� �� -1�� ��ȯ
		/*
		while(true) {
			int value = fis.read();
			if(value != -1) {
				System.out.println(value);
			} else {
				break;
			}
		}
		*/
			
		int value = 0;
		while((value = fis.read()) != -1) {
			System.out.println((value));
		}
			
		
		
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try { 
				if(fis != null) {
				fis.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
