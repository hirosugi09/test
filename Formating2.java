package bookmoney;

import java.io.IOException;

public class Formating2 {
    public void formating2(Object[] obj) throws IOException {
        System.out.println("+--------------------+--------------------+--------------------+--------------------+--------------------+");
        System.out.println("|        名目        |        収入        |        支出        |        残額        |        補足        |");
        DataLoad dataLoad =new DataLoad();
        dataLoad.dataLoad();
        int i=0;
        while(obj[i]!=null) {
            if (obj[i] instanceof Wallet) {
                Wallet wallet = (Wallet) obj[i];
                System.out.println(wallet.getTableParts());
            } else if (obj[i] instanceof FoodExpenses) {
                FoodExpenses foodExpenses = (FoodExpenses) obj[i];
                System.out.println(foodExpenses.getTableParts());
            } else if (obj[i] instanceof BookFee) {
                BookFee bookFee = (BookFee) obj[i];
                System.out.println(bookFee.getTableParts());
            } else if (obj[i] instanceof DailyCost) {
                DailyCost dailyCost = (DailyCost) obj[i];
                System.out.println(dailyCost.getTableParts());
            }
            i++;
        }
    }
}
