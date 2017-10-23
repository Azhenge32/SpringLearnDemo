package com.azhen.jdbc;

import java.util.List;

/**
 * @author Azhen
 * @date 2017/10/23
 */
public interface UserService {
    void save(User user);
    List<User> getUsers();
}
