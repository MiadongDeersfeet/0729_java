package com.kh.chap01.controller;

import java.util.Arrays;

public class Integers {

	private int[] integers;
	private int size;
	
	public Integers() {
		integers = new int[3];
	}
	
	public void add(int element) { // 정수형 배열에 입력을 해야하니까 int가 필요하겠죠.
		if(integers.length == size + 1) {									// 사이즈 + 1일 때만 늘려주고 싶은 거죠.
		integers = Arrays.copyOf(integers, (integers.length * 2)); 			//  <= 깊은 복사 그런데 이렇게 하면 add 할 때마다 배열이 계속 늘어날 거예요.ㅣ
		}																// 	우리는 배열 공간이 찼을 때만 늘려주고 싶은 거거든요. 조건을 넣어주면 좋겠네요?
		integers[size++] = element; // 첫 번째 add 할 땐 0번 인덱스에 대입될 것이고, 두 번째 add 할 땐 1번 인덱스에 대입될 것이고 ....
	}								// 배열을 새로 선언하면 기존값들은 사라진다. 그래서 기존값들을 새로 선언한 배열에 옮겨줘야하는데 어떤 방법이 있을까?
									// ※ 깊은 복사가 있어요. => 기존 배열의 크기보다 큰 배열로 복사해주기
		
		public int get(int index) {
			return integers[index];
		}
		
		
		
//	public boolean isEmpty() {
		
//	}
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
	}
	
	
	
}
