package com.example.tddtraining;

public class Franc {
    private int amount;

    public Franc(int i) {
        this.amount = i;
    }

    public Franc times(int i) {
        return new Franc(this.amount * i);
    }

    public int valueOf() {
        return this.amount;
    }

    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
