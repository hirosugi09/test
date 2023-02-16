package bookmoney;

import java.io.IOException;
import java.util.List;
public class Balance {
    public List<Item> balance() throws IOException {
        DataLoad3 load3 = new DataLoad3();
        List listdata = load3.dataLoad3();
        
        Item listItem;
        int balance = 0;

        for (int i = 0; i < listdata.size(); i++) {
            listItem = (Item) listdata.get(i);
            if (listItem.getInputOutput().equals("入")) {
                String money = listItem.getKingaku();
                int moneyInt = Integer.parseInt(money);
                balance += moneyInt;
                listItem.setBalance(balance);
            } else if (listItem.getInputOutput().equals("出")) {
                String money = listItem.getKingaku();
                int moneyInt = Integer.parseInt(money);
                balance -= moneyInt;
                listItem.setBalance(balance);
            }
        }
        return listdata;
    }
}