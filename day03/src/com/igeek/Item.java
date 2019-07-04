package com.igeek;

public class Item {
	private int playingTime;
	private String comment;
	private String title;
	public Item(String title) {
		super();
		this.setTitle(title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
