package com.kh.plant.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.kh.plant.model.vo.Plant;

public class PlantDao { // 얘가 모델, 나머지는 뷰 - 컨트롤러
	
	public void outputFile(List<Plant> plants) {
		
		try(BufferedWriter wr = new BufferedWriter(new FileWriter("plant.txt"))) {
			wr.write("\t\t\t\t식 물 목 록");
			wr.newLine();
			wr.newLine();
			wr.newLine();
			
			for(int i = 0; i < plants.size(); i++) {
				wr.write((i+1) + "번 " + plants.get(i).getName() + "\t\t\t\t" + plants.get(i).getType());
				wr.newLine();
			}
					
		} catch(Exception e) {}
	
		
	}
	
	
	

}
