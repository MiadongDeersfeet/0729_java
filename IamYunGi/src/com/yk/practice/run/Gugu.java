package com.yk.practice.run;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단을 출력할까요? > ");
		int i = sc.nextInt();
		System.out.println(i + "단을 출력합니다.");
		System.out.print("입력칸2 > ");
		int j = sc.nextInt();
		for(j = 1; j <= 9; j++) {
			System.out.println(i + "X" + j + " : " + (i * j)); 
		}
	}

}
