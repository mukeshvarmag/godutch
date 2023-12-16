package com.example.goDutch.Service.Impl;

// PaymentServiceImpl.java
import com.example.goDutch.Model.Payments;
import com.example.goDutch.Repository.PaymentRepository;
import com.example.goDutch.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payments> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payments> getPaymentById(Long paymentId) {
        return paymentRepository.findById(paymentId);
    }

    @Override
    public Payments createPayment(Payments payments) {
        return paymentRepository.save(payments);
    }

    @Override
    public void deletePayment(Long paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
