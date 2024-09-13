package com.br_sistemas.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.br_sistemas.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
