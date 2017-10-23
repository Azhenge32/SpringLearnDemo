package com.azhen.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void save(User user) {
        jdbcTemplate.update("insert into user(name, age, sex) values(?,?,?)",
                new Object[]{user.getName(), user.getAge(), user.getSex()},
                new int[] {Types.VARBINARY, Types.INTEGER, Types.VARBINARY});
    }

    public List<User> getUsers() {
        List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
        return list;
    }
}
