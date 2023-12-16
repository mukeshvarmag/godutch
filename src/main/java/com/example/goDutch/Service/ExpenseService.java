package com.example.goDutch.Service;

// ExpenseService.java
import com.example.goDutch.Model.Expenses;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<Expenses> getAllExpenses();

    Optional<Expenses> getExpenseById(Long expenseId);

    Expenses createExpense(Expenses expense);

    void deleteExpense(Long expenseId);
}

