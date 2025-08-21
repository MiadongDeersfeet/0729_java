package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

// Controller : 사용자가 View를 통해 요청했을 때
// 요청을 받아 처리해준 뒤 다시 처리결과를 View로 반환해줌
public class PlantController {
	// 식물저장소
	private List<Plant> plants = new ArrayList(); //기본생성자로 호출하면 10칸입니다. // 타입을 List (상위클래스) 로 해주면 나중에 뒤 쪽이 LinkedList로 바뀔 때 좋겠죠.
													// 식물만 들어가야하니까 제네릭까지 달아주면 좋겠죠. 식물을 하나정도 미리 넣어주면 좋을 거 같은데 어떻게 할까요?
													// 생성자에 넣는 방법, 초기화블록에 넣는 방법.
	private PlantDao pd = new PlantDao();
	
	// 초기화블록
	{ // 초기화블록은 생성자 호출 이전에 생성된다.
		plants.add(new Plant("안시리움", "분재"));
		
	}
	
	// View 에서 식물 추가 요청을 할 때마다 호출되는 메소드
	public void createPlant(String name, String type) {
		// 1절 => 객체 생성
		Plant plant = new Plant(name, type);
		// 주소를 변수에 일단 남았는데 이 변수는 스코프가 닫히면 무효예요. 그런데 누군가가 이 주소를 가리키고 있어야(얕은복사) 얘가 살아남을 수 있어요. // 리스트가 가지고 있는 오브젝트형 배열이 이 친구를 가리키게 하겠다구요.
		
		// 식물저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List의 필드로 가지고 있는 Object[]의 요소로 추가
		// 어떻게 추가해줘요? 이걸 자바에서 할 수 있게 이미 만들어줬다고.
		plants.add(plant); // 리스트를 참조해서 add로 넣는다구요.
		
	}
	
	// View에서 전체 식물조회 요청이 왔을 때 호출되는 메소드
	public List<Plant> readAll() {
		// Plant 타입의 객체들의 주소가 요소로 존재하는 Object[]을 View에게 반환. // Object형 배열은 컨트롤러에게 X 리스트에게 있어요.
		// 리스트는 private 으로 접근이 불가능해요. 그럼 Object형 배열의 주소를 가지고 있는 필드의 plants 를 반환해줘야합니다.
		// 그렇다면 사실상 이 곳은 getter 입니다.
		return plants; // 리스트 모양으로 가야해요^^! 필드 돌려주는 거 => getter
	}
	
	// View 에서 식물 삭제 요청이 왔을 때 호출되는 메소드
	
	public int deletePlant(String name, String type) {
		// 사용자가 입력한 식물이름 + 식물종류와 일치하는 필드값을 가진 Plant 객체를 제거
		// case 1. 동일한 이름 및 종류를 가진 식물이 존재하지 않았다.
		// case 2. 동일한 이름 및 종류를 가진 식물이 딱 한개 존재했다.
		// case 3. 동일한 이름 및 종류를 가진 식물이 여러 개 존재했다.
		// 성공실패에 따라서 View에게 반환값을 다르게 돌려주어야 함.
		
		// 식물을 제거한 후 제거된 Plant 객체를 담아서 반환
		// 우리가 하려는 것은 Plant p = plants.remove(2); 값이 빠질 것이고
		// List returnList = new ArrayList();
		// retrunList.add(p);
		// return returnList;
		
		// 굳이 위에처럼 할 필요 없이 요소가 삭제될 때마다 정수값을 증가시키고
		// 증가된 정수만 반환 *결론적으로 말하자면 int 돌리자
		
		int count = 0;
		
		// 요청처리   --- 어디에 어떤 식물이 있는지 모르니까 결국 처음부터 끝까지 반복으로 돌려서 다 검사를 해야하는데 그럼 어쩔 수 없이 쓸 수 있는게 for 입니다.
		for(int i = 0; i < plants.size(); i++) { // 여기에 들어있는 name / type 값과 사용자가 입력한 값이 둘다 같은지 조건검사를 하고 일치하면 remove 하고 싶은 거죠.
			if(name.equals(plants.get(i).getName()) &&
					type.equals(plants.get(i).getType())) {
				// ↓ 요소를 제거(일치하는 요소)
				plants.remove(plants.get(i));
				i--; //퐁당퐁당 해결사
				count++;
				
			}
		
		}
		
		return count;
		
	}
	
	public List<Plant> findByKeyword(String keyword) { // View로부터 검색 요청이 왔을 때 호출되는 메소드
		
		// 1. Plant[] => 배열 몇칸짜리?? 길이를 특정짓기 아리까리 하죠??
		// 2. List<Plant>
		
		List<Plant> searched = new ArrayList();
		
		// 식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우
		// 싸그리 몽땅 다 들고가서 출력해줄 것
		// 이게 바로 "조회"예요. 여러분들이 만드는 것의 80프로 이상은 다 조회입니다.
		
		// 사용자가 입력한 keyword가 포함된 Plant객체의 필드값을 확인해야해요.
		// plants의 요소를 전부 다 하나하나 확인하면서 체크체크 해줘야해요.
		// 1. plants 요소의 개수만큼 반복 => for 밖에 없어
		for(int i = 0; i < plants.size(); i++) {
			// 2. 요소를 변수에 대입
			Plant plant = plants.get(i); // 경우의 수는 항상 2개 중에 하나. 1 = 기본자료형이냐 또는 2 = 기본자료형이 아니냐 // 무조건 주소값인 거예요 // 기본자료형 아니다? 무조건 주소값이다.
			// 2-2. plant객체의 name필드 또는 type필드에
			// 사용자가 입력한 keyword가 포함되어 있다면~~
			if(plant.getName().contains(keyword) || plant.getType().contains(keyword)) {
				searched.add(plant);
				
			}
		}
		
		return searched;
		
	}
	
	// View 에서 식물 수정 요청 시 호출되는 메소드
	public boolean updatePlant(String name, String type, String newName, String newType) { // 이번에는 불린으로 해보자!!
		
		// 요청 처리
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				
				// if 블록에 들어왔다는 거 자체가 일치하는 식물이 있다는 의미
				// 사용자가 입력한 새 이름 및 새 타입으로 갱신!!!
				// 방법 1.
				// plants.set(i, new Plant(newName, newType));
				// set?? => 첫번째 인자인 인덱스 위치에 요소를
				// 두번째 인자로 바꿔주는 메소드
				
				// 방법 2. ★ 이게 조금 더 선생님 취향
				p.setName(newName);
				p.setType(newType);
				return true;
				
				
			} // if
			
		} // for
		return false; //for 문 밖에서 전달하는 구나!
	}
	
	public void outputFile() {
		pd.outputFile(plants); // 얘도 Dao 한테 메소드 for (요청) 을 해야함.
		
	}

	
}
