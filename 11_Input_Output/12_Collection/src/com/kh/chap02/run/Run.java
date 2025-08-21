package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import com.kh.chap02.model.vo.Plant;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 자바의 컬렉션(Collection Framework) => 원래는 아래의 삼총사를 개발자가 직접 구현을 해야하는데 개발자마다 생각이 다르니 통일성이 없잖아요.
		 * 									   개발자들이 틀에 맞추어 작업할 수 있게 그리고 동일하게 사용할 수 있도록 만들어놓은 '도구' 입니다.
		 * ↑ ★이것부터 해야해요.★ 열정적인 분들은 취업하려고 알고리즘 공부, 코딩 테스트 준비 등 많이들 하시지만요.
		 * 
		 * Abstract Data Type = 추상적 자료형 ==> Java 에서는 Interface 로 만들어놨어요.
		 * 추상적이다라는 것 --> 실체X 추상메소드에는 메소드바디가 없어요.  /  추상클래스와 인터페이스의 공통점 --> 객체생성이 불가능하다.
		 * 원래 인터페이스로 뭘 만들 수가 없어요. 근데 인터페이스를 실체화 시키려면 뭐가 있어야 할까요? --> 클래스가 있어야 해요.
		 * 
		 * 추상적 자료형 => Abstract Data Type 
		 * +
		 * 구현체 => Class     가 있어야해요.
		 * +
		 * 알고리즘 => method
		 * 
		 * ======================================================================================================================
		 * 
		 * 배열과 컬렉션의 차이점
		 * (※ 배열이 나쁘다는 건 아닙니다. 앞에서 배운 것들이 쓸 데 없는 게 아니에요. 파이널 프로젝트에서 사용해야하는 거 다 가르친 거니까 다 가져가는 겁니다.)
		 * 
		 * - 배열의 아주 쬐끔 불편한 점
		 * 
		 * 1. 배열을 사용하려고 할 때 꼭 크기를 할당해야해요. => 한 번 지정된 크기는 변경이 불가능 // Q. 0~4번 인덱스에 12456 이 들어가있다고 쳤을 때 2번 인덱스에 3번을 넣고 나머지를 한칸씩 미루고 싶다면?
		 * 2. 배열 중간 위치에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 땡기는 코드를 써야함.
		 * 
		 * - 컬렉션
		 * 1. 크기의 제약이 없음
		 * => 처음 컬렉션을 사용할 때 크기를 지정하지 않더라도 사용할 수 있음
		 * => 만약 요소가 추가되면서 크기를 넘어서는 상황이 발생하면 알아서 확장됨
		 * 2. 중간에 값을 추가하거나 삭제하는 경우 기존값을 밀어주거나 땡겨주는 로직이 이미 구현되어 있음. (개발자가 굳이굳이 따로 만들 필요가 없음)
		 * => 그때그때 필요한 메소드들을 호출해서 사용하면 됨
		 * 
		 * -- 중립
		 * - 배열의 경우 하나의 타입의 자료형만 사용할 수 있음
		 * - 컬렉션의 경우 여러 타입의 데이터들을 관리할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능
		 * 
		 * 
		 * 사용할 데이터의 개수가 명확히 정해져있고, 조회의 목적을 => 배열 (절대 안고친다! 일 경우)
		 * 데이터들의 추가, 수정, 삭제가 많이 일어난다 => 컬렉션
		 * 
		 * 개념적인 컬렉션의 종류
		 * 
		 * - List 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지(Index), 중복값 허용     <= 리스트라는 추상적 자료형 이야기입니다.
		 * 				=> LinkedList(연결리스트), ArrayList, Vector
		 * 				-> 우리는 ArrayList 합니다. 실무반이니까^~^      / 우리가 컴퓨터공학과면 링크드리스트 해야해요.
		 * 
		 * LinkedList --> 객체를 만듭니다. 이해를 위한 그림상으로는 공간의 절반에는 Value 값을 저장하고, 나머지에는 다음 객체의 주소를 저장합니다.
		 * 				 삭제/추가에 유용, 앞에 주소값만 바꿔주면 되거든.
		 * ArrayList --> 삭제/추가에 불편함, 삭제/추가 시에 뭔가 값을 밀어주고 땡겨오고 그래야함.
		 * 
		 * 우린 웹개발자잖아요.
		 * 모든 개발에는 조회작업이 압도적으로 많습니다. 우리가 웹에서 무엇을 하는지 생각해보면 돼요.
		 * 웹이라는 건 정보제공 서비스예요.
		 * 현대 컴퓨터는 Array 에 특화되어 있어요.
		 * 데이터 많이 저장할 거면 공간이 큰 배열 생성하면 그만이에요.
		 * 근데 링크드 리스트는 데이터가 많이 저장되려면 계속해서 객체가 생성되어야 해요. (1만개라고 했을 시 링크드가 메모리를 2.5배~3배 더 많이 써요.)
		 * ※ 핵심은 ArrayList 를 많이 쓰고 우리가 배울 거라는 거. 
		 * 
		 * - Set 계열 : 다루고자 하는 값(Value)만 저장 / 저장 시 순서 유지 X, 중복값 허용 X
		 * 			=> HashSet, TreeSet
		 * 			-> HashSet 우리는 그 중에서 해쉬셋 배울 겁니다.
		 * 
		 * - Map 계열 : 키(Key) - 값(Value) 세트로 저장합니다. / 저장 시 순서 유지 X, 키 '중복불가', 값 '중복허용'
		 * 			=> HashMap, TreeMap, MultiValueMap 등등등
		 * 			-> 우리는 HashMap, Properties 라는 친구 배우고 넘어가겠습니다.
		 */
		
		// ArrayList 를 이용해서 Plant 들을 다뤄봅시다. (오늘 껍데기)
		// ArrayList 생성방법
		// ArrayList 식별자 = new ArrayList();
		// 1. 기본생성자 호출로 만들기 => 기본 크기 10칸
		// ArrayList 식별자 = new ArrayList(정수)    <= 호출 시 인자값 전달 가능
		// 2. 인자로 전달한 정수값만큼의 크기를 가진 리스트를 만들겠다.
		
	//	Plant plant = new Plant();
		
		ArrayList plants = new ArrayList(3);
		// 내부적으로 크기가 3칸짜리인 List를 만들겠다.
		// 배열타입[] arr = new 배열타입[3];
		
		System.out.println(plants);
		
		/*
		 * arr[0] = new Plant();
		 * arr[1] = new Plant();
		 * 배열이었다면 원래 이렇게 했을텐데.
		 */
		// 1. 비어있는 List에 요소를 추가
		// add(E e) : 해당 리스트 마지막에 인자로 전달된 요소를 추가해주는 메소드
		// E -> element : 제네릭
		Plant[] p = new Plant[3];
		p[0] = new Plant("서양란", "호접란");
		p[1] = new Plant("동양란", "황룡관");
		p[2] = new Plant("관엽", "금전수");
	//	System.out.println(Arrays.toString(p)); 
		
		plants.add(new Plant("서양란", "호접란")); // 플랜트에 가면 add 메소드가 있다구요. // 얘네들이 Plant 매개변수 생성자 값에 들어갔네??
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		plants.add("식물 끝!"); // 출력이 되네~? 맨 마지막 요소에 add 한 게 들어갔네. 
		
		// 기존 Object[]의 크기를 넘어서는 요소가 추가될 경우
		// Arrays.copyOf 메소드를 이용하여 깊은 복사로 더 큰 배열로 할당함
		// Object 타입으로 요소를 관리하기 때문에 여러 자료형의 요소를 하나의 리스트에 담을 수 있음
		
		System.out.println(plants.toString());
		// 둘다 [식물정보 [이름 = 호접란, 종류 = 서양란], 식물정보 [이름 = 황룡관, 종류 = 동양란], 식물정보 [이름 = 금전수, 종류 = 관엽]] 이렇게 출력됨.
		// 우리가 만든 건 3칸짜리였는데 4번째 요소를 넣어도 문제가 안생기네?
		// 배열이었다면 불가능한데 ~~~ 그리고 심지어 자료형도 Plant 형과 String 으로 서로 다른데.
		// 하나의 배열에 둘 다 들어갈 수 있는 방법은 ? 
		// 107 ~ 110행의 공통점은 ? 참조자료형 , 얘네들의 부모 타입은 Object , 얘네는 무엇으로 형변환 가능하다 ?Object 로 , 같이 배열에 들어갈 수 있는 방법은? Object형 배열에 담는 방법뿐.
		// 배열을 부모타입의 자료형으로 바꾸는 수 밖에 없잖아요. 근데 얘네가 무슨 클래스를 만들 줄 알고 부모타입 배열을 선언해놓아요.
		// 결국 얘네는 Object 의 후손이라구요. Object 배열이면 무엇이든 다 담을 수 있는 거 아녜요.
		
		// add 메소드 호출 시 오버로딩된 형태의 메소드를 사용
		// add(int index, E e) : List의 index에 전달한 요소를 추가
		plants.add(0, "식물 시작~");
		plants.add(3, new Plant("관엽", "홍콩야자"));      
		
		
		System.out.println(plants);
		// 우와 중간위치에 요소가 추가됐다~~~~! 기존 요소들도 한칸씩 밀어주는 작업이 내부적으로 구현이 되어있네? 대박이다.
		
		// 2. 요소를 수정하는 메소드
		// set(int index, E e) : List의 index 위치에 있는 값을 전달된 요소(e)로 set해주는 메소드
		plants.set(0, "321땡!!!!!!!!");
		System.out.println(plants);
		
		// 3. 요소를 삭제하는 메소드
		// remove(int index) : List의 index 위치에 있는 값을 삭제하는 메소드
		plants.remove(0);
		
	
		
		// remove 할 때 조심해야하는 점
	//	plants.remove(5); // out of bounds 나와버렸다. 왜? 5번 인덱스까지 있었는데. 앞에서 0번을 지워서 4번까지밖에 없잖아~~~ 그래서 그래
		// IndexOutOfBoundsException == index 값을 잘 고려해서 인자값을 전달해야함
		
		// "식물 끝!" 이라는 문자열 타입의 값
	//	String str = plants.remove(4); // String 값을 뽑았으니까 String 값을 반환해야하는데 왜 안되는 것이냐? 우리는 이걸 Object 로 관리하고 있었기 때문에
										// 빠져나갈 때도 Object 로 인식한다고. 
		String str = (String)plants.remove(4);   // 이걸 String 으로 써주려면 다운캐스팅 형변환을 해줘야합니다.
		System.out.println(str);   
		
		System.out.println(plants); // remove 메소드는 반환값이 있어요. E를 반환해요. (요소를 반환해주는 것) // 
		
