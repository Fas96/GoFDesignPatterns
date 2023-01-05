package org.code.behaviorial.chainofresponsibility;

public class Currency {
    private int _amount;

    public Currency(int amt){
        this._amount=amt;
    }

    public int getAmount(){
        return this._amount;
    }
}
