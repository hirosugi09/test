package bookmoney;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class FileShow {
    public void show() {
        String[] data = new String[0];
        try {
            BufferedReader yomikomiReadaer = new BufferedReader(new FileReader("okodukai.csv", StandardCharsets.UTF_8));

            String line ;
            while ((line = yomikomiReadaer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
