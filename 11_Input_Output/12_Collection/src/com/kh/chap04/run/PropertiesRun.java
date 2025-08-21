package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		
	// Properties : Map �迭 -> Key + Value ��Ʈ�� ������
	// �ܺ����Ͽ� ��/����� �ϱ����� �뵵
	// => Ȯ���ڰ� .properties ���Ϸ� ��/���
	// �������� �ʴ� ��������
	// �ش� ���α׷��� �⺻������ ������ �� �������� ��� ����
	Properties prop = new Properties();
	//MyProperties myProp = new MyProperties();
	// prop.put("Ű", new Fish());
	// myProp.put
	
	prop.setProperty("List", "ArrayList");
	prop.setProperty("Set", "HashSet");
	
	
	System.out.println(prop);
	
	try {
		// store(OutputStream os, String comment) : ���Ͽ� ����� �� ��
		//prop.store(new FileOutputStream("test.properties"), "���������");
		
		// �Է�
		// load(inputStream is) : �Է� ���� �� ��
		// prop.load(new FileInputStream("test.properties"));
		// System.out.println(prop.get("Map"));
		
		// XML�� ���
		prop.storeToXML(new FileOutputStream("test.xml"), null);
		
		// XML���� �Է¹��� �� loadFromXML(InputStream is);
		
		
		
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	
	}
}
