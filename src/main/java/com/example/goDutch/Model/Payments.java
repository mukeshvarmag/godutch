package com.example.goDutch.Model;

// Payment.java

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments {
    @Id
    @Column(name = "PAYMENT_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PAYER_ID")
    private Users payer;

    @ManyToOne
    @JoinColumn(name = "PAYEE_ID")
    private Users payee;
    @Column(name = "AMOUNT")
    private double amount;

    // Constructors, getters, and setters

    // Constructors
    public Payments() {
    }

    public Payments(Long id, Users payer, Users payee, double amount) {
        this.id = id;
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getPayer() {
        return payer;
    }

    public void setPayer(Users payer) {
        this.payer = payer;
    }

    public Users getPayee() {
        return payee;
    }

    public void setPayee(Users payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

