package com.example.goDutch.Model;

// Expense.java
import javax.persistence.*;

@Entity
@Table(name = "expenses")
public class Expenses {
    @Id
    @Column(name = "EXPENSE_ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "AMOUNT")
    private double amount;

    // Constructors, getters, and setters

    // Constructors
    public Expenses() {
    }

    public Expenses(long id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
