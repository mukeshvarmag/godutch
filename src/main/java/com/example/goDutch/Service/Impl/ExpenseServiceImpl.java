package com.example.goDutch.Service.Impl;

// ExpenseServiceImpl.java
import com.example.goDutch.Model.Expenses;
import com.example.goDutch.Repository.ExpenseRepository;
import com.example.goDutch.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expenses> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Optional<Expenses> getExpenseById(Long expenseId) {
        return expenseRepository.findById(expenseId);
    }

    @Override
    public Expenses createExpense(Expenses expenses) {
        return expenseRepository.save(expenses);
    }

    @Override
    public void deleteExpense(Long expenseId) {
        expenseRepository.deleteById(expenseId);
    }
}
