package com.github.alym62.facade;

public class Email {
    public void sendEmailWithAmount(double amount, String email) {
        System.out.println("✉️ enviando e-mail para " + email + " com o valor de R$ " + amount);
    }
}
