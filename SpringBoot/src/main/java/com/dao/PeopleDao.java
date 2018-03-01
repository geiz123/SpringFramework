package com.dao;

import java.util.List;

import com.entity.People;

public interface PeopleDao {

    /**
     * Get everyone
     * @return
     */
    public List<People> getAll();
    
    public List<People> getByName(String name);
    
    public People getById(int id);
}

