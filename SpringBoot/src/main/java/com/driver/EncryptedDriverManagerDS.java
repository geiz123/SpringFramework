package com.driver;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * When completed use this class in beans.xml to decrypt username and password.  Maybe
 * the SQL connection string too.
 * 
 */
public class EncryptedDriverManagerDS extends DriverManagerDataSource {

    @Override
    public String getPassword() {
        String password = super.getPassword();
        
        return decode(password);
    }

    /**
     * You can implement your own decoding method.
     */
    private String decode(String decode) {
        return decode;
    }

    // @Override
    // public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    // return null;
    // }
}
