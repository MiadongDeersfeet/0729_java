package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BufferedDao {

	// ��ݽ�Ʈ���� input / output �迭�� ���
	// ������Ʈ���� input / output �迭�� ����� �� �ۿ� ����.
	
	// ��ݽ�Ʈ���� Reader / Writer �迭�� ���
	// ������Ʈ���� Reader / Writer �迭�� ����� �� �ۿ� ����.
	
	// BufferedReader / BufferedWriter
	
	// -> �ӵ� ����� ������ ������Ʈ���̴�.
	// -> �ӽð����� �����ؼ� �� ���� ��Ƶξ��ٰ� �Ѳ����� ��/����� ����
	
	// [ ǥ���� ]
	// ��ݽ�Ʈ��Ŭ�����̸� ��ݽ�Ʈ�� = new ��ݽ�Ʈ��������(�ܺθ�ü���ڰ�);
	// ������Ʈ��Ŭ�����̸� ������Ʈ�� = new ������Ʈ��������(��ݽ�Ʈ���ּҰ�);     <= ������Ʈ���� ��ݽ�Ʈ���� '�־������' ����� �� �־��.
	
	// ����� ���ϴ� �ſ���? ���α׷����� ������ �����͸� �������� ��
	public void outputFile() {
		
		// BufferedWriter
		
		// 0. ���� ����!     <=  IO�ͼ��� �߻��� �� �ְ� try catch �ϸ� �ڿ��� ��ȯ�� �ȵ� ���� �ְ� �ؼ� ���ε��� �����մϴ�.
		FileWriter fw = null;
		BufferedWriter bw = null;
		
	try {
		// 1. ��ü ����
		fw = new FileWriter("c_buffer.txt");
		bw = new BufferedWriter(fw); // ��ݽ�Ʈ�� �ּҰ��� ��������� ��Ƴ��� �� �ִ� �����
		
		// 2. ��� => write()
		bw.write("����~~~");
		bw.newLine(); // ���۵� �����ʹ� �����ε� �־��. �����ϱ�. ����մϴ�.
		bw.write("�ݰ�����~~~~");
		
		
	} catch(IOException e) {
		e.printStackTrace();
	} finally {
		// 3. �ڿ��ݳ� => close()
		// �ڿ��ݳ��� �ݵ�� ������ �������� �ݳ��մϴ�. (�츮���� ��쿡�� ������Ʈ�� -> ��ݽ�Ʈ�� ��)
		// ���̳θ��� �־���� ����ó�� ������ �� ���� �����غ�����. �� �� ��������!!!!
		try {
			if(bw != null) {
				bw.close();
		  }
		
			
		} catch(IOException e) {
			e.printStackTrace();
		  }
		try {
			if(fw != null) {
			fw.close();
		  }
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
			
		
		
	}
	
	// �Է�
	public void inputFile() {
		// FileReader�� ������� BufferedReadr�� ����ؼ� �Է¹ޱ�
		
		try(BufferedReader bfr = new BufferedReader(new FileReader("c.buffer.txt"))) {
			
			String str = "";
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch(IOException e) {
		e.printStackTrace();
	}
  }	
	
	
}
