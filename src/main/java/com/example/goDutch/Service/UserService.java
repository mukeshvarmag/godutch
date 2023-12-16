package com.example.goDutch.Service;

// UserService.java
import com.example.goDutch.Model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> getAllUsers();

    Optional<Users> getUserById(Long userId);

    Users createUser(Users user);



    void deleteUser(Long userId);

    Users saveOrUpdate(Users user);

}

