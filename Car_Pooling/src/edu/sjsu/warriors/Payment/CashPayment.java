package edu.sjsu.warriors.Payment;

public class CashPayment extends Payment {
    public CashPayment(String _payerName,double _pAmount) {
    	super(_payerName,_pAmount);
    }

    @Override
    public void setupPayment() {
        System.out.println("Passenger has selected cash payment method");
    }

    @Override
    public void processPayment() {
        System.out.format("Passenger "+get_payerName()+" paid cash in the amount of $ "+get_pAmount()+" for services\n");
    }

    @Override
    public void printReceipt() {
        System.out.format("Report: Passenger Paid $%.2f\n", +get_pAmount());
    }
}