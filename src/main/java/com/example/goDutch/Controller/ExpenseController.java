package com.example.goDutch.Controller;

// ExpenseController.java
import com.example.goDutch.Model.Expenses;
import com.example.goDutch.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public List<Expenses> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @GetMapping("/{expenseId}")
    public ResponseEntity<Expenses> getExpenseById(@PathVariable Long expenseId) {
        Optional<Expenses> expense = expenseService.getExpenseById(expenseId);
        return expense.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Expenses> createExpense(@RequestBody Expenses expenses) {
        Expenses createdExpenses = expenseService.createExpense(expenses);
        return new ResponseEntity<>(createdExpenses, HttpStatus.CREATED);
    }

    @DeleteMapping("/{expenseId}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long expenseId) {
        expenseService.deleteExpense(expenseId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

