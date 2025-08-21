package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {

	private boolean on;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "KBS World Arabic";
		channel[1] = "이상한 변호사 우영우";
		channel[2] = "모태솔로지만 연애는 하고싶어";
		channel[3] = "파우다 : 혼돈";
		channel[4] = "슈티셀가 사람들";
	}
	
	public String[] getChannel() {
		return channel;
	}
	
	public boolean isOn() {        // getter
		return on;                 // Getter 에서 boolean 타입은 get 대신에 is를 붙여요.
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	
	
	
	
	
}
