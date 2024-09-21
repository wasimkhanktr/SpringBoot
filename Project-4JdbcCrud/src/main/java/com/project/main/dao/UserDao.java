package com.project.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
    
    public boolean updateUser(User user) {
        boolean status = false;
        
        try {
           
            String sql = "UPDATE USER set name=?, gender=?, city=? where email = ?";
            int count = jdbcTemplate.update(sql, user.getName(), user.getGender(), user.getCity(),user.getEmail());
            
            if (count>0) {
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
    
    public boolean deleteUserByEmail(String email) {
        boolean status = false;
        
        try {
           
            String sql = "DELETE FROM USER where email = ?";
            int count = jdbcTemplate.update(sql,email);
            
            if (count>0) {
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
    
    public static final class UserRowMapper implements RowMapper<User>
    {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user=new User();
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			user.setGender(rs.getString("gender"));
			user.setCity(rs.getString("city"));
			
			return user;
		}
    	
    }
    
    public User getUserByemail(String email)
    {
    		String SelcetSQL="SELECT * FROM USER WHERE EMAIL =?";
    		return jdbcTemplate.queryForObject(SelcetSQL, new UserRowMapper(),email);
    		
    }

}
