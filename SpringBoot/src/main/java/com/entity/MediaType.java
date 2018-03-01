package com.entity;

import java.io.Serializable;

public class MediaType implements Serializable {
	private static final long serialVersionUID = 1L;

	private int mediaTypeId;

	private Object name;

	public MediaType() {
	}

	public int getMediaTypeId() {
		return this.mediaTypeId;
	}

	public void setMediaTypeId(int mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

}