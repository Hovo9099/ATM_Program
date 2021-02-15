package main.atm;

import main.common.BankCard;
import main.exception.InvalidCardException;

public class BankCardValidator {
    public void validateBankCard(BankCard card) throws InvalidCardException {

    }

    private void validateOwner(String owner) throws InvalidCardException{
        if (!(owner.matches("[a-zA-Z]")))
            throw new InvalidCardException("invalid owner");
    }

    private void validatePan(String pan) throws InvalidCardException{
        if (!(pan.matches("^[0-9]")))
            throw new InvalidCardException("invalid pan");
        //if (pan.length()!=16)
        //    throw new InvalidCardException("invalid pan");
    }
    private void validateExpireDate(String expireDate) throws InvalidCardException{

    }
}
