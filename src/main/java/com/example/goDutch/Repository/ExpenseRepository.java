package com.example.goDutch.Repository;

// ExpenseRepository.java
import com.example.goDutch.Model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expenses, Long> {
    // You can define custom queries if needed
}
