package bookmoney;

import java.io.*;

public class BalanceOfPayment {
    public String inputOutput() throws IOException {//収入・支出入力
        System.out.println("名目を記入してください");
        System.out.println("1:お財布");
        System.out.println("2:食費");
        System.out.println("3:書籍");
        System.out.println("4:日用品費");
        BufferedReader meimokuReader = new BufferedReader(new InputStreamReader(System.in));
        String meimoku = meimokuReader.readLine();
        try {
            FileWriter file = new FileWriter("okodukai.csv", true);
            try (PrintWriter pw = new PrintWriter(file)) {
                switch (meimoku) {//名目入力
                    case "1":
                    case "１":
                        pw.print("お財布");
                        pw.print(",");
                        break;
                    case "2":
                    case "２":
                        pw.print("食費");
                        pw.print(",");
                        break;
                    case "3":
                    case "３":
                        pw.print("書籍");
                        pw.print(",");
                        break;
                    case "４":
                    case "4":
                        pw.print("日用品費");
                        pw.print(",");
                        break;
                }
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return meimoku;
    }

    public String inOut() throws IOException {//入金・出金の選択
        System.out.println("入金または出金を選んでください(1:入金,2:出金)");
        System.out.println("1:入金");
        System.out.println("2:出金");
        BufferedReader inoutReader = new BufferedReader(new InputStreamReader(System.in));
        String inout = inoutReader.readLine();
        try {
            FileWriter file = new FileWriter("okodukai.csv", true);
            try (PrintWriter pw = new PrintWriter(file)) {
                switch (inout) {//名目入力
                    case "1":
                    case "１":
                        pw.print("入");
                        pw.print(",");
                        break;
                    case "2":
                    case "２":
                        pw.print("出");
                        pw.print(",");
                        break;
                }
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inout;
    }

    public String moneySize() throws IOException {
        System.out.println("金額を入力してください");
        BufferedReader kingakuReader = new BufferedReader(new InputStreamReader(System.in));
        String kingaku = kingakuReader.readLine();
        try {
            FileWriter file = new FileWriter("okodukai.csv", true);
            try (PrintWriter pw = new PrintWriter(file)) {
                pw.print(kingaku);
                pw.print(",");
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kingaku;
    }

    public String hosoku() throws IOException {
        System.out.println("補足があれば入力してください。なければ「N/A」と入力してください" );
        BufferedReader hosokuReader = new BufferedReader(new InputStreamReader(System.in));
        String hosoku = hosokuReader.readLine();
        try {
            FileWriter file = new FileWriter("okodukai.csv", true);
            try (PrintWriter pw = new PrintWriter(file)) {
                pw.println(hosoku);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hosoku;
    }
}