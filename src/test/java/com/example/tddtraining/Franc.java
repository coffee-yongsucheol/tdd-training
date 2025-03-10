package com.example.tddtraining;

public class Franc extends Money {

    public Franc(int i) {
        this.amount = i;
    }

    public Franc times(int i) {
        return new Franc(this.amount * i);
    }

    public int valueOf() {
        return this.amount;
    }

}
