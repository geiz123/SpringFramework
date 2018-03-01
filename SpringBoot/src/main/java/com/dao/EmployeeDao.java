package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

    public List<Employee> getAll();

    public List<Employee> getByName(String name);

    public Employee getById(int id);
}
