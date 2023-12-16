package com.example.goDutch.Service;

// PaymentService.java
import com.example.goDutch.Model.Payments;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    List<Payments> getAllPayments();

    Optional<Payments> getPaymentById(Long paymentId);

    Payments createPayment(Payments payment);

    void deletePayment(Long paymentId);
}

