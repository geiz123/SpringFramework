package com.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entity.People;

public class PeopleMapper implements RowMapper<People> {

    @Override
    public People mapRow(ResultSet rs, int colNum) throws SQLException {
        People p = new People();
        
        p.setId(rs.getInt("id"));
        p.setfName(rs.getString("fname"));
        p.setlName(rs.getString("lname"));
        p.setDob(rs.getInt("dob"));
        
        return p;
    }

}
