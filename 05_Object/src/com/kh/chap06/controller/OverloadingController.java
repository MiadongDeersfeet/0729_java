package com.kh.chap06.controller;

public class OverloadingController {
		/*
		 * �޼ҵ� �����ε� (method Overloading) �١ڡ� => �����ܰ�����
		 * 
		 * - �ϳ��� Ŭ���� �ȿ� ������ �޼ҵ� �ĺ��ڷ� ���� ���� �޼ҵ���� ������ �� �ִ� ���!
		 * - �Ű����� �ڷ����� ����, ����, ���� �ٸ��� �ۼ��ؾ���!
		 * - ����� �Ű����� �ĺ���, ����������, ��ȯŸ���� �޼ҵ� �����ε��� �ƹ��� ������ ��ġ�� ����!
		 */

		//�޼ҵ���� test�� ����

		public void test() {
			System.out.println("�޼ҵ� �����ε� �׽�Ʈ 1");
		}
		
		public void test(int num) {
			System.out.println("�޼ҵ� �����ε� �׽�Ʈ 2");
		}

		public void test(String str) {
			System.out.println("�޼ҵ� �����ε� �׽�Ʈ 3");
		}

		public void test(int a, int b) {
			System.out.println("�޼ҵ� �����ε� �׽�Ʈ 4");
		}
		
		public void test(int c, int d, int e) {
			System.out.println("�޼ҵ� �����ε� �׽�Ʈ 5");
		} // �ڷ����� ����, ������ �����ϸ� ������ �Ұ����մϴ�.
			
		/*public String test(int c, int d) {
			
		}*/
		
		/*private void test(int c, int d) {
			
		}*/
		
		public String test(String a, int b) {
			return "";
		} // <== �̰� �ǳ�?
				
	//	public void test(int a, String b) {
		
	//	}
		
	}

