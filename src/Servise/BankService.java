package Servise;

import Models.Bank;

import java.util.Random;

public class BankService {
    Random random = new Random();

    public void initializeBanksAndPrices(Bank[] banks, double[] prices, String bankNameInString){
        String[] bankName = bankNameInString.split(",");
        for (int i = 0; i < banks.length; i++) {
            prices[i] = random.nextDouble() * 5 + 37;
            Bank bank = new Bank(bankName[i], prices[i]);
            banks[i] = bank;
        }
    }

    public void showBank(Bank[] banks){
        for(Bank bank:
        banks){
            System.out.println(bank);
        }
    }
}
