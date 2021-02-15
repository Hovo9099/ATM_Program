package main.common;

import main.bank.Insure;

public class BankCard {
    private final String owner;
    private final String pan;
    private final String expireDate;
    private Insure InsureBank;


    public BankCard(String owner, String pan, String expireDate, Insure bank) {
        this.owner = owner;
        this.pan = pan;
        this.expireDate = expireDate;
        this.InsureBank = bank;
    }

    public String getOwner() {
        return owner;
    }

    public String Pan() {
        return pan;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public Insure getInsureBank() {
        return InsureBank;
    }

}
