package com.kh.music.model.service;

import java.util.List;

import com.kh.music.model.vo.Music;

public interface MusicService {
	
	// 1. ���� ��� ��ü ��ȸ
	public abstract List<Music> selectAll();

	// 2-1. Ư�� �ܾ ���� ���Ե� �뷡 ��ȸ
	public abstract List<Music> selectTitle(String title);
	
	// 2-2. Ư�� �ܾ ������ ���Ե� �뷡 ��ȸ
	public abstract List<Music> selectArtist(String artist);
	
	// 2-3. ���ƿ� ��ŷ������ ��ȸ
	public abstract List<Music> selectTopFavoriteCount();

	// 3-1. ���� ���� ����Ʈ ��ȸ
	public abstract List<Music> selectMyMusicList();

	// 3-2. ���� ���� ����Ʈ�� �� �߰�(�� ��ȣ)
	public abstract boolean addMusicList(int musicNo);

	// 3-3. ���� ���� ����Ʈ�� �� ����(�� ��ȣ)
	public abstract Music removeMusicList(int musicNo);
	
	// 4. ���ƿ� ������
	public abstract void incFavoriteCount(int musicNo);
}
