package com.example.tddtraining;

public class Dollar extends Money {

    public Dollar(int i) {
        amount = i;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
