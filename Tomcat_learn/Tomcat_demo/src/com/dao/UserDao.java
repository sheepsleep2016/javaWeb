package com.dao;

import com.bean.User;

import java.sql.SQLException;

public interface UserDao {

    public User checkUsernameAndPassword(String username, String password) throws SQLException;

}
