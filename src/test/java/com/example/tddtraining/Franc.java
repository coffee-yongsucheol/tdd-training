package com.example.tddtraining;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
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
