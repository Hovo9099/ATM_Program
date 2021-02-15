package main.bank;

import main.common.BankCard;

import java.util.*;

public class AccountService {
    private static Map<Insure, Set<Account>> accountData = new HashMap<>();

    public static Set<Account> prepareAccountForInsure(Insure bank) {
        if (accountData.get(bank)==null || accountData.get(bank).isEmpty()) {

            Set<Account> accountSet = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                accountSet.add(openBankAccount(printBankCard(bank)));
            }
            accountData.put(bank, accountSet);
            return accountSet;
        }
        return accountData.get(bank);
    }

    private static BankCard printBankCard(Insure bank) {
        BankCard result = new BankCard("name surename", "4984124568740024", "02/25", bank);
        return result;
    }

    private static Account openBankAccount(BankCard bank) {
        String accountNumber = "";
        for (int i = 0; i < 12; i++) {
            int k = (int) (Math.random() * 10);
            accountNumber += k;
        }
        return new Account(bank, accountNumber, 500000);
    }

}
