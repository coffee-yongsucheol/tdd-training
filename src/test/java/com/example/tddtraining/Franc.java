package com.example.tddtraining;

public class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

     public int valueOf() {
        return this.amount;
    }

    String currency() {
        return currency;
    }

}
