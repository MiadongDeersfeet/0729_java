package com.kh.chap02.loop;

public class B_While {
/*
 * while��
 * 
 * [ ǥ���� ]
 * 
 * �ʱ��; //���Ϲ� ���� ���� �־��. ��, �ʼ��� �ƴϿ���.
 * 
 * while(���ǽ�) {
 * 
 *		�ݺ������� �����ϰ��� �ϴ� �ڵ�; 
 * 		������;		// �ʼ��� �ƴ�
 *
 * }
 *  
 * while���� ���ǽ��� ������� true�� ��� �ݺ������� �����ϰ��� �ϴ� �ڵ尡 ����˴ϴ�. - �� !
 * 
 *   for			=> �����ڰ� �ݺ��� Ƚ���� ��Ȯ�ϰ� �˰� �ִ�.
 *   while			=> �����ڰ� �ݺ��� Ƚ���� ������ �� ����.
 *   
 *   ���ѹݺ�
 *   
 *   for(;;) 		=> �����ڵ��� �Ƹ�� �� �� ����. �Ǽ��ΰ�? ���ѹݺ��ΰ�? but while���� ��쿡�� ���ѹݺ��̶�� �ǵ��� �� �� ����.
 *  
 */
	
	public void method1() {
		while(true) { //���ѹݺ��� �뵵
			System.out.println("��� �ݺ��Ұſ���~~~~");
		}
		
	}
	
		public void method2() {
			
			// �ʱ��, ���ǽ�, ������ �������
			
			int i = 0;
			
			while(i < 3) {
				System.out.println(i);
				i++; // ���Ʒ� ������ �ٲ�� 0-1-2 ���� => 1-2-3 �� �� ���� �־��. �����ϼ���.
			}
			
	}
	
		public void method3() {
			
			// 1 ~ 10������ ���� �� ¦���� �� ���
			// 55
			// 2550
			// System.out.println(2 + 4 + 6 + 8 + 10); // �䱸������ ������ �׻� ������ �����ؾ��մϴ�.
			
			int i = 1;
			int save = 0; //�հ踦 �����ص� ����

			while(i <= 10) {
				if(i % 2 == 0) {
					save += i;
				}
				
				i++;
				
			}
				System.out.println("�հ� : " + save);


				
		}
		
		public void method4() {
			
			// �հ� sum
			// 1���� �����ؼ�
			// 1 ~ 10 ������ ������ ���������� ��� ���� �հ踦 ���
			// 1	   5
			// 1 2 3 4 5
			// 1   3
			// 1 2 3
			// random : ������
			// Random�̶�� Ŭ������ ����
			// Math��� Ŭ������ ������ �ִ� random() �޼ҵ带 ȣ���ؼ� ����� �� ����
			
			// Math math = new Math(); // ��Ī���� Ư�����̽� // �����ֿ� �սô�
			//Math.random();
			//System.out.println(Math.random());
			//0.10771321719494875
			//0.0031122875405408257 ���� Ÿ���� �Ǽ�
			// random()�� ����� : 0.0 ~~~~ 0.9999999999999999
			
			// 1�ܰ�. random() ȣ�� ��� üũ
			double num = Math.random();
			//System.out.println(num);
			// 1 ~ 10
			
			// 2_1. num �� 10�� ���ϸ�??
			// 0.0 ~~~~ 9.9999999999999999
			//System.out.println(num * 10);
			// 2_2. int���� ������ ��ȯ
			//		0 ~~~~ 9
			//System.out.println((int)(num * 10)); //��ȣ �� ġ�ž��ؿ�.
			// 2_3. +1
			//		1 ~~~~ 10
			
			int randomNum = (int)(Math.random() * 10) + 1;
			System.out.println("������ ���� ������ ���� : " + randomNum); //8
			// (int)(Math.random() * 10) + ���۰�; // +100 �ߴ� �׷� 100���� ����, +10�ߴ� �׷� 10���� ����
			// �׷��� ���ϱ� 10�� ����? ������, ��� �������� �����ų�~~�� ���� // 100���� �ϰ������ ����� *100) + 1 �� �Ǵ°Ű�....
			
			// 3�ܰ�. �����հ� ���ϱ�
			// 1���� ������ �� (1 ~ 10)������ ��� ���� �հ�
			
			int i = 1;
			int sum = 0;
			
			// 1���� 10������ ���������� �ݺ��ϰڴ�.
			while(i <= randomNum) {
				sum += i;
				i++;
			}
			System.out.println("1���� " + randomNum + "���� ���� ��� : " + sum); // 36
		}
		
		public void lotto() {
			
			// �ζ� ��ȣ ������ ver_0.1
			// ���� : 1 ~ 45
			// 6�� ����
			// 1 ~ 45 ���� �� ������ �� �ϳ��� �̾� ������?
			// (Math.random() * 45)  // 0~0.9999999999999999
			// 0.0 x 45 = 0.0 �̰�, 0.0 ~ 44.999999999
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("�̹��ִ� �̰ɷ� ��߰ڴ� > ");
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		
		
		
		}
		/*
		 * do-while
		 * 
		 * ������ ���ǰ˻� ���� ������ �� ���� ����!!!!!!!!!!!!!!!!
		 * ������ true���� �ƴϴ��� �� ���� �� ����!!!!!!!!!!!!!!!
		 *
		 * [ ǥ���� ]
		 * 
		 *  �ʱ��; // �ʼ� X
		 * 
		 * do {
		 * 		�������ڵ�;
		 * 	 	������; // �ʼ� X
		 * } while(���ǽ�);
		 */
		
		public void method5() { //do-while
			/*
			while(false) {
				System.out.println("�յ� �̰�");
				
			}
			*/
			
			do {
				System.out.println("���� �� ���� ����~~");
			} while(false);
		}
		
		
	
}
