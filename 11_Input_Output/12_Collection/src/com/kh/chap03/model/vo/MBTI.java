package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {

	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	public MBTI() {
		super();
	}

	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFeeling, String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}

	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}

	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}

	public String getSensingiNtuition() {
		return sensingiNtuition;
	}

	public void setSensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}

	public String getThinkingFeeling() {
		return thinkingFeeling;
	}

	public void setThinkingFeeling(String thinkingFeeling) {
		this.thinkingFeeling = thinkingFeeling;
	}

	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}

	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}

	@Override
	public String toString() {
		return "MBTI [mbti : " + "introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition + ", thinkingfeeling=" + thinkingFeeling
				+ ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	
	// ��������� �츮�� �ؾ��� ��
	// �ʵ��� ���� �����ϴٸ�
	// equals() �� hashCode()�� �������̵� �ؼ� ������ ������� ��µǵ��� �����ؾ���
	
	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensingiNtuition, thinkingFeeling);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingiNtuition, other.sensingiNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	/*@Override
	public int hashCode() {
		// ��ü�� ������ �� �˾Ƽ� 10������ ���� ��ȯ
		// �ʵ尪 �Ȱ����� �Ȱ��� �ؽ��ڵ� ������ �ϰ� �ʹ�.
		String isfj = "I" + "S" + "F" + "J";
		isfj.toString().hashCode();
		"isfj".toString().hashCode(); 
		return (introversionExtroversion + sensingiNtuition + thinkingFeeling + judgingPerceiving).hashCode();
		
	}
*/
	
	

	
}
