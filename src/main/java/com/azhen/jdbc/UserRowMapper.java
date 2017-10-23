package com.azhen.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class UserRowMapper implements RowMapper<User> {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User person = new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("sex"));
        return person;
    }
}