//		Set set = new Set();    <=    이게 안된다구요. 실체가 없으니까.
		
		// 황룡관을 리무브 해보자. 1번 인덱스
		
		Plant goldDragonCrown = (Plant)plants.remove(1); // 이걸 제거하는데 반환받아서 쓰고 싶단 말이에요. 플랜트 변수에 담아야겠죠? 플랜트 타입인 건 맞는데 뽑을 땐 오브젝트로 뽑힌다구요. 다운캐스팅을 해줘야한다구요.
		System.out.println(goldDragonCrown.getType() + "류의 " + goldDragonCrown.getName() + "이 삭제되었습니다."); // 동양란류의 황룡관이 삭제되었습니다.
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		
		// 4. 리스트의 크기를 반환받기
		// size() : 리스트에 담겨있는 요소의 개수
		System.out.println(plants.size()); // 사이즈가 선언할 땐 0이고 add 할 때마다 +1 씩 올라가요. return 값을 받으면 사이즈가 얼마인지 알 수 있는 건데.
		System.out.println("마지막 인덱스 : " + (plants.size() - 1)); // 사이즈의 -1 값이 항상 마지막 인덱스 번호가 되는 거예요.
		
		// 5. List의 해당 index 위치에 담긴 요소를 반환받는 메소드
		// get(int index) : E
		System.out.println(plants);
		plants.get(0);     // 0번 인덱스의 요소가 반환이 되는 거죠. 실질적으로 Plant 객체의 주소가 뽑혀나오는 거라고 ??
		Plant plant = (Plant)plants.get(0);
		System.out.println(plant);
		
		// 1번 인덱스에 위치한 식물의 이름을 변수로 대입해서 활용하고 싶음.
	//	String hongKongTree = plants.get(1).getName();     <= 이거 해야하는데 안된다구요.
		String hongKongTree = ((Plant)plants.get(1)).getName();  // <= 이렇게 해야합니다. 수학익힘책, 앞에서부터 처리되도록. () 로 우선순위 주기
		System.out.println(hongKongTree); // 홍콩야자가 출력된다. 하하하하하하하하하하 ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ // 결국 상속과 다형성 이야기 하고 있는 거예요.
																													// 상속과 다형성, 클래스형 변환
		
		
		for(int i = 0; i < plants.size(); i++) { // 리스트가 가지고 있는 요소의 개수만큼 돌아야죠.
			System.out.println("식물 종류 : " + ((Plant)plants.get(i)).getType());   // 세줄로 서양란, 관엽, 관엽이 나오는데. // plants 에서 겟 i 해해서 돌리고	
																					 // getType 을 뽑아내고 싶은데. 먼저 형변환을 Plant 로 해줘야 할 수가 있다.																		
		}
		
		// 향상된 for 문 => 값을 조회하는 목적으로 사용가능
		// for(값을 받아줄 변수 : 순차적으로 요소에 접근할 배열 또는 컬렉션 {}
		for(Object p1 : plants) {
			System.out.println(p1.toString()); // 식물정보 [이름 = 금전수, 종류 = 관엽] 이렇게 나오는데 p.toString 이 나온 거죠? 왜 그렇죠?
											// 동적바인딩이 적용이 되니까요. 그럼 동적바인딩이란? 자식클래스 우선순위 호출
		}
		
		// 6. 리스트 자르기 (리스트도 배열이죠 어레이리스트)
		// subList(int index1, int index2) : List
		// index1부터 index2까지의 요소를 추출해서 새로운 리스트를 반환
		List sub = plants.subList(0, 1); // 0번 인덱스에 있는 호접란-서양란이 튀어나오네?
		System.out.println(sub);
		
		// 7. 리스트에 요소를 왕창 추가하기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value)이 중복될 수 있음
		
	/*	ArrayList l;
		LinkedList i;
		Vector v;
		
		HashSet h;
		TreeSet t;
	*/	
		// 리스트랑 셋은 컬렉션을 익스텐즈 하고 있는 친구들이란 말이야.
		// 리스트랑 셋은 사용법이 똑같아요. 근본(부모)이 같으니까.
		// 맵은 달라요. 맵은 컬렉션을 안받습니다^~^
		// 모든 리스트랑 모든 셋은 전부다 addAll 에 합쳐져서 어쩌궇 ㅏㄹ 수 있어.
		
		// 8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드
		// isEmpty() : 리스트에 요소가 존재하지 않다면 true / 요소가 하나라도 있다면 false
		System.out.println(plants.isEmpty());    // <= 지금 요소가 있으니까 false가 나오네.
		
		plants.clear(); // 요소를 싹 날리는 메소드
		System.out.println(plants.isEmpty()); // 요소를 싹 날리니까 true가 나오네.
		
		
		
		
		
		
		
	
		
		
		
		
		
	
	}

}
