package com.dao.impl;

import com.bean.User;
import com.dao.BasicDao;
import com.dao.UserDao;
import com.utils.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private BasicDao basicDao = new BasicDao();

    UserDaoImpl() throws Exception {
    }

    @Override
    public User checkUsernameAndPassword(String username, String password) {
        String sql = "select id,username,password,email from userinfo where username= ? and password=?";
        return (User) basicDao.getInstance(User.class,sql,username,password);
    }

    public List<User> getAllUser() {
        String sql = "select id,username,password,email from userinfo";
        return basicDao.getForList(User.class,sql);
    }

}
