package com.entity;

import java.io.Serializable;

public class Track implements Serializable {
	private static final long serialVersionUID = 1L;

	private int albumId;

	private int bytes;

	private Object composer;

	private int genreId;

	private int mediaTypeId;

	private int milliseconds;

	private Object name;

	private int trackId;

	private Object unitPrice;

	public Track() {
	}

	public int getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public int getBytes() {
		return this.bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public Object getComposer() {
		return this.composer;
	}

	public void setComposer(Object composer) {
		this.composer = composer;
	}

	public int getGenreId() {
		return this.genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public int getMediaTypeId() {
		return this.mediaTypeId;
	}

	public void setMediaTypeId(int mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}

	public int getMilliseconds() {
		return this.milliseconds;
	}

	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public Object getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Object unitPrice) {
		this.unitPrice = unitPrice;
	}

}