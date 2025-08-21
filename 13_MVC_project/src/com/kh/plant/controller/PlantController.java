package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

// Controller : ����ڰ� View�� ���� ��û���� ��
// ��û�� �޾� ó������ �� �ٽ� ó������� View�� ��ȯ����
public class PlantController {
	// �Ĺ������
	private List<Plant> plants = new ArrayList(); //�⺻�����ڷ� ȣ���ϸ� 10ĭ�Դϴ�. // Ÿ���� List (����Ŭ����) �� ���ָ� ���߿� �� ���� LinkedList�� �ٲ� �� ������.
													// �Ĺ��� �����ϴϱ� ���׸����� �޾��ָ� ������. �Ĺ��� �ϳ����� �̸� �־��ָ� ���� �� ������ ��� �ұ��?
													// �����ڿ� �ִ� ���, �ʱ�ȭ��Ͽ� �ִ� ���.
	private PlantDao pd = new PlantDao();
	
	// �ʱ�ȭ���
	{ // �ʱ�ȭ����� ������ ȣ�� ������ �����ȴ�.
		plants.add(new Plant("�Ƚø���", "����"));
		
	}
	
	// View ���� �Ĺ� �߰� ��û�� �� ������ ȣ��Ǵ� �޼ҵ�
	public void createPlant(String name, String type) {
		// 1�� => ��ü ����
		Plant plant = new Plant(name, type);
		// �ּҸ� ������ �ϴ� ���Ҵµ� �� ������ �������� ������ ��ȿ����. �׷��� �������� �� �ּҸ� ����Ű�� �־��(��������) �갡 ��Ƴ��� �� �־��. // ����Ʈ�� ������ �ִ� ������Ʈ�� �迭�� �� ģ���� ����Ű�� �ϰڴٱ���.
		
		// �Ĺ�����ҿ� ���ο� �Ĺ��� �߰�
		// �ʵ�� ������ �ִ� List�� �ʵ�� ������ �ִ� Object[]�� ��ҷ� �߰�
		// ��� �߰������? �̰� �ڹٿ��� �� �� �ְ� �̹� �������ٰ�.
		plants.add(plant); // ����Ʈ�� �����ؼ� add�� �ִ´ٱ���.
		
	}
	
	// View���� ��ü �Ĺ���ȸ ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
	public List<Plant> readAll() {
		// Plant Ÿ���� ��ü���� �ּҰ� ��ҷ� �����ϴ� Object[]�� View���� ��ȯ. // Object�� �迭�� ��Ʈ�ѷ����� X ����Ʈ���� �־��.
		// ����Ʈ�� private ���� ������ �Ұ����ؿ�. �׷� Object�� �迭�� �ּҸ� ������ �ִ� �ʵ��� plants �� ��ȯ������մϴ�.
		// �׷��ٸ� ��ǻ� �� ���� getter �Դϴ�.
		return plants; // ����Ʈ ������� �����ؿ�^^! �ʵ� �����ִ� �� => getter
	}
	
	// View ���� �Ĺ� ���� ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
	
