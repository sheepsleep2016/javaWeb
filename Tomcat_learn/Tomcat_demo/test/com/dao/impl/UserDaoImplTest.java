package com.dao.impl;

import com.bean.User;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {

    @Test
    void checkUsernameAndPassword() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl();
        User resuser = userDao.checkUsernameAndPassword("张三","123456");
        System.out.println(resuser.toString());
    }

    @Test
    void getAllUser() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl();
        List<User> userlist = userDao.getAllUser();
        for  (User user: userlist) {
            System.out.println(user.toString());
        }
    }
}