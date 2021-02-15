package main.common;

import main.bank.Account;
import main.bank.AccountService;
import main.bank.Insure;

import java.util.HashSet;
import java.util.Set;

public class CardService {
    public static Set<BankCard> provideBankCardsForInsure(Insure bank) {
        Set<BankCard> result = new HashSet<>();
        Set<Account> accountSet = AccountService.prepareAccountForInsure(bank);
        for (Account a: accountSet) {
            result.add(a.getBankCard());
        }
        return result;
    }
}