	public int deletePlant(String name, String type) {
		// ����ڰ� �Է��� �Ĺ��̸� + �Ĺ������� ��ġ�ϴ� �ʵ尪�� ���� Plant ��ü�� ����
		// case 1. ������ �̸� �� ������ ���� �Ĺ��� �������� �ʾҴ�.
		// case 2. ������ �̸� �� ������ ���� �Ĺ��� �� �Ѱ� �����ߴ�.
		// case 3. ������ �̸� �� ������ ���� �Ĺ��� ���� �� �����ߴ�.
		// �������п� ���� View���� ��ȯ���� �ٸ��� �����־�� ��.
		
		// �Ĺ��� ������ �� ���ŵ� Plant ��ü�� ��Ƽ� ��ȯ
		// �츮�� �Ϸ��� ���� Plant p = plants.remove(2); ���� ���� ���̰�
		// List returnList = new ArrayList();
		// retrunList.add(p);
		// return returnList;
		
		// ���� ����ó�� �� �ʿ� ���� ��Ұ� ������ ������ �������� ������Ű��
		// ������ ������ ��ȯ *��������� �����ڸ� int ������
		
		int count = 0;
		
		// ��ûó��   --- ��� � �Ĺ��� �ִ��� �𸣴ϱ� �ᱹ ó������ ������ �ݺ����� ������ �� �˻縦 �ؾ��ϴµ� �׷� ��¿ �� ���� �� �� �ִ°� for �Դϴ�.
		for(int i = 0; i < plants.size(); i++) { // ���⿡ ����ִ� name / type ���� ����ڰ� �Է��� ���� �Ѵ� ������ ���ǰ˻縦 �ϰ� ��ġ�ϸ� remove �ϰ� ���� ����.
			if(name.equals(plants.get(i).getName()) &&
					type.equals(plants.get(i).getType())) {
				// �� ��Ҹ� ����(��ġ�ϴ� ���)
				plants.remove(plants.get(i));
				i--; //�������� �ذ��
				count++;
				
			}
		
		}
		
		return count;
		
	}
	
	public List<Plant> findByKeyword(String keyword) { // View�κ��� �˻� ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
		
		// 1. Plant[] => �迭 ��ĭ¥��?? ���̸� Ư������ �Ƹ�� ����??
		// 2. List<Plant>
		
		List<Plant> searched = new ArrayList();
		
		// �Ĺ��� �̸� �Ǵ� Ÿ�Կ� ����ڰ� �Է��� Ű���尡 ���ԵǾ����� ���
		// �α׸� ���� �� ����� ������� ��
		// �̰� �ٷ� "��ȸ"����. �����е��� ����� ���� 80���� �̻��� �� ��ȸ�Դϴ�.
		
		// ����ڰ� �Է��� keyword�� ���Ե� Plant��ü�� �ʵ尪�� Ȯ���ؾ��ؿ�.
		// plants�� ��Ҹ� ���� �� �ϳ��ϳ� Ȯ���ϸ鼭 üũüũ ������ؿ�.
		// 1. plants ����� ������ŭ �ݺ� => for �ۿ� ����
		for(int i = 0; i < plants.size(); i++) {
			// 2. ��Ҹ� ������ ����
			Plant plant = plants.get(i); // ����� ���� �׻� 2�� �߿� �ϳ�. 1 = �⺻�ڷ����̳� �Ǵ� 2 = �⺻�ڷ����� �ƴϳ� // ������ �ּҰ��� �ſ��� // �⺻�ڷ��� �ƴϴ�? ������ �ּҰ��̴�.
			// 2-2. plant��ü�� name�ʵ� �Ǵ� type�ʵ忡
			// ����ڰ� �Է��� keyword�� ���ԵǾ� �ִٸ�~~
			if(plant.getName().contains(keyword) || plant.getType().contains(keyword)) {
				searched.add(plant);
				
			}
		}
		
		return searched;
		
	}
	
	// View ���� �Ĺ� ���� ��û �� ȣ��Ǵ� �޼ҵ�
	public boolean updatePlant(String name, String type, String newName, String newType) { // �̹����� �Ҹ����� �غ���!!
		
		// ��û ó��
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				
				// if ��Ͽ� ���Դٴ� �� ��ü�� ��ġ�ϴ� �Ĺ��� �ִٴ� �ǹ�
				// ����ڰ� �Է��� �� �̸� �� �� Ÿ������ ����!!!
				// ��� 1.
				// plants.set(i, new Plant(newName, newType));
				// set?? => ù��° ������ �ε��� ��ġ�� ��Ҹ�
				// �ι�° ���ڷ� �ٲ��ִ� �޼ҵ�
				
				// ��� 2. �� �̰� ���� �� ������ ����
				p.setName(newName);
				p.setType(newType);
				return true;
				
				
			} // if
			
		} // for
		return false; //for �� �ۿ��� �����ϴ� ����!
	}
	
	public void outputFile() {
		pd.outputFile(plants); // �굵 Dao ���� �޼ҵ� for (��û) �� �ؾ���.
		
	}

	
}
