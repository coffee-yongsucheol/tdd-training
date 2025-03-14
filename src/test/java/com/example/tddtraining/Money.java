package com.example.tddtraining;

abstract class Money {
    protected int amount;
    protected String currency;

    Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
               && getClass().equals(money.getClass()) ;
    }

    public static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    abstract Money times(int multiplier);

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract String currency();

    public String toString() {
        return amount + " " + currency;
    }

}
