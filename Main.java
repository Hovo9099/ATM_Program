import main.atm.ATM;
import main.bank.AccountService;
import main.bank.Insure;
import main.common.BankCard;
import main.common.CardService;
import main.exception.ATMException;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<BankCard> bankCards = CardService.provideBankCardsForInsure(Insure.ID);
        ATM atm = new ATM();
        for (BankCard card: bankCards) {
            try {
                atm.cardInput(card);
                atm.withdrawMoney(50000);
            } catch (ATMException e) {
                e.printStackTrace();
            }

        }
        AccountService.prepareAccountForInsure(Insure.ID).stream().forEach(System.out::println);
    }
}
