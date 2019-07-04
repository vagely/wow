package com.igeek;

public class Cd extends Database{
	//成员属性
	private String title;
	private String artist;
	private int playingTime;
	private String comment;
	
	
	//构造函数
	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	成员方法
	public void print() {
		System.out.println(getTitle()+";"+artist);
		
	}
	
	

	public Cd(String title, String artist) {
		System.out.println("调用");
		this.title = title;
		this.artist = artist;
	}

	public Cd(String title, String artist, int playingTime, String comment) {
	super();
	this.title = title;
	this.artist = artist;
	this.playingTime = playingTime;
	this.comment = comment;
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

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "CD [title=" + title + ", artist=" + artist + ", playingTime=" + playingTime + ", comment=" + comment
				+ "]";
	}
	
	

}
