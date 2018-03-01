package com.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entity.Album;

public class AlbumMapper implements RowMapper<Album> {

    @Override
    public Album mapRow(ResultSet rs, int colNum) throws SQLException {
        Album a = new Album();
        
        a.setAlbumId(rs.getInt("albumid"));
        a.setArtistId(rs.getInt("artistid"));
        a.setTitle(rs.getObject("title"));
        
        return a;
    }

}
