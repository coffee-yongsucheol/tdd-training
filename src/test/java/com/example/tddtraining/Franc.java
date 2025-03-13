package com.example.tddtraining;

public class Franc extends Money {

    private String currency;

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

    public int valueOf() {
        return this.amount;
    }

    String currency() {
        return currency;
    }

}
