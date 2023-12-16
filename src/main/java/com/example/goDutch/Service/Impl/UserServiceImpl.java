package com.example.goDutch.Service.Impl;

// UserServiceImpl.java
import com.example.goDutch.Model.Users;
import com.example.goDutch.Repository.UserRepository;
import com.example.goDutch.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Users> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Users createUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public Users saveOrUpdate(Users users){ return userRepository.save(users);}
}

