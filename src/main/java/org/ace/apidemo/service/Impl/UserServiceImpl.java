package org.ace.apidemo.service.Impl;

import org.ace.apidemo.entity.User;
import org.ace.apidemo.repository.UserRepo;
import org.ace.apidemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
