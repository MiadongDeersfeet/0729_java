package com.kh.chap07.remote.model.vo;

// �ʿ��� ������ �����ϴ� ����
public class Television {

	private boolean on;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "KBS World Arabic";
		channel[1] = "�̻��� ��ȣ�� �쿵��";
		channel[2] = "���¼ַ����� ���ִ� �ϰ�;�";
		channel[3] = "�Ŀ�� : ȥ��";
		channel[4] = "��Ƽ���� �����";
	}
	
	public String[] getChannel() {
		return channel;
	}
	
	public boolean isOn() {        // getter
		return on;                 // Getter ���� boolean Ÿ���� get ��ſ� is�� �ٿ���.
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	
	
	
	
	
}
