package com.kh.idol.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolView {
	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	// 로그인에 성공한 회원의 정보를 담아줄 필드
	private Fan loginFan;
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		System.out.println("\n\n 🌷🌷AESPA 커뮤니티에 오신 것을 환영합니다🌷🌷");
		
		while(true) {
			
			System.out.println("이용하실 서비스를 선택해주세요.");
			
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원 가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 번호 입력 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : login(); break;
			case 4 : boardMenu(); break;
			case 5 : break;
			default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}

		
		
	}
		
	public void infoMenu() {
		
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요!");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		System.out.print("이용하실 메뉴를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(menuNo); break;
		case 5 : findAll(); break;
		case 6 : return;
		}
	}
	
	private void findMember(int menuNo) {
		// 특정 멤버의 주소값을 반환해줄래?
		Idol idol = ic.findMember(menuNo);
		
		System.out.println("♡" + idol.getName() + "♡");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println(idol.getImage());
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println("전투기술 : " + idol.getSkill());
		System.out.println();
		
	}
	
	private void findAll() {
		// 컨트롤러야 모든 멤버의 정보를 접근할 수 있는 값을 줘~~
		List<Idol> aespa = ic.findAll();
		if(aespa.isEmpty()) {
			
			System.out.println("해체된 걸그룹입니다.");
			
		} else {
			
			for(Idol i : aespa) {
				System.out.println("🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶");
				System.out.println();
				System.out.println("프로필 이미지 : " + i.getImage());
				System.out.println();
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
				System.out.println();
			}
			System.out.println("🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶🐶");
		}
	
	}
	
	public void signUp() {
		
		// Fan이라는 자료형에 맞춰 필드에 set할 값 3개를 사용자에게 입력받음
		
		System.out.println("\n에스파 커뮤니티에 오신 것을 환영합니다.");
		System.out.println("회원가입 서비스입니다.");
		
		// 입력 => userId, userPwd, nickName
		
		// 제약조건을 줘봅시다! => 아이디는 4글자에서 10글자 사이일 것
		//    			    => 아이디는 다른 Fan의 아이디와 중복되면 안될 것
		
		String userId;
		while(true) {
		System.out.print("가입하실 아이디를 입력해주세요.");
		userId = sc.nextLine();
		
		// 하나의 메소드는 하나의 기능만을 수행해야한다.
		// 하지만 지금 이 회원가입 메소드는
		// 회원가입 뿐만 아니라 아이디값에 대한 유효성검증을 진행하고 있다.
		// 이렇게 되면 이 메소드는 하는 일이
		// 1. 유효성 검증
		// 2. 회원가입
		// 두 개가 되어버리기 때문에 하는 일이 너무 많은 것이다.
		// 분리를 하는 것이 올바르지만 아직은 너무 이른 것 같아 나중에 다시 돌아오겠음ㅋㅋ
		
		// 1. 아이디는 4글자에서 10글자 사이만 가능하다.
		if(!(3 < userId.length() && userId.length() < 11)) { 
			System.out.print("아이디는 4자에서 10자 사이만 사용 가능합니다.");
			continue;
		}
			
		// 2. 중복체크 (체크하러 보내려면 메소드 호출해야지!)
		boolean duplicateId = ic.checkId(userId);
		
		if(duplicateId) {
			System.out.println("이미 사용 중인 아이디입니다.");
			
		} else {
			System.out.println("사용 가능한 아이디입니다.");
			break; // <= 탈출시키기
		}
		
	 }
		
		System.out.print("사용하실 비밀번호를 입력해주세요.");
		String userPwd = sc.nextLine();
		
		System.out.print("사용하실 닉네임을 입력해주세요.");
		String nickName = sc.nextLine();
		
		// 뷰는 일단 자신의 할 일을 1절까지 마무리 했다.
		// 사용자가 입력한 아이디와 비밀번호와 닉네임을 가지고 Fan 객체를 생성해서 필드에 담아서
		// Controller에 있는 fans라는 List의 요소로 추가를 하고 싶은 겁니다.
		
		boolean result = ic.signUp(userId, userPwd, nickName);
		
		if(result) {
			System.out.println("회원가입에 실패했습니다. 다시 시도해주세요.");
		} else {
			System.out.println("회원가입을 축하드립니다~!");
		}
		
		
  }		
	
	private void login() {
		
		System.out.println("\n로그인 서비스 입니다.");
		
		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요 > ");
		String userPwd = sc.nextLine();
		
		Fan fan = ic.login(userId, userPwd); //인자값을 줄테니 컨트롤러야~~필드값에 가서 둘다 똑같은게 있는지 찾아봐줘.
		
		if(fan != null) {
			System.out.println(fan.getNickName() + "님 환영합니다~!");
			loginFan = fan; // 실제로 loginFan 이 가르키는 주소는 컨트롤러의 필드의 List<Fan>의 fans이죠. "얕은복사" 입니다. => 똑같은 주소 값을 가리킴.
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
			
		}
		
	}
	
	private void boardMenu() {
		
		System.out.println("\n 에스파 게시판입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요.");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 전체 조회");
		System.out.println("3. 게시글 상세 조회");
		System.out.println("4. 메인메뉴로 돌아가기");
		System.out.print("당신의 선택은??? 두굳구둑두구구 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : post(); break;
		case 2 : selectBoardList(); break;
		case 3 : break;
		case 4 : return;
		}
		
		
		
	}
	
	private void post() {
		System.out.println("\n게시글작성 서비스");
		// 전제조건 : 로그인한 사용자만 게시글을 작성할 수 있음
		// 1. 변수?
		// 2. if?
		// 3. for?
		// 3지선다예요. 세 개 중에 하나 고르는 거예요^~^ 객관식이에요!!!
		if(loginFan != null) { // 최소한 로그인 여부 주소값을 넣어둔 loginFan 이 null 이 아니라면 로그인 상태인거죠.
			
			try {
			System.out.println("게시글 제목을 입력해주세요 > ");
			String boardTitle = sc.nextLine();
			
			System.out.println("게시글 내용을 입력해주세요 > ");
			String boardContent = sc.nextLine();
			
			System.out.println("");
			
			
			ic.post(boardTitle, boardContent, loginFan.getUserId());
			} catch(InputMismatchException e) {
				e.printStackTrace();
			}
		
			System.out.println("게시글 작성 성공~~~!");
			
		
		} else {
			System.out.println("로그인 후 이용가능한 서비스 입니다.");
			
			
		}
		
		
		
	}

	private void selectBoardList() {
		
		System.out.println();
		System.out.println("\n전체 게시글 목록입니다.");
		System.out.println();
		
		List<Board> boardList = ic.selectBoardList();
		// 값이 돌아온 시점에는 경우의수를 생각하세요.
		if(boardList.isEmpty()) { // 게시판에 비어있니 ? 네 = true --> 이프 안으로 이동
			System.out.println("게시글이 없습니다.");
			System.out.println();
			System.out.println("첫 게시글의 주인공이 되어보세요~!");
		} else {
			
			for(Board board : boardList) {
				System.out.println("글 번호 : " + board.getBoardNo() + "\t");
				System.out.println("글 제목 : " + board.getBoardTitle() + "\t");
				System.out.println("작성자 : " + board.getUserId() + "\t");
				System.out.println("작성일 : " + board.getCreateDate());
				System.out.println();
			}
			
		}
		
		
	}
	
	
}
