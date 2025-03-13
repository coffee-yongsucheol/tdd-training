package com.example.tddtraining;

public class Dollar extends Money {

    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    String currency() {
        return currency;
    }

}
