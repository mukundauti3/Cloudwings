package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.PaymentEntity;
import com.example.demo.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // Create payment
    @PostMapping
    public PaymentEntity makePayment(
            @RequestBody PaymentEntity payment) {
        return paymentService.savePayment(payment);
    }

    // Get payment by ID
    @GetMapping("/{id}")
    public PaymentEntity getPaymentById(@PathVariable int id) {
        return paymentService.getPaymentById(id);
    }

    // Get all payments
    @GetMapping
    public List<PaymentEntity> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Delete payment
    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable int id) {
        paymentService.deletePayment(id);
        return "Payment deleted successfully";
    }
}
