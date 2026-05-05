package com.redis.redisproject.controller;

import com.redis.redisproject.dao.UserDao;
import com.redis.redisproject.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping("/save")
    public User createUser(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userDao.saveUser(user);
    }

    @GetMapping("/get")
    public User getUser(@RequestParam String userId) {
        return userDao.getUser(userId);
    }

    @GetMapping("/getAll")
    public Map<Object, Object> findAllUsers() {
        return userDao.getAllUser();
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam String userId) {
        userDao.deleteUser(userId);
    }
}
