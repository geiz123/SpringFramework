package com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.entity.mapper.EmployeeMapper;

@Repository("employeeDaoImpl")
public class EmployeeDayImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Employee> getAll() {
        List<Employee> employees = jdbcTemplate.query("select * from employees", new EmployeeMapper());
        
        return employees;
    }

    @Override
    public List<Employee> getByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee getById(int id) {
    	Employee employee = jdbcTemplate.queryForObject("select * from employees where employeeid = ?", new Object[]{id}, new EmployeeMapper());
        return employee;
    }

}
