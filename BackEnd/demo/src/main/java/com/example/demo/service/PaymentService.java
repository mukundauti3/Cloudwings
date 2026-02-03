package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PaymentEntity;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Make payment
    public PaymentEntity savePayment(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }

    // Get payment by ID
    public PaymentEntity getPaymentById(int paymentId) {
        Optional<PaymentEntity> payment =
                paymentRepository.findById(paymentId);
        return payment.orElse(null);
    }

    // Get all payments
    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Delete payment
    public void deletePayment(int paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
