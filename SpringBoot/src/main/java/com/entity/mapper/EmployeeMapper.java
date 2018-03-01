package com.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int colNum) throws SQLException {
        Employee e = new Employee();
        
        e.setEmployeeId(rs.getInt("employeeid"));
        e.setLastName(rs.getObject("lastname"));
        e.setFirstName(rs.getObject("firstname"));
        e.setTitle(rs.getObject("title"));
        e.setReportsTo(rs.getInt("reportsto"));
        e.setBirthDate(rs.getObject("birthdate"));
        e.setHireDate(rs.getObject("hiredate"));
        e.setAddress(rs.getObject("address"));
        
        return e;
    }

}
