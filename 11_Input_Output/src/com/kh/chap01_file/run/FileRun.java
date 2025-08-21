package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 정말 간단하게 소스코드를 이용해서 파일을 만들어보자
		// 우리가 작업하고 있는 프로그램을 기준으로 입/출력을 나눈다.
		// 외부에서 내 프로그램 안으로 들어오는 것은 무조건 입력이다.
		// 내 프로그램에서 밖으로 내보내는 것은 무조건 출력이다.
		// File 클래스를 가지고 작업을 합니다.
		// java.io 패키지에 존재합니다.
		
		// 파일클래스를 이용해서 객체 생성
		File file1 = new File("test.txt");
		
		try {
		// 파일 만들기
		file1.createNewFile();
		// createFile() : 파일 생성 메소드
		
		// 폴더 만들기
		// folder
		// 정식명칭은 directory
		// mkDir()
		File folder = new File("folder");
		folder.mkdir();
		
		// 경로지정까지
		File file2 = new File("folder/test.txt");
		file2.createNewFile();
		
		// 파일클래스에서 제공하는 메소드   <= 뭐 이런 것도 있다 ~~ 알아만두세요.
		System.out.println("파일 맞니?" + file2.isFile());
		System.out.println("파일명 : " + file2.getName());
		System.out.println("상위 폴더 : " + file2.getParent());
		System.out.println("절대 경로 : " +  file2.getAbsolutePath());
		System.out.println("파일 크기 : " + file2.length());
		
		
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		

	}
	
	/*
	 * => IO(Input & Output), 입/출력
	 * 
	 * 프로그램상의 데이터를 외부매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일")로 출력하거나
	 * 입력장치(마우스, 키보드, 마이크, "파일")로 입력받는 과정
	 * 
	 * IO를 진행하고 싶으면
	 * 우선적으로 반드시 프로그램과 외부매체간의 "통로"를 만들어야함.
	 * => 스트림(Stream)
	 * 
	 * 스트림의 특징 
	 * 
	 * - 단방향
	 * => 출력을 하고 싶으면 출력용 스트림 만들어야해 -> 출력밖에 못해
	 * => 입력을 하고 싶으면 입력용 스트림 만들어야해 -> 입력밖에 못해
	 * 
	 * - 선입선출(First In First Out) => 시간지연 문제가 발생할 수 있음
	 *  
	 *	스트림의 구분
	 * -> 스트림의 사이즈
	 * 바이트 스트림 : 1Byte 짜리가 이동할 수 있는 통로 (참고로 한글은 2바이트입니다.)
	 * 				=> 입력(XXXInputStream) / 출력(XXXOutputStream)
	 * 
	 * 문자 스트림 : 2Byte 짜리가 이동할 수 있는 통로 (한글, 일본어, 한자 이런 거 쓰려면 문자 스트림 써야합니다.)
	 * 				=> 입력(XXXReader) / 출력(XXXWriter)
	 * 
	 * -> 외부매체와의 직접적인 연결 여부
	 * 기반 스트림 : 외부매체와 직접적으로 연결되는 스트림
	 * 보조 스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도로 만들어진 스트림
	 * 				=> 단독 사용 불가(반드시 기반스트림이 존재해야만 사용이 가능함)
	 * 				=> 속도 향상, 자료형에 맞춰서 변환, 객체단위로 입출력, 바이트 <==> 문자
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */


}
