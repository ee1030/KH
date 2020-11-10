package com.kh.music.model.vo;

public class Music implements Comparable<Music>{
	private int musicNo;	// �� ��ȣ
	private String title;	// �� ����
	private String artist;	// ����
	private int favoriteCount;	// ���ƿ� ��
	
	// �⺻ ������
	public Music() { }

	// �Ű������� musicNo, title, artist �� ������ �ִ� ������.
	public Music(int musicNo, String title, String artist) {
		super();
		this.musicNo = musicNo;
		this.title = title;
		this.artist = artist;
		// �ش� �����ڷ� ��ü ���� �� favoriteCount�� �����Ǿ� ���� �����Ƿ� 
		// favoriteCount�� JVM�� int�� �⺻�� 0���� �ʱ�ȭ��.
	}

	public Music(int musicNo, String title, String artist, int favoriteCount) {
		super();
		this.musicNo = musicNo;
		this.title = title;
		this.artist = artist;
		this.favoriteCount = favoriteCount;
	}

	public int getMusicNo() {
		return musicNo;
	}

	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(int favoriteCount) {
		this.favoriteCount = favoriteCount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + favoriteCount;
		result = prime * result + musicNo;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return musicNo + "   /   " + title + "   /   " + artist + "  /  " + favoriteCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (favoriteCount != other.favoriteCount)
			return false;
		if (musicNo != other.musicNo)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Music o) {
		return o.getFavoriteCount() - getFavoriteCount();
	}
	
	
}
