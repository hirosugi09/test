package bookmoney;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Formating {
    public int getByteLength(String string, Charset charset) {
        return string.getBytes(charset).length;
    }
    public String format(String target, int length) {
        int byteDiff = (getByteLength(target, StandardCharsets.UTF_8) - target.length()) / 2;
        return String.format("%-" + (length - byteDiff) + "s", target);
    }

    public void formating() throws IOException {
        System.out.println("+------------+------+------+----------------------+");
        System.out.println("|   名目     | 収入 | 支出 |       補足           |");
        System.out.println("+------------+------+------+----------------------+");
        try {//ファイル読み込み
            BufferedReader seikeiReader = new BufferedReader(new FileReader("okodukai.csv"));

            String line; // 読み込み行
            seikeiReader.readLine();
            String[] csvArray;
            String[] csv = new String[4];

            while ((line = seikeiReader.readLine()) != null) {

                csvArray = line.split(",");
                // 1行分の読み込みデータを表示（データ間にスペース）

                System.out.print("|" + format(csvArray[0],12));
                if (csvArray[1].equals("入")) {
                    System.out.print("|" + String.format("%6s", csvArray[2]) + "|" + "      ");
                } else if (csvArray[1].equals("出")) {
                    System.out.print("|" +  "      "+"|"+ String.format("%6s", csvArray[2]));
                }
                System.out.print("|" + format( csvArray[3],22) + "|\n" );
                System.out.println("+------------+------+------+----------------------+");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}