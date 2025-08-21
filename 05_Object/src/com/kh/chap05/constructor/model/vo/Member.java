package com.kh.chap05.constructor.model.vo;

public class Member {
	
	
	// [ �ʵ�� ]
	// ���̵�, ��й�ȣ, �г���
	private String userId;
	private String userPwd;
	private String nickName;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	

	public String getUserPwd() {
		return userPwd;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public String info() {
		return "���̵� : " + userId + ", ��й�ȣ : " + userPwd + ", �г��� : " + nickName;
	}
	
	
	// [ �����ں� ]
	/*
	 * ������(Constructor) : ��ü�� �����ϴµ� ����ϴ� Ư���� ������ �޼ҵ�
	 * 
	 * [ ǥ���� ]
	 * ���������� Ŭ�����ĺ���(�Ű�����(��������)) {                    => public Constructor(???) {}
	 * 			�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ��� �ϴ� �ڵ�; (���� ���� �ְ� ������ ���� �ְ�)
	 * 			
	 * }
	 * 
	 * �������� ����
	 * -- ������� ���� : ��ü�� ������ �� � ���·� ������ �ؾ��ϴ°� (Ŀ�� ��� ��ü�� ����, ��� ��� ��ü�� ����.....)
	 * -- �������� ���� : ��ü�� ó������ ��ȿ�� ���¸� �������� ����
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �����ϴ� ������ => �Ű����� ������
	 * => ��ü�� ������ ���ÿ� ��ȿ�ϰ� ����� ���ؼ�
	 * 
	 * 
	 * 
	 */
	public Member() {         // <= ��� ������ �־����           // �̰� ������ ��~!
	   	// �⺻������(�Ű����� ����)
		System.out.println("�ȳ��ϼ���. �� �̸���?");
		// �⺻�����ڴ� ��ü�� ������ �������� ȣ���ؼ� ���
		// �⺻�����ڴ� �����ص� ������ �߻����� ����
		// Ŭ���� ���ο� �����ڸ� �ϳ��� �ۼ����� ������ JVM�� �⺻�����ڸ� �ڵ����� �������!
		// �����ڸ� �ϳ��� �����θ� JVM�� �����ڸ� �ڵ����� �ȸ�������.
		// �⺻�����ڸ� �׻� �ۼ�����!!!! �ڡڡڡڡڡ�
	}
	
	// �Ű������� �����ϴ� ������              Ŭ������ �ҹ��ڷ� ������ �޼ҵ��� �ν��ؿ�. ��ҹ��� ���� Ȯ����!!!!!!    �� ��ȯŸ�� (void) ��� �޼ҵ��� �����ؿ� !!!!
	public Member(String userId) {
		System.out.println("�Ű������� �� ���� ������");
	}
	
	public Member(String userId, String userPwd) {
		//System.out.println("�Ű������� �� ���� ������");
		//System.out.println("���޹��� ���̵� �� : " + userId);
		//System.out.println("���޹��� ��й�ȣ �� : " + userPwd);
		this.userId = userId;
		this.userPwd = userPwd;
		
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	/*
	 * 1. �ݵ�� �������� �̸��� Ŭ������ �̸��� �����ϰ� �ۼ��ؾ���(��/�ҹ��� ����)
	 * 2. ��ȯ���� �����ؼ��� �ȵȴ�. ��ȯ�� ������ �޼ҵ�� �Ǵ��ϱ� ����.
	 * 3. �Ű����� �����ڸ� ��������� �ۼ��ϸ� �⺻ �����ڸ� ��������� ����!
	 * => �츮�� �� �⺻�����ڸ� ������ ������ �ۼ��ϴ� ������ �鿩���Ѵ�!!!
	 * 4. �����ڴ� ������ �̸����� ���� �� ������ ���������� �Ű������� �ߺ��Ǿ �ȵ�!! => ������ �����ε�
	 */
	
	// [ �޼ҵ�� ]
	// 16:00�� �����е��� ���� �ð��̱� ������, �ǽ��� �帮�ڽ��ϴ�.
	// ��� �ʵ忡 ���� getter() / setter() ����� + ��� �ʵ��� ������ ���ļ� ��ȯ�ϴ� info �����
	// ����
	

}
