package com.example.tddtraining;

public class Franc extends Money {

    public Franc(int i) {
        this.amount = i;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public int valueOf() {
        return this.amount;
    }

}
