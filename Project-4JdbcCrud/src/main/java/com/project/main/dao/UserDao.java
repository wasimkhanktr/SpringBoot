package com.project.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.main.entities.User;

@Repository
public class UserDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public boolean insertUser(User user) {
        boolean status = false;
        
        try {
           
            String sql = "INSERT INTO USER(name, email, gender, city) VALUES(?, ?, ?, ?)";
            int count = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getGender(), user.getCity());
            
            if (count == 1) {
                status = true;
            } else {
                status = false;
            }
            
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        
        return status;
    }
}
