package edu.sjsu.warriors.Payment;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(String _payerName,double _pAmount,String _ccNumber,String _ccCvv) {
    	super(_payerName,_pAmount,_ccNumber,_ccCvv);
    }

    @Override
    public void setupPayment() {
        System.out.println("Credit Card information validated. Beginning Transaction...");
    }

    @Override
    public void processPayment() {
    	System.out.format("Passenger %s paid the amount with %s card number for services\n", get_payerName(), get_ccNumber());
    }

    @Override
    public void printReceipt() {
        System.out.format("Report: Passenger Paid $%.2f\n", get_pAmount());
    }
}
