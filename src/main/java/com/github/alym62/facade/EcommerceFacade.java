package com.github.alym62.facade;

import java.util.UUID;

public class EcommerceFacade {
    private final Payment payment;
    private final Email email;
    private final Logistic logistic;

    public EcommerceFacade() {
        this.payment = new Payment();
        this.email = new Email();
        this.logistic = new Logistic();
    }

    public String processOrder(UUID cod, String emailAddress, double amount) {
        if (emailAddress.isBlank() || amount <= 0) {
            throw new RuntimeException("Ops! Seu e-mail precisa ser preenchido e o valor precisa ser maior que zero!");
        } else {
            payment.processPayment(amount);
            email.sendEmailWithAmount(amount, emailAddress);
            logistic.sendToLogistic(cod);

            return "Pedido processado com sucesso!";
        }
    }
}
