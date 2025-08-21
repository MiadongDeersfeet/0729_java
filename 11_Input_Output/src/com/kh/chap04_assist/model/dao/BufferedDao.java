package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BufferedDao {

	// 기반스트림이 input / output 계열일 경우
	// 보조스트림도 input / output 계열을 사용할 수 밖에 없다.
	
	// 기반스트림이 Reader / Writer 계열일 경우
	// 보조스트림도 Reader / Writer 계열을 사용할 수 밖에 없다.
	
	// BufferedReader / BufferedWriter
	
	// -> 속도 향상이 목적인 보조스트림이다.
	// -> 임시공간을 제공해서 한 번에 모아두었다가 한꺼번에 입/출력을 진행
	
	// [ 표현법 ]
	// 기반스트림클래스이름 기반스트림 = new 기반스트림생성자(외부매체인자값);
	// 보조스트림클래스이름 보조스트림 = new 보조스트림생성자(기반스트림주소값);     <= 보조스트림은 기반스트림이 '있어야지만' 사용할 수 있어요.
	
	// 출력은 뭐하는 거예요? 프로그램에서 밖으로 데이터를 내보내는 것
	public void outputFile() {
		
		// BufferedWriter
		
		// 0. 변수 선언!     <=  IO익셉션 발생할 수 있고 try catch 하면 자원값 반환이 안될 수가 있고 해서 따로따로 선언합니다.
		FileWriter fw = null;
		BufferedWriter bw = null;
		
	try {
		// 1. 객체 생성
		fw = new FileWriter("c_buffer.txt");
		bw = new BufferedWriter(fw); // 기반스트림 주소값을 전달해줘야 살아남을 수 있는 기생충
		
		// 2. 출력 => write()
		bw.write("하이~~~");
		bw.newLine(); // 버퍼드 라이터는 뉴라인도 있어요. 개행하기. 쏠쏠합니다.
		bw.write("반가워용~~~~");
		
		
	} catch(IOException e) {
		e.printStackTrace();
	} finally {
		// 3. 자원반납 => close()
		// 자원반납은 반드시 생성의 역순으로 반납합니다. (우리같은 경우에는 보조스트림 -> 기반스트림 순)
		// 파이널리로 넣어놓은 예외처리 순서를 잘 보고 생각해보세요. 왜 이 순서인지!!!!
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
	
	// 입력
	public void inputFile() {
		// FileReader를 기반으로 BufferedReadr를 사용해서 입력받기
		
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
