package com.company;

public class CashRegister {
    private double purchase;
    private double payment;
    private int counter;

    public CashRegister() {
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        counter += 1;

    }
    public void recordTaxablePurchase(double amount, double taxRate) {
        purchase += amount+taxRate;
        counter += 1;

    }

    public void receivePayment(double amount) {
        payment += amount;

    }

    public String giveChange() {

        if (payment >= purchase) {
            double change = payment - purchase;
            purchase = 0;
            payment = 0;
            String strChange = Double.toString(change);
            return strChange;
        } else {
            return "Not enough money";
        }
    }
}
