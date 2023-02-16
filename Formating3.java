package bookmoney;

import java.io.IOException;
import java.util.List;
public class Formating3 {
    public void formating3(List<Item> list) throws IOException {
        System.out.println("+--------------------+--------------------+--------------------+--------------------+--------------------+");
        System.out.println("|        名目        |        収入        |        支出        |        残額        |        補足        |");
        System.out.println("+--------------------+--------------------+--------------------+--------------------+--------------------+");
        Balance balance = new Balance();
        balance.balance();
        System.out.println(list);
        System.out.println(list);
        System.out.println(list);
        System.out.println(list);

            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    Item dataItem = list.get(i);
                    System.out.println(dataItem.getTableParts());
                }
            }else{
                    System.out.println("データロードをしてください");
            }
            System.out.println("+--------------------+--------------------+--------------------+--------------------+--------------------+");
    }
}