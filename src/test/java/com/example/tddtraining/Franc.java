package com.example.tddtraining;

public class Franc extends Money {

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public int valueOf() {
        return this.amount;
    }

    String currency() {
        return currency;
    }

}
