package edu.sjsu.warriors.Payment;

public abstract class Payment {
    private double _pAmount ;
    private String _payerName ;
    private String _ccNumber;
     private String _ccCvv;

     Payment(String _payerName,double _pAmount,String _ccNumber,String _ccCvv)
     {
    	 this._payerName=_payerName;
    	 this._pAmount=_pAmount;
    	 this._ccNumber=_ccNumber;
    	 this._ccCvv=_ccCvv;
     }
     Payment(String _payerName,double _pAmount)
     {
    	 this._payerName=_payerName;
    	 this._pAmount=_pAmount;
     }
    abstract public void setupPayment();
    abstract public void processPayment();
    abstract public void printReceipt();

    public double get_pAmount() {
        return _pAmount ;
    }

    public String get_payerName() {
        return _payerName;
    }
    public String get_ccNumber() {
        return _ccNumber;
    }
    public String get_ccCvv() {
        return _ccCvv;
    }
}