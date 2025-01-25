package com.example.tddtraining;

public class Dollar {
    public int amount;

    public Dollar(int i) {
        amount = i;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
