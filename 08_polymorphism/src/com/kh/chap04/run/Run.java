package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.vo.Bong;
import com.kh.chap04.model.vo.Hong;
import com.kh.chap04.model.vo.Jjimdak;

public class Run {

	public static void main(String[] args) {
		
		// ¼Õ´ÔÀÌ Âò´ß½ÃÄÑ¾ßÁö ~ °¡Á¤
		
		System.out.println("Âò´ß ÁÖ¹® ¼­ºñ½º¿¡ ¿À½Å °ÍÀ» È¯¿µÇÕ´Ï´Ù.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÁÖ¹®ÇÏ½Ç Âò´ß ºê·£µå¸¦ ¼±ÅÃÇÏ½Ã±â ¹Ù¶ø´Ï´Ù.");
		System.out.println("1. È«Âò´ß");
		System.out.println("2. ºÀÂò´ß");
		System.out.print("¸Þ´º¸¦ ¼±ÅÃÇØÁÖ¼¼¿ä > ");
		int menuNo = sc.nextInt();
		
		Jjimdak dak = null;
		
		switch(menuNo) {
		case 1 : dak = new Hong(); break;
		case 2 : dak = new Bong(); break;
		}
		
		dak.order();
		
	}

}
