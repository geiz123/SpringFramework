package com.entity;

import java.io.Serializable;

public class Artist implements Serializable {
	private static final long serialVersionUID = 1L;

	private int artistId;

	private Object name;

	public Artist() {
	}

	public int getArtistId() {
		return this.artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

}