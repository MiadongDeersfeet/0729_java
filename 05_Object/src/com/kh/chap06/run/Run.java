package com.kh.chap06.run;

//import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
	//	Human human = new Human(); // �޸� Ÿ���� �ּ� ������ �����ϰ� new �� �Բ� �޸��̶�� ��ü�� �����ڸ� ȣ���ؼ� ������ ���� �޸� Ÿ���� �ּ� ������ �������ش� ???
	//	MethodController mc = new MethodController();
	//	int a = mc.add(1, 2);
	//	int b = mc.add(2, 3);
	//	int c = mc.add(5, 6);
	//	int d = mc.add(a, b);
	//	int e = mc.add(c, d);
	//	System.out.println("���� : " + e);
		
	//	MethodController mc = new MethodController();
		// int[] dd = new int[3] ;
		//mc.method1();
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		//System.out.println(mc.method2());
		//System.out.println("method3 ȣ�� ��� : " + mc.method3());            // <= ����?          �Ű������� �������� ������ ��ȯ���� �����մϴ�.
		                                                                                     // method3 ȣ�� ��� : returnValue
		//mc.println("method3 ȣ�� ��� : " + mc.method3());
		//mc.method4(2);
		
		//int result = mc.method5(5);
		//System.out.println(result);
		//mc.a();
		// mc.test(mc); �������� : ���� �ٸ� ������ ���� �ּҸ� ����Ŵ (�迭���� ���) �١ڡ١ڡ١ڡ١ڡ١�
		
		//mc.staticMethod();
		
		// ��ü�� �������� �ʰ� �޼ҵ带 ȣ���� �� ���� -- static�� �� ���?
		/*
		Math.random();
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr)); // toString ������? ����ƽ�̳�. ��ü ���� ���� �����ؼ� ��� �����ϳ�.
	
		MethodController.staticMethod();
		
		mc.haha();;
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("���?");
		System.out.println(mc);
		System.out.println();
		*/ // <=== ��� �� �ſ�? �޼ҵ� �����ε��� �����Ǿ��ֱ� �����Դϴ�.
		
		OverloadingController oc = new OverloadingController();
		
		// ���� ���ε�(Static Binding <= ���� ����ƽ�� �޸� �̾߱� �ƴմϴ�.)
		// �������� ���� ���� � �޼ҵ尡 ȣ����� ����
		// �����Ϸ��� �˾Ƽ� �ڵ带 �м��Ͽ� �޼ҵ� ȣ�� ����
		oc.test();
		oc.test(2);
		oc.test("3");
		oc.test(4, 4);
		oc.test(5, 5, 5);
		
		
		
		
	}

}
