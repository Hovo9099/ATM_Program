package main.atm;

import main.arca.ArcaService;
import main.common.BankCard;
import main.exception.ATMException;
import main.exception.ArcaException;
import main.exception.InvalidCardException;

public class ATM {

    private BankCardValidator validator;
    private BankCard currentCard;
    private int availableMoney;
    private ArcaService processingCenter;


    public ATM() {
        this.validator = new BankCardValidator();
        this.processingCenter = new ArcaService();
        this.availableMoney = 1000000;
    }

    public void cardInput(BankCard card) throws ATMException {

        if (currentCard != null)
            throw new ATMException("ATM is busy");

        try {
            validator.validateBankCard(card);
            this.currentCard = card;
        } catch (InvalidCardException e) {
            e.printStackTrace();
            throw new ATMException(e.getMessage());
        }
    }

    public void withdrawMoney(int money) throws ATMException {
        if (currentCard == null)
            throw new ATMException("No card available");
        if (availableMoney < money) {
            currentCard = null;
            throw new ATMException("Not enough money");
        }

        try {
            processingCenter.processTransaction(currentCard, money);
            availableMoney -= money;
            System.out.println(availableMoney);
        } catch (ArcaException e) {
            e.printStackTrace();
            currentCard = null;
            throw new ATMException(e.getMessage());

        }
        currentCard = null;

    }
}
