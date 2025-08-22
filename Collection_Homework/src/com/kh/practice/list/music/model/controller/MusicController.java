package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList();

	{
		list.add(new Music("I'm in love", "라디"));
		list.add(new Music("Maybe", "선예"));
		list.add(new Music("내게 오는 길", "윤시윤"));
	}

	public int addList(String title, String singer) {
		list.add(new Music(title, singer));
		return 1;
	}

	public int addAtZero(String title, String singer) {
		list.add(0, new Music(title, singer));
		return 1;
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		// 음악제목을 title 에 받아놨다.
		// 이 title 을 들고 list 에 있는 목록에 접근해서
		// 똑같은 이름을 포함한 정보가 있는지 확인해야한다. contains
		// 하나하나 접근해야하니 반복문을 써야겠지?
		// 있는지 없는지 여부를 반환값으로 보내줘야겠지.
		List<Music> searchMusic = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			Music music = list.get(i);

			if (music.getTitle().contains(title)) {
				searchMusic.add(music);
				return music;
			}
		}

		return null;
	}

	public Music removeMusic(String title) {
		// title 값을 받아왔고 이 값을 가지고 list 에 접근해서 똑같은 이름을 포함한 정보가 있는지 확인해야한다.
		// 하나하나 접근해야하니 반복문을 써야겠지?
		// 포함된 게 있다면 리무브를 해버리고 반환값을 전달해라
		for (int i = 0; i < list.size(); i++) {
			Music remove = list.get(i);

			if (remove.getTitle().equals(title)) {
				list.remove(i);
				return remove;
			}
		}
		return null;

	}

	public Music setMusic(String title, String setTitle, String setSinger) {

		for (int i = 0; i < list.size(); i++) {
			Music set = list.get(i);
			if (set.getTitle().equals(title)) {
				// set(index, 요소)
				list.set(i, new Music(setTitle, setSinger));
				
				return set;
			}

		}
		return null;
	}

}
