package com.kh.chap01.run;

import com.kh.chap01.model.vo.ItalyFood;
import com.kh.chap01.model.vo.JapanFood;
import com.kh.chap01.model.vo.KoreaFood;

public class Run {

	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood("�����", "��", 5, 2);
		ItalyFood yf = new ItalyFood("�⸧�Ľ�Ÿ", "�⸧", 15, 5);
		JapanFood jf = new JapanFood("����", "��", 10, 10);
		
		System.out.println(kf.information());
		System.out.println(yf.information());
		System.out.println(jf.information());
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
