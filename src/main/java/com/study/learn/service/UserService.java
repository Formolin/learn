package com.study.learn.service;

import com.study.learn.dao.UserDao;
import com.study.learn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(User user){
        userDao.save(user);
    }

    public User findUser(Integer id){
        User user = userDao.findById(id).get();
        return user;
    }
}
