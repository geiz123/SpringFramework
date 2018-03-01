package com.entity;

import java.io.Serializable;

public class PlaylistTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	private int playlistId;

	private int trackId;

	public PlaylistTrack() {
	}

	public int getPlaylistId() {
		return this.playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

}