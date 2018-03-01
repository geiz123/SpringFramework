package com.entity;

import java.io.Serializable;

/**
 * The persistent class for the "albums" database table.
 * 
 */
public class Album implements Serializable {
	private static final long serialVersionUID = 1L;

	private int albumId;

	private int artistId;

	private Object title;

	public Album() {
	}

	public int getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public int getArtistId() {
		return this.artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public Object getTitle() {
		return this.title;
	}

	public void setTitle(Object title) {
		this.title = title;
	}

}