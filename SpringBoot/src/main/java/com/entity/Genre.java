package com.entity;

import java.io.Serializable;

public class Genre implements Serializable {
	private static final long serialVersionUID = 1L;

	private int genreId;

	private Object name;

	public Genre() {
	}

	public int getGenreId() {
		return this.genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

}