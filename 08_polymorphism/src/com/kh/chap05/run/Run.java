package com.kh.chap05.run;

import com.kh.chap05.model.vo.Hiphop;
import com.kh.chap05.model.vo.Jazz;
import com.kh.chap05.model.vo.Music;
import com.kh.chap05.model.vo.MusicI;

public class Run {

	public static void main(String[] args) {
		
		MusicI hiphop = new Hiphop();
		hiphop.play();
		MusicI jazz = new Jazz();
		jazz.play();
		
	//	Music[] music = new Music[2]; 나중에 배열에 넣어서 해보자.
		

	}

}
