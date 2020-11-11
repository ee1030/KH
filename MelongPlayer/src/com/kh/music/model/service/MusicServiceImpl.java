package com.kh.music.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.music.model.vo.Music;

public class MusicServiceImpl implements MusicService{
	
	private Scanner sc = new Scanner(System.in);
	
	private List<Music> musicTable = null; // 음악 데이터가 저장되어 있는 리스트
	private List<Music> myList = new ArrayList<Music>(); // 나의 뮤직 리스트
	
	private int seqMusicNo = 1; // 음악이 추가될 때 마다 고유한 번호를 부여하는 변수. (DB 시퀀스처럼 사용, PK를 지정한다고 생각하자!)
	
	public MusicServiceImpl() {
		// 기본생성자로 MusicServiceImpl 객체가 생성된 경우
		// musicTable 객체 생성 후 샘플 데이터 10개 추가
		musicTable = new ArrayList<Music>();
		musicTable.add(new Music(seqMusicNo++, "Dynamite", "BTS"));
		musicTable.add(new Music(seqMusicNo++, "힘든 건 사랑이 아니다", "임창정"));
		musicTable.add(new Music(seqMusicNo++, "Lovesick Girls", "BLACKPINK"));
		musicTable.add(new Music(seqMusicNo++, "DON'T TOUCH ME", "환불원정대"));
		musicTable.add(new Music(seqMusicNo++, "취기를 빌려 (취향저격 그녀 X 산들)", "산들"));
		musicTable.add(new Music(seqMusicNo++, "오래된 노래", "스탠딩 에그"));
		musicTable.add(new Music(seqMusicNo++, "잠이 오질 않네요", "장범준"));
		musicTable.add(new Music(seqMusicNo++, "딩가딩가 (Dingga)", "마마무"));
		musicTable.add(new Music(seqMusicNo++, "When We Disco (Duet with 선미)", "박진영"));
		musicTable.add(new Music(seqMusicNo++, "I CAN’T STOP ME", "TWICE(트와이스)"));
	}
	
	
	// 1. 음악 목록 전체 조회
	@Override
	public List<Music> selectAll() {
		return musicTable;
	}

	// 2-1. 특정 단어가 제목에 포함된 노래 조회
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

	// 2-2. 특정 단어가 가수명에 포함된 노래 조회
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

	// 2-3. 좋아요 랭킹순으로 조회
	@Override
	public List<Music> selectTopFavoriteCount() {
		List<Music> rankList = new ArrayList<>(musicTable);
		Collections.sort(rankList); 
		return rankList;
	}

	// 3-1. 나의 뮤직 리스트 조회
	@Override
	public List<Music> selectMyMusicList() {
		return myList;
	}


	// 3-2. 나의 뮤직 리스트에 곡 추가(곡 번호)
	@Override
	public boolean addMusicList(int musicNo) {
		for(Music m : musicTable) {
			if(m.getMusicNo() == musicNo) {
				return myList.add(m);
			}
		}
		return false;
	}

	// 3-3. 나의 뮤직 리스트에 곡 제거(곡 번호)
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
	
	// 4. 좋아요 누르기
	@Override
	public void incFavoriteCount(int musicNo) {
		for(Music m : musicTable) {
			if(m.getMusicNo() == musicNo) {
				m.setFavoriteCount(m.getFavoriteCount()+1);
			}
		}
	}
	
}
