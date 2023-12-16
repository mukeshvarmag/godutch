package com.example.goDutch.Repository;

// UserRepository.java
import com.example.goDutch.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    // You can define custom queries if needed
    Optional<Users> findByUsername(String username);
}

