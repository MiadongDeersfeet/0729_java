package com.kh.chap04.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticController;

public class Run {

	public static void main(String[] args) {
	
		System.out.println(StaticController.str);
		
		FieldController fc = new FieldController();
		// 1. FieldController �ڷ������� fc��� �̸��� ���������� ����
		// 2. ��ü ���� (new Ű���带 ������ ��) �ڡڡڡڡ� 2�� ������ �߿��ϴٱ���   =>  2������ global ��������� ������ �Ҵ�
		// 3. �ּҰ��� ����
		
		//System.out.println(fc.global);
		
		
	fc.checkVariable(50);
	// checkVariable ȣ�� == parameter(�Ű�����) �Ҵ� �� �ʱ�ȭ
	
	// checkVariable ȣ�� �����
	// parameter, local �������� �Ҹ�   => �׷��� global�� ������ ����־��.
	
	System.out.println(fc.global);
	fc = null; // �ΰ��� �����ϴ� �� �������� �۷ι��� ���Ҵ��� �ȴ�.
	
	//System.out.println(fc.global);
	
	// ��ǥ : str ����ϱ�
	/*
	StaticController sc = new StaticController();
	System.out.println(sc.str);
	*/ //����ƽ�� �̷��� �Ⱦ��ϴ�.
	System.out.println(StaticController.str); // 1��
	System.out.println(StaticController.JAVA_VERSION);
	
	System.out.println(Arrays.toString(new int[2])); //Arrays �빮�ڴϱ� Ŭ�����ڳ�?
	System.out.println(Math.random()); // 0.0 ~ 0.9999999999999999~ ��ü���� ���ߴµ� �޼��� ȣ���� �ǳ�? ���� ���ϱ� �� �����ֳ�? ����ƽ�̴�~~~~�������� ���ƿԴٴ� ����
	                                   // �� �޼����� ��ȯ Ÿ���� �����̴�
	System.out.println(Math.PI); // ������ ������� �߳� ����ƽ ���̳��̱�. �ۿ��� ���̷�Ʈ�� �θ� �� �־��.
	
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt(); // �޼��尡 ���ܸ����� ��ȯŸ���� ��Ʈ�ϱ� ��Ʈ�ۿ� �ȵǰ�
	String str = sc.nextLine(); // ��� �޼��尡 ���ܸ����� ��ȯŸ���� ��Ʈ���̴ϱ� ��Ʈ���ۿ� �ȵǰ�

	/*
	 * AccessModifier(���������� / ����������)
	 * (+)public => ��𼭵�(���� ��Ű��, �ٸ� ��Ű��, Ŭ���� ����, Ŭ���� �ܺ� ���� ����) ���� ����
	 * 
	 * (#)protected => ���� ��Ű����� ������ ���� ����!
	 * 			 => �ٸ� ��Ű����� ��ӱ����� Ŭ���������� ���� ����
	 * 			 => ����̶�� ������ 05_Object / 06_ObjectArray(��ü�迭) ������ 07������ ��� ��
	 * 
	 * (~)default(package friendly) => ������ ���� ��Ű�������� ���� ����
	 * 
	 * (-)private => ���� Ŭ���� ���ο����� ���� ���� (������ ����� ���� ����� ������)
	 * 
	 *
	 */
	}
	//public||protected||private in num; �̷� ������ ���µ� int num; �׳� �̷��� ���������� ���� ���� ����Ʈ��. (�츮����� ����Ʈ ��ȣ, �ܱ����� ��Ű�� �����鸮��� �� ��ȣ)
}
