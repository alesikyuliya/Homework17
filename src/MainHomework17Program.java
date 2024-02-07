import Models.Bank;
import Servise.BankService;

import java.util.Arrays;

public class MainHomework17Program {

    public static void main(String[] args) {

        String bankNameInString = "PRIVATEBANK,PKO,PEKAO,ALIOR,SANTANDER,CITYBANK,IDEABANK,PLUSBANK,GETINBANK,BNPPARIBASBANK,MBANK,BOSBANK,CREDITAGRICOL,MILLENNIUM";

        BankService service = new BankService();

        double[] prices = new double[14];
        Bank[] bank = new Bank[prices.length];

        service.initializeBanksAndPrices(bank, prices, bankNameInString);
        service.showBank(bank);

        Arrays.sort(prices);
        for (int i =  prices.length - 1; i >= 0; i--) {
            if(prices[prices.length - 1] == bank[i].price ||
                    prices[prices.length - 2] == bank[i].price ||
                    prices[prices.length - 3] == bank[i].price){
                System.out.println("_____________________________");
                System.out.println(bank[i]);
            }
        }
    }
}
