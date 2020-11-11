package com.kh.music.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicServiceImpl implements MusicService{
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Music> musicTable = null; // ���� �����Ͱ� ����Ǿ� �ִ� ����Ʈ
	private List<Music> myList = new ArrayList<Music>(); // ���� ���� ����Ʈ
	
	private int seqMusicNo = 1; // ������ �߰��� �� ���� ������ ��ȣ�� �ο��ϴ� ����. (DB ������ó�� ���, PK�� �����Ѵٰ� ��������!)
	
	public MusicServiceImpl() {
		// �⺻�����ڷ� MusicServiceImpl ��ü�� ������ ���
		// musicTable ��ü ���� �� ���� ������ 10�� �߰�
		musicTable = new ArrayList<Music>();
		musicTable.add(new Music(seqMusicNo++, "Dynamite", "BTS"));
		musicTable.add(new Music(seqMusicNo++, "���� �� ����� �ƴϴ�", "��â��"));
		musicTable.add(new Music(seqMusicNo++, "Lovesick Girls", "BLACKPINK"));
		musicTable.add(new Music(seqMusicNo++, "DON'T TOUCH ME", "ȯ�ҿ�����"));
		musicTable.add(new Music(seqMusicNo++, "��⸦ ���� (�������� �׳� X ���)", "���"));
		musicTable.add(new Music(seqMusicNo++, "������ �뷡", "���ĵ� ����"));
		musicTable.add(new Music(seqMusicNo++, "���� ���� �ʳ׿�", "�����"));
		musicTable.add(new Music(seqMusicNo++, "�������� (Dingga)", "������"));
		musicTable.add(new Music(seqMusicNo++, "When We Disco (Duet with ����)", "������"));
		musicTable.add(new Music(seqMusicNo++, "I CAN��T STOP ME", "TWICE(Ʈ���̽�)"));
	}
	
	
	// 1. ���� ��� ��ü ��ȸ
	@Override
	public List<Music> selectAll() {
		return musicTable;
	}

	// 2-1. Ư�� �ܾ ���� ���Ե� �뷡 ��ȸ
	@Override
	public List<Music> selectTitle(String title) {
		List<Music> tmpMusic = new ArrayList<>();
		
		for(Music m : musicTable) {
			if(m.getTitle().contains(title)) {
				tmpMusic.add(m);
			}
		}
		return tmpMusic;
	}

	// 2-2. Ư�� �ܾ ������ ���Ե� �뷡 ��ȸ
	@Override
	public List<Music> selectArtist(String artist) {
		List<Music> tmpMusic = new ArrayList<>();
		
		for(Music m : musicTable) {
			if(m.getArtist().contains(artist)) {
				tmpMusic.add(m);
			}
		}
		return tmpMusic;
	}

	// 2-3. ���ƿ� ��ŷ������ ��ȸ
	@Override
	public List<Music> selectTopFavoriteCount() {
		List<Music> rankList = new ArrayList<>(musicTable);
		Collections.sort(rankList); 
		return rankList;
	}

	// 3-1. ���� ���� ����Ʈ ��ȸ
	@Override
	public List<Music> selectMyMusicList() {
		return myList;
	}


	// 3-2. ���� ���� ����Ʈ�� �� �߰�(�� ��ȣ)
	@Override
	public boolean addMusicList(int musicNo) {
		for(Music m : musicTable) {
			if(m.getMusicNo() == musicNo) {
				return myList.add(m);
			}
		}
		return false;
	}

	// 3-3. ���� ���� ����Ʈ�� �� ����(�� ��ȣ)
	@Override
	public Music removeMusicList(int musicNo) {
		Music tmpMusic = new Music();
		
		for(int i = 0; i < musicTable.size(); i++) {
			if(musicTable.get(i).getMusicNo() == musicNo) {
				tmpMusic = musicTable.get(i);
				myList.remove(i);
				return tmpMusic;
			}
		}
		return null;
	}
	
	// 4. ���ƿ� ������
	@Override
	public void incFavoriteCount(int musicNo) {
		for(Music m : musicTable) {
			if(m.getMusicNo() == musicNo) {
				m.setFavoriteCount(m.getFavoriteCount()+1);
			}
		}
	}
	
}
