package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.driver.EncryptedDriverManagerDS;

// http://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch06s02.html

@Configuration
@ComponentScan("com.dao, com.dao.impl")
public class SpringConfig {

    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        EncryptedDriverManagerDS ret = new EncryptedDriverManagerDS();

        //ret.setUrl("jdbc:sqlite:/home/g/work/sqlite/testdb");
        //ret.setUrl("jdbc:sqlite:/home/g/Desktop/database/chinookrmd");
        
        ret.setUrl("jdbc:sqlite:E:\\Work\\database\\sqlite\\chinook.db");
        ret.setDriverClassName("org.sqlite.JDBC");
        
        return ret;
    }
    
    @Bean(name = "jdbcTemplate")
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate ret = new JdbcTemplate(dataSource());

        return ret;
    }

}
