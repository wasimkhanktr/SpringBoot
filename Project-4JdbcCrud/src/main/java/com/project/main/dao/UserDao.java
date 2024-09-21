package com.project.main.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.project.main.entities.User;
import com.project.main.mapper.UserRowMapper;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user) {
        boolean status = false;

        try {
            String sql = "INSERT INTO USER(name, email, gender, city) VALUES(?, ?, ?, ?)";
            int count = jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getGender(), user.getCity());

            status = (count == 1); // Simplified logic
        } catch (Exception e) {
            status = false;
            e.printStackTrace(); // Consider using a logger in real-world applications
        }

        return status;
    }

    public boolean updateUser(User user) {
        boolean status = false;

        try {
            String sql = "UPDATE USER set name=?, gender=?, city=? where email = ?";
            int count = jdbcTemplate.update(sql, user.getName(), user.getGender(), user.getCity(), user.getEmail());

            status = (count > 0); // Simplified logic
        } catch (Exception e) {
            status = false;
            e.printStackTrace(); // Consider using a logger
        }

        return status;
    }

    public boolean deleteUserByEmail(String email) {
        boolean status = false;

        try {
            String sql = "DELETE FROM USER where email = ?";
            int count = jdbcTemplate.update(sql, email);

            status = (count > 0); // Simplified logic
        } catch (Exception e) {
            status = false;
            e.printStackTrace(); // Consider using a logger
        }

        return status;
    }

    public User getUserByEmail(String email) {
        String selectSQL = "SELECT * FROM USER WHERE email = ?";
        return jdbcTemplate.queryForObject(selectSQL, new UserRowMapper(), email);
    }

    public List<User> allUserDetail() {
        String selectSQL = "SELECT * FROM USER"; // Corrected SQL to retrieve all users
        return jdbcTemplate.query(selectSQL, new UserRowMapper());
    }
}
