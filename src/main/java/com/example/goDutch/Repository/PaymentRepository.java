package com.example.goDutch.Repository;

// PaymentRepository.java
import com.example.goDutch.Model.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payments, Long> {
    // You can define custom queries if needed
}
