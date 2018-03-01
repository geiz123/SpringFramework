package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.PeopleDao;
import com.entity.People;
import com.entity.mapper.PeopleMapper;

@Repository("peopleDaoImpl")
public class PeopleDaoImpl implements PeopleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<People> getAll() {
        List<People> p = jdbcTemplate.query("select * from people", new PeopleMapper());

        return p;
    }

    @Override
    public List<People> getByName(String name) {
        String sql = "select * from people where fname || ' ' || lname like ?";
        
        List<People> p = jdbcTemplate.query(sql, new Object[] {"%"+name+"%"}, new PeopleMapper());

        return p;
    }

    @Override
    public People getById(int id) {
        People p = jdbcTemplate.queryForObject("select * from people where id = ?", new Object[]{id}, new PeopleMapper());

        return p;
    }

}
