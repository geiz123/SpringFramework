package com.entity;

import java.io.Serializable;

public class Playlist implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object name;

	private int playlistId;

	public Playlist() {
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public int getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

}