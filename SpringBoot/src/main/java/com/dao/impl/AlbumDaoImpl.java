package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.AlbumDao;
import com.entity.Album;
import com.entity.mapper.AlbumMapper;

@Repository("albumDaoImpl")
public class AlbumDaoImpl implements AlbumDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Album> getAll() {
        List<Album> albums = jdbcTemplate.query("select * from albums", new AlbumMapper());
        return albums;
    }

    @Override
    public Album getByTitle(String title) {
        Album album = jdbcTemplate.queryForObject("select * from albums where title = ?", new Object[]{title}, new AlbumMapper());
        return album;
    }

    @Override
    public Album getById(int id) {
        Album album = jdbcTemplate.queryForObject("select * from albums where albumid = ?", new Object[]{id}, new AlbumMapper());
        return album;
    }

    @Override
    public List<Album> searchByTitle(String title) {
        title = '%'+title+'%';
        List<Album> albums = jdbcTemplate.query("select * from albums where title like ?", new Object[]{title}, new AlbumMapper());
        return albums;
    }

}
