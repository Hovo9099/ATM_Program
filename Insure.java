package main.bank;

import main.common.BankCard;

import java.util.Set;

public enum Insure {
    ID {
        @Override
        public void processTransaction(BankCard card, int money) {
             Set<Account> accountSet = AccountService.prepareAccountForInsure(this);
             //ete banki accountneri set um ka hamapatasxan main.bank cardi accounty stugel bavarar e ardyoq balance
            //ete chka accounty veradardznel invalidTransactionException("main.bank card not supported from this main.bank for example")
            //ete chka bavarar mnacord veradardznel invalidCardException("Not enough balance")
        }
    },
    ABB {
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    },
    HSBC {
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    },
    Ameria {
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    },
    AEM{
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    },
    Evoca {
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    },
    Ardshin {
        @Override
        public void processTransaction(BankCard card, int money) {

        }
    };

    public abstract void processTransaction(BankCard card, int money);
}
