package bookmoney;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataLoad {
    public Object[] obj;

    public Object dataLoad() throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("okodukai.csv"), StandardCharsets.UTF_8))) {
            String line;
            this.obj = new Object[50];
            String[] data;
            int i = 0;

            while ((line = br.readLine()) != null) {
                data = line.split(",");

                if (data[0].equals("お財布")) {
                    Wallet wallet = new Wallet(data[0], data[1], data[2], data[3]);
                    this.obj[i] = wallet;
                } else if (data[0].equals("食費")) {
                    FoodExpenses foodExpenses = new FoodExpenses(data[0], data[1], data[2], data[3]);
                    this.obj[i] = foodExpenses;
                } else if (data[0].equals("書籍")) {
                    BookFee bookFee = new BookFee(data[0], data[1], data[2], data[3]);
                    this.obj[i] = bookFee;
                } else if (data[0].equals("日用品費")) {
                    DailyCost dailyCost = new DailyCost(data[0], data[1], data[2], data[3]);
                    this.obj[i] = dailyCost;
                } else {
                    System.out.println("名目が正しくありません");
                }
                i++;
            }
            return this.obj;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}