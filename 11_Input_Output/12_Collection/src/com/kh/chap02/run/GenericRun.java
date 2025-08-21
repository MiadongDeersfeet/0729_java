package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class GenericRun { // ���׸��� �ؾ��� ����Ʈ�� ������.

	public static void main(String[] args) {
		/*
		 * ���׸� <Generic> 
		 * 
		 * �÷����� ����ϸ鼭 �ٷ���� �ϴ� Ÿ�Ե��� �̸� ������ �� �ִ� ��� 
		 * => ��������� <Integer>, <Plant>
		 * => Ư�� Ÿ���� ��ҵ鸸 �÷��ǿ� ���� �� �ֵ��� ������ �� ���� 
		 * 
		 * ������ ���׸� ���� �÷��� ��ü ���� (E == Object)
		 * 
		 * 1. �ٷ� ����� Ÿ���� ������ �� ���� => �Ǽ��� ���� �� ����
		 * 2. �� �� ����ȯ�ϴ� ������ ���� �� ���� => �ڵ� © �� �� ����
		 */
		int i = 1;
		System.out.println((Object)i);			// <= �⺻�ڷ��� ���ε� �̰� Object �� �迭�� ��� ���� �ſ���.  
		
	//	ArrayList<Plant> plants = new ArrayList();            //  <=  ���� �� ���ٴ� �̾߱� // <Plant> �߰� : ���� �÷�Ʈ�� ���� �� �ִ� ��� ����Ʈ�� ���� �ž�.
		List<Plant> plants = new ArrayList(); //  <=  ���� �����ڶ�� �̷��� ���ִ� �� ���������� �����ϴ�. ū ���̴� ������...^^; ���� Ŭ������ List ���⿴���ϴ�.
		plants.add(new Plant("����", "�꼼������"));
		//plants.add("����"); // <Plant> �����ϱ� �ȵǳ�???
		plants.add(new Plant("����", "�˶�"));
		//plants.add(1); // <Plant> �����ϱ� �ȵǳ�???
		//plants.add(1.1); // <Plant> �����ϱ� �ȵǳ�???
		
		String name = ((Plant)plants.get(0)).getName();
		// �Ʊ�� �䷸�� �̾Ҿ����. �ٵ� ���׸��� �޾ұ� ������ ���� �÷�Ʈ�ۿ� �����׿�???
		
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		
		
		
		

	}

}
