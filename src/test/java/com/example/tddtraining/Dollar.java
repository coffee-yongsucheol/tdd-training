package com.example.tddtraining;

public class Dollar {
    public int amount;

    public Dollar(int i) {
        amount = i;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
