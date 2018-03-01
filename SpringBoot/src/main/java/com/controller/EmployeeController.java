package com.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.SpringConfig;
import com.dao.EmployeeDao;
import com.entity.Employee;

@RestController
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> ret = null;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            EmployeeDao pd = (EmployeeDao) context.getBean("employeeDaoImpl");
            
            ret = pd.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    @RequestMapping("/employees/{id}")
    public Employee getEmployeesById(@PathVariable("id") int id) {
        Employee ret = null;
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            EmployeeDao pd = (EmployeeDao) context.getBean("employeeDaoImpl");
            ret = pd.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
