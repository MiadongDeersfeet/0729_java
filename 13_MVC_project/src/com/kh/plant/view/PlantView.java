package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 담당, 화면 입/출력
public class PlantView {
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 저장소 : ArrayList (식물을 무한으로 저장할 수 있도록)
		while(true) {
			System.out.println();
			System.out.println("식물 관리 프로그램입니다.");
			// 식물 CRUD 하기
			// Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가하는 작업
			// Read : 만들어진 식물을 조회하는 작업
			// Update : 기존의 식물을 수정하는 작업	
			// Delete : 식물을 삭제하는 작업
			System.out.println("1. 식물 추가하기");
			System.out.println("2. 식물 전체 조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록을 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("어떤 기능을 이용하시겠어요? >");
			
			try {
				
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			
			switch(menuNo) {
			case 1 : createPlant();
				break;
			case 2 : readAll();
				break;
			case 3 : findByKeyword();
				break;
			case 4 : deletePlant();
				break;
			case 5 : updatePlant();
				break;
			case 6 : pc.outputFile();
				break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
			
			} // 스위치 스코프
			}/*try*/ catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine(); // 입력버퍼 날리기 안하면 무한반복 합니다. 파이널 쓰던지 여기에 한번 더 쓰던지~!
			} // 캐치 스코프
			
		} // 와일문 스코프
		
		
		
	} // 메소드 스코프
	
	// 1. 새롭게 식물을 추가할 수 있는 화면을 보여주는 메소드
	private void createPlant() {
		System.out.println();
		System.out.println("\n🌴 식물 추가 기능");
		System.out.print("식물 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println("식물 종류를 입력해주세요 > ");
		String type = sc.nextLine();
		
		// 식물 VO클래스에 대입할 값 두 개를 입력받았음
		// View 는 일단 할 일이 끝남 --> 이제 Plant VO에 담아줘야해요. 근데 항상 Controller 를 거쳐야합니다. 꼰뜨롤라에 전달해줘야합니다.
		// 사용자가 입력한 식물명과 종류를 가지고 식물목록에 추가해줘! 라고 컨트롤러에 요청해야합니다. <= ※ 메소드 호출밖에 방법이 없어요.
		// 컨트롤러의 메소드를 호출하려면 컨트롤러의 주소를 알아야하는데 우리는 그 주소를 필드에 가지고 있어요. 참조를 해서 가야죠.
		pc.createPlant(name, type); /*호출하는 쪽에서는 호출할 메소드에다가 값을 주는 거예요.*/ //인자값
		
		System.out.println("축하합니다.");
		System.out.println("새로운 식물이 추가되었습니다.");
		
		
		
	}
	
	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {
		System.out.println();
		System.out.println("전체 식물 목록입니다.");
		
		List<Plant> plants = pc.readAll(); // 나 Object형 배열이 필요해! 저기에 있는 것을 얻어내야겠어 하는 거죠.
											// 우항 먼저 썼을 때 갔다오니 주소값이 반환됐죠. 이걸 변수에 넣어야 활용할 수 있고 리스트형이니까 리스트형을 써줘야죠.
		
		// 경우의 수
		// case 1. 값이 없을 경우
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러개일 경우
		// 이번에는 전체조회이기 때문에 하나 이상이기만 하면 싸그리 몽땅 출력해주면 되잖아요.
		// 그런데 하나도 없으면 없다고 알려줘야하죠~!
		
		// List 에 요소가 하나도 존재하지 않을 경우
		if(plants.isEmpty()) { // plants.size() == 0 이것도 가능하지만 isEmpty 를 더 선호한단 말이에요.
			System.out.println("식물이 존재하지 않습니다.");
			System.out.println("새로운 식물을 추가해보세요.");
		} else { // 최소한 하나라도 있을 경우
				// 문제는 하나가 있을지 백개가 있을지 몰라요. 그래서 어쩔 수 없이 반복문을 써야하는 거예요.
			for(Plant p : plants) {
				System.out.println("식물이름 : " + p.getName() + ", 식물종 : " + p.getType());
			}
			
		} //엘스
		System.out.println();
	
		
	}
	
	
	// 4. 특정 식물을 삭제할 수 있는 화면을 출력해주는 기능
	private void deletePlant() {
		
		System.out.println("식물 삭제 기능입니다.");
		// 삭제를 어떻게 할 수 있도록 만들어줄 것인가????
		// 1. 식물이름을 입력받아서 삭제
		// 2. 식물타입을 입력받아서 삭제
		// 3. 식물이름과 타입을 입력받아서 삭제   <= 우리반 픽
		// 4. 그냥 아무것도 입력 안받고 전체 삭제
		
		// (3) 이름 및 타입을 입력받아서 삭제
		// 1. 이름만 일치하면 삭제
		// 2. 타입만 일치하면 삭제
		// 3. 이름하고 타입하고 둘 다 일치해야 삭제
		// 4. 이름 키워드가 포함되어있으면 삭제 
		// 5. 타입 키워드가 포함되어있으면 삭제
		// 6. 이름 또는 타입에 키워드가 포함되어 있으면 삭제
		
		// (3-3) 이름 / 타입 입력받고 둘 다 일치하는 값이 있을 때만 삭제
		
		System.out.println("식물의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.println("식물의 종류를 입력해주세요 > ");
		String type = sc.nextLine();
		
		// 일단 할 일 끝 !!
		// 실질적으로 수행하는 건 컨트롤러임.
		// 컨트롤러에게 사용자가 입력한 값 두 개를 전달하면서 삭제요청 보내기
		
		int count = pc.deletePlant(name, type); // 필드의 주소값을 참조해서 deletePlante 호출했고 인자값을 전달해줌.
		// 다녀왔더니 정수값이 돌아왔으니 int 변수에 담아주고
		// 0 일 때랑
		// 1↑ 일 때랑 다르게 하고 싶네?
		if(count > 0) {
			System.out.println("삭제 성공!");
			System.out.println(name + "을(를) 총 " + count + "개 삭제했습니다!");
			
		} else {
			System.out.println("삭제할 식물을 찾지 못했습니다.");
		}
		System.out.println();
		// 퐁당퐁당 현상 발생!!!! 4개 중에 2개만 지워지고, 2개 중에 1개만 지워지고 ㅠ_ㅠ
		// 변수에 담아서 해결해봅시다!!!!!!!! 리무브 하면 인덱스가 줄어들면서 i 의 값보다 작아지니까 하나가 남는 거예요.
		// 가장 단순한 해결방법은? 
	}
	
	// 3. 사용자가 식물에 대한 키워드를 입력할 수 있는 화면을 출력해주는 기능
	public void findByKeyword() {
		
		System.out.println();
		// 1. 사용자가 입력한 키워드가 제목에 포함되어 있다면 출력
		// 2. 사용자가 입력한 키워드가 타입에 포함되어 있다면 출력
		// 3. 사용자가 입력한 키워드가 제목 또는 타입에 포함되어 있다면 출력
		// 4. 사용자가 입력한 키워드가 제목 또는 타입에 둘 다 포함되어 있다면 출력
		
		// 3)
		System.out.println("식물 검색 서비스입니다.");
		System.out.println("키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		
		// 여기까지 하면 View 가 할 일 일단 끝이라구요!
		List<Plant> searched = pc.findByKeyword(keyword); // 갔다왔더니 Plant들의 주소값을 담은 배열을 필드값으로 가지고 있는 List의 주소값이 돌아왔어요. / 자바는 주소값이냐 아니냐. 참조자료형은 무조건 주소값입니다.
									// 그 이외에는 무조건 존재하지 않아요.
		// 경우의 수를 생각할 타이밍이네요.
		// 결과가 있는 경우 / 없는 경우
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			
			System.out.println("조회 결과가 총 " + searched.size() + "건 존재합니다.");
			
			for(Plant p : searched) {
				System.out.println("=================================================");
				System.out.println("이름 : " + p.getName() + " / 종류 : " + p.getType());
			}
			
		
		
		}
		
		
			
		}
		
	public void updatePlant() {
		
		System.out.println();
		
		// 1. 이름 -> 이름
		// 2. 타입 -> 타입
		// 3. 이름, 타입 -> 이름
		// 4. 이름, 타입 -> 타입
		// 5. 이름 -> 타입
		// 6. 타입 -> 이름
		// 7. 이름, 타입 -> 이름, 타입 <= 우리반 픽
		
		// 사용자에게 식물의 이름 및 타입을 입력받아서
		// 일치하는 식물을 찾아서
		// 새로운 식물의 이름 및 타입으로 갱신
		System.out.println("식물 정보 수정 서비스입니다.");
		// 4개를 입력 받아야합니다. (기존 이름 타입 / 갱신 이름 타입)
		System.out.print("기존 식물 이름 > ");
		String name = sc.nextLine();
		
		System.out.print("기존 식물 타입 > ");
		String type = sc.nextLine();
		
		System.out.print("새 식물 이름 > ");
		String newName = sc.nextLine();
		
		System.out.print("새 식물 타입 > ");
		String newType = sc.nextLine();
		
		// View 는 일단 할 일 끝 ! ! ! 1절 끝
		
		boolean result = pc.updatePlant(name, type, newName, newType); // 컨트롤러한테 요청하는 건데 사실 컨트롤러는 오른쪽에 있는 애랑 뷰 사이에 중간다리인 거예요~~~
		// 갔다오니까 논리값 true 아니면 false 가 오는데											 	// 참조자료형이니까 주소값이 전달돼요. 문자열은 상수풀의 스트링 영역에 올라가요.
		// 일단 뭔지 모르니까 변수에 담아 								// 같은 리터럴은 올라갈 수가 없다. // String 특은 뭐예요? 1빠따 => 불변입니다.
																// 배열의 특은 뭐예요? 1빠따로 나와야하는 거 => 배열이라는 구조는 논리적 구조와 물리적 구조가 같습니다.
		
		if(result) { //result 는 이미 true 예요. 자바를 쓸 때 여러분은 모든 걸 값이라고 봐야해요. 
			System.out.println("식물 정보 갱신 성공!");
		} else {
			System.out.println("식물이 존재하지 않습니다.");
		}
		
		System.out.println();
		
	}
	
	
	
	
 	
}
