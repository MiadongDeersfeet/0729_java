package com.kh.chap03.model.vo;

// 1��
/*    <=  �츮�� �̷� �� ���� ���ϰ� ����� �� �־���. extends �� �⺻������ �Ǿ��ֱ� �����Դϴ�.
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.lang.*;
*/

public class LastTime extends Object {

	// ��� Ŭ������ �ֻ��� �θ�Ŭ���� => Object => ��������
	private String name;
	
	public LastTime() {
	 /* super(); */
	}
	
	public LastTime(String name) {
		/* super(); */
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		/*return;*/ // ���� �־���ϴµ� �����Ǿ����� �� => �ڵ�����
	}
	
	/*
	 * Overriding �������̵�
	 * 
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������(�ٽþ�)
	 * - �θ�Ŭ������ �����ϰ� �ִ� �޼ҵ带 �ڽ��� ���ļ� ����ϰڴٴ� �ǹ�
	 * - �ڽ�Ŭ������ �����ϴ� �������̵� �� �޼ҵ尡 �켱���� ������ ȣ��ǰ� ��
	 * 
	 * �������̵� ���� ����!
	 * 
	 * 1. �θ�޼ҵ�� �޼ҵ�� ����
	 * 2. �Ű������� �ڷ���, ����, ������ ����(��������� ������)
	 * 3. ��ȯ���� ����
	 * 4. �θ�޼ҵ��� ���������ں��� ���������� ���ų� �а� ����
	 * 
	 * -- �����ڵ鳢���� ���
	 * 
	 * *** �������̵��� �޼ҵ忡�� �ݵ�� @Override �������̼��� �ٿ�����
	 * 
	 * @Override
	 * annotation
	 * ������ �ּ�
	 * - ���� ����
	 * - �� ������ �ʴ��� �θ�޼ҵ�� ���°� ������ �������̵����� �Ǵ�
	 * 
	 * �� �ٿ����ϳ���??
	 * => �Ǽ��� ���� �� �ִ�!
	 * => �������� �������̵��̶�� �˾ƺ� �� ����.("�θ�Ŭ������ �ٽ� ���~!")
	 */
	@Override
	public String toString() { // ������ info �� ����� �ʿ䰡 ���ڳ׿�?
		return "LastTime [name=" + name + "]";
	}
	
}
