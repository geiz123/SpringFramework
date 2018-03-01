package com.dao;

import java.util.List;

import com.entity.Album;

public interface AlbumDao {
    public List<Album> getAll();

    public Album getByTitle(String title);

    public Album getById(int id);
    
    public List<Album> searchByTitle(String title);
}
