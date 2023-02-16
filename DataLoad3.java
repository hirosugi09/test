package bookmoney;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataLoad3 {
    public List<Item> dataLoad3() throws IOException {
        List<Item> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("okodukai.csv"), StandardCharsets.UTF_8));

            String line ;
            String[] data = new String[0];

            while ((line = br.readLine()) != null){
                    data = line.split(",");

                if (data[0].equals("お財布")) {
                    Wallet wallet = new Wallet(data[0], data[1], data[2], data[3]);
                    Item itemWallet = wallet;
                    list.add(itemWallet);
                } else if (data[0].equals("食費")) {
                    FoodExpenses foodExpenses = new FoodExpenses(data[0], data[1], data[2], data[3]);
                    Item itemFoodExpenses = foodExpenses;
                    list.add(itemFoodExpenses);
                } else if (data[0].equals("書籍")) {
                    BookFee bookFee = new BookFee(data[0], data[1], data[2], data[3]);
                    Item itemBookFee = bookFee;
                    list.add(itemBookFee);
                } else if (data[0].equals("日用品費")) {
                    DailyCost dailyCost = new DailyCost(data[0], data[1], data[2], data[3]);
                    Item itemDailyCost = dailyCost;
                    list.add(itemDailyCost);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}