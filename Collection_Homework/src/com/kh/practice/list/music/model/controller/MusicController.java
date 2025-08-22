package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList();

	{
		list.add(new Music("I'm in love", "���"));
		list.add(new Music("Maybe", "����"));
		list.add(new Music("���� ���� ��", "������"));
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
		// ���������� title �� �޾Ƴ���.
		// �� title �� ��� list �� �ִ� ��Ͽ� �����ؼ�
		// �Ȱ��� �̸��� ������ ������ �ִ��� Ȯ���ؾ��Ѵ�. contains
		// �ϳ��ϳ� �����ؾ��ϴ� �ݺ����� ��߰���?
		// �ִ��� ������ ���θ� ��ȯ������ ������߰���.
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
		// title ���� �޾ƿ԰� �� ���� ������ list �� �����ؼ� �Ȱ��� �̸��� ������ ������ �ִ��� Ȯ���ؾ��Ѵ�.
		// �ϳ��ϳ� �����ؾ��ϴ� �ݺ����� ��߰���?
		// ���Ե� �� �ִٸ� �����긦 �ع����� ��ȯ���� �����ض�
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
				// set(index, ���)
				list.set(i, new Music(setTitle, setSinger));
				
				return set;
			}

		}
		return null;
	}

}
