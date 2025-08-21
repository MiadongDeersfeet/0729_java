package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.RiceWineDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {
		
		SojuDrinker s1 = new SojuDrinker(1);
		SojuDrinker s2 = new SojuDrinker(3);
		BeerDrinker b1 = new BeerDrinker(false);
		BeerDrinker b2 = new BeerDrinker(true);
		RiceWineDrinker r1 = new RiceWineDrinker(40);
		RiceWineDrinker r2 = new RiceWineDrinker(50);
		
		// 다 맥이기 쉽지 않아요. 힘들어요.
		/*
		s1.drink();
		s2.drink();
		b1.drink();
		b2.drink();
		r1.drink();
		r2.drink();
		
		s1.eat();
		s2.eat();
		b1.eat();
		b2.eat();
		r1.eat();
		r2.eat();
		*/
		
		System.out.println("======================================================");
		
		// 아래와 같이 할 수 있지만 그럼에도 불구하고 귀찮단 말이에요.
		SojuDrinker[] sojuArr = new SojuDrinker[2];
		BeerDrinker[] beerArr = new BeerDrinker[2];
		RiceWineDrinker[] rwArr = new RiceWineDrinker[2];
		
		sojuArr[0] = s1;
		sojuArr[1] = s2;
		beerArr[0] = b1;
		beerArr[1] = b2;
		rwArr[0] = r1;
		rwArr[1] = r2;

		for(int i = 0; i < sojuArr.length; i++) {
			sojuArr[i].drink();
			sojuArr[i].eat();
		}
		for(int i = 0; i < beerArr.length; i++) {
			beerArr[i].drink();
			beerArr[i].eat();
		}
		for(int i = 0; i < rwArr.length; i++) {
			rwArr[0].drink();
			rwArr[1].drink();
	
		}
		// 이 사람들을 다 드링커로 묶어봅시다.
		
		System.out.println("=====================================================");
		
		Drinker[] drinkArr = new Drinker[6];
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = r1;
		drinkArr[5] = r2;
		
		for(int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}
		// 이게 다형성이에요. 부모타입 자료형을 이용해서 여러 개의 자식 객체를 다루는 것.
		// 개념적으로는 굉장히 복잡한 내용인데 코드적으로 보면 왜 다형성을 사용해야하는지가 명확하게 구분이 되죠.
		// 위에서부터 변수를 사용했을 때, 배열을 사용했을 때, 다형성을 사용했을 때를 비교해보세요.
		
		// 배열을 이용했을 때 for() 를 세 번을 썼어요. 어쩔 수가 없어요. 타입이 다르거든요. 중복이 발생하죠. 
		// 다형성과 배열이 서로 출력 결과가 같지만 다형성에서는 부모타입 자료형을 통해 여러 개의 자식 객체를 다룰 수 있고 오버라이딩을 사용하고 있기 때문에 훨씬 코드가 간결해보이죠.
		// 동적바인딩이 일어나면서 부모 타입이 가지고 있는 것들이 아니라 실제 자식 객체가 가지고 있는 멤버들을 호출.
		
		
		// 소주 1님 한 잔 하세요 -> 소주 2님 한 잔 하세요 -> 맥주 1님 한 잔 하세요 -> 맥주 2님 한 잔 하세요
		// 소주님들 한 잔 하세요 -> 맥주님들 한 잔 하세요
		// 술 마시는 분들 다함께 짠합시다 <= 다형성
		
		// 객체지향의 모든 것은 객체끼리 안친하려고, 숨기려고, 안보이려고 하는 거예요.
		
		
		
		
		
		

	}

}
