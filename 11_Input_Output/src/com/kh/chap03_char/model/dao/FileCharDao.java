package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void outputToFile() {
		// XXXWriter ---> "아 이거 2Byte 문자 스트림이구나!"
		// FileWriter ---> 파일로 데이터를 2Byte 단위로 출력하는 스트림
		
		// 0. 스트림선언
		/*FileWriter fw = null;
		
		try {
			// 1. 스트림생성
			fw = new FileWriter("b_char.txt");
			
			// 2. 데이터출력 => write()
			fw.write("와....IO...신기하당...");
			fw.write("E");
			
			
		} catch(IOException e) {
			System.out.println("다시 시도해주세요.");
		} finally {
			// 3. 자원반납 => 꼭 지켜야하는 약속 => close()
			try {
				if(fw != null) {
				fw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	} */
	
		/* 자동반납 기능
		 * try ~ with ~ resource 구문
		 * 
		 * - JDK 7이상부터 사용가능
		 * 
		 * try(스트림객체생성; ...) {
		 * 	예외가 발생할 수도 있는 구문;
		 * } catch(예외클래스 e) {
		 * 	예외가 발생했을 때 실행할 구문;
		 * }
		 * 블럭이 끝나는 시점에 close()를 호출해서 자동으로 자원을 반납해준다.
		 * 혹여나 할 수도 있는 실수를 줄일 수 있는 아주 훌륭한 문법이다.
		 * 
		 * 근데 전제조건이 있어요.
		 * Closeable 인터페이스를 구현할 것.
		 */
	
	try(FileWriter fw = new FileWriter("c_char.txt")) {
		fw.write("와..IO..ㅎㅎ..");
		fw.write("E");
		
	} catch(IOException e) {
		e.printStackTrace();
	}
	} //<=== 트라이를 위와 같이 쓰면 사람이 하는 실수를 줄여준댜~~~
	
	public void writeTil() {
		
		// 사용자에게 오늘 학습내용을 입력받아서
		// 외부 파일에 내용을 출력
		
		// 내보낼 파일명은 : 2025년 08월 14일 오늘의 학습일지
		Date now = new Date(); // java.util.date 쓰세요~!
	//	System.out.println(now); // Thu Aug 14 17:21:14 KST 2025 => 2025년 08월 14일 모양으로 가공해보자.
		// 2025년 08월 14일
		String titleDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(now); // m는 '분'이 가지고 있으니까 M으로 쓰세요. // 이런 형식의 스트링 타입으로 받아요.
		System.out.println(titleDate); // <= 훌륭하다
		String fileName = titleDate + "오늘의 학습일지.txt";
		// ↑ 문자열과 문자열의 더하기를 참으시겠다구요?
		// 스트링버퍼를 쓰던가 빌더를 쓰던가.
		StringBuilder sb = new StringBuilder();
		sb.append(titleDate);
		sb.append(" 오늘의 학습일지.txt");
		
		FileWriter fw = null; // 약속을 지켜야하니까 여기서 선언 및 초기화까지 할 순 없어요.
		Scanner sc = new Scanner(System.in);
		
		try {
		fw = new FileWriter(sb.toString()); // sb만 찍지말고 toString 해주면 뭐시기 친구가 나와요^-^ 아마 출력된다는 의미인듯
		System.out.print("오늘 학습한 내용을 작성해보세요 > ");
		String content = sc.nextLine();
		fw.write("오늘 학습한 내용 : \t" + content);
		
		} catch(IOException e) {
			System.out.println("비상 비상 문제발생 비상 비상");
			
		} finally {
			
			try {
				if(sc != null) sc.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				System.out.println("자원 반납 하다가 문제 발생 비상 비상 비상");
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
