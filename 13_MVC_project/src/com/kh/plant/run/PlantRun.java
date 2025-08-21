package com.kh.plant.run;

import com.kh.plant.view.PlantView;

public class PlantRun {

	public static void main(String[] args) {

		// MVC 패턴(Model - View - Controller) ※우리가 앞으로 MVC 패턴으로 프로그래밍을 해야하니까 미리미리 알아둡시다.
		// 애플리케이션을 만들 때 
		// 애플리케이션의 구조를 세가지 요소로 분리하자
		// 라는 소프트웨어 아키텍쳐 디자인 패턴이라고 합니다. => 소프트웨어 만들 때 세 가지로 분리된 구조로 만들자!
		// 1. Model
		// 데이터 담당 => VO(모델의 범주에 포함된 친구인 거예요.)
		// 외부매체와의 상호작용 => DAO
		// 아직은 없음 ========> 비즈니스 로직
		// 2. View
		// 사용자 인터페이스 담당 (프로그램과 사용자 가운데 매개체 역할을 한다는 이야기예요.)
		// 사용자에게 정보 표시 / 사용자의 입력값을 받아줌
		// 모델에서 만들어진 데이터를 시각적으로 표현
		// 모델과 직접 상호작용 하지 않음
		// 3. Controller
		// Model 하고 View 의 중간다리 역할 (모델하고 뷰 사이에 끼는 애, 컨트롤 하는 애, 중재하는 애)
		// 사용자 입력을 처리하고 모델에 전달
		// 모델에서 일어난 처리작업을 뷰에 반영
	
		PlantView pv = new PlantView();
		pv.mainMenu();
		
	}

}
