package com.geekster.WeeklyTest_Ecommerce.service;

import com.geekster.WeeklyTest_Ecommerce.Repository.IUserRepo;
import com.geekster.WeeklyTest_Ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userDao;

    public void addUsers(User user) {
        userDao.save(user);
    }

    public List<User> getUserById(Integer userId) {
        return userDao.findByUserId(userId);
    }
}
