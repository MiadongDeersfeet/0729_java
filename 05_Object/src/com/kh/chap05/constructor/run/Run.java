package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {
	
	public static void main(String[] args) {
		
		Member member = new Member();   // new ��ü����  ->   Member()  ��ü�� �ʱ� ���¸� �����ϴ� ������ = ��ü ������
		/*                                     => ȸ�������� ������ Member �� �������ٵ� ������ �� null ���̳�? -- ��ȿ���� ���� ����(������ ����)
		member.setUserId("deersfeet");
		member.setUserPwd("ABC1234567890!");
		member.setNickName("�罿��");
		
		String info = member.info();
		System.out.println(info);
		*/
		Member member2 = new Member("����ȣȣ");
		
		Member member3 = new Member("user01", "1234"); 
		// ������ ���ÿ� �ö󰡿�.  =>   ���� new �� �Ǵ� ���� �̹� �ʵ尡 �ö󰡰� . => �⺻�� null , null , null �� ���ְ��� => �׷����� �����ڸ� ȣ��
		// �����ڸ� ȣ���ϸ� ���ڰ��� �ش� �Ű������� ���� => �� ������ �Ű������� �� ���� �ʵ忡 �ִ� ���� �ʱ�ȭ �ſ� => �׸��� �ּҰ��� member3�� ����.
		System.out.println(member3.info());
		// ������� �Ű����� ���� �� ȣ�� , �� �� �ִ°� ȣ��, �� �� �ִ°� ȣ��
		
		Member member4 = new Member("deersfeet", "392766", "�̾Ƶ��罿��");
		System.out.println(member4.info()); // ��� �� �ű��ϴ�
	
		
	}

}
