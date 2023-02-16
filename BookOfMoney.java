package bookmoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ClientInfoStatus;
import java.util.Collections;
import java.util.List;

public class BookOfMoney {

    private List<Item> list;

    public static void main(String[] args) throws IOException {
        BookOfMoney bookOfMoney = new BookOfMoney();
        bookOfMoney.mainLoop();
    }

    public void mainLoop() throws IOException {

        boolean numberLoop = true;
        Object obj = new Object[100];
        while (numberLoop) {
            System.out.println("-------------------------------------");
            System.out.println("使いたい機能の数字を選択してください");
            System.out.println("-------------------------------------");
            System.out.println("1:収入・支出入力");
            System.out.println("2:ファイル表示");
            System.out.println("3:整形表示(+データロード)");
            System.out.println("4:データロード2");
            System.out.println("5:整形表示2");
            System.out.println("6:データロード3");
            System.out.println("7:残額表示");
            System.out.println("8:整形表示3");
            System.out.println("9:終了");

            BufferedReader numberReader = new BufferedReader(new InputStreamReader(System.in));
            String number = numberReader.readLine();

            switch (number) {//収入・支出入力
                case "1":
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println("収入・支出入力を開始します");
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
                    BalanceOfPayment balanceOfPayment = new BalanceOfPayment();
                    balanceOfPayment.inputOutput();
                    balanceOfPayment.inOut();
                    balanceOfPayment.moneySize();
                    balanceOfPayment.hosoku();
                    break;
                case "2": //ファイル表示
                    System.out.println(">>>>>>>>>>>>>>>>>");
                    System.out.println("ファイルを表示します");
                    System.out.println("<<<<<<<<<<<<<<<<<");
                    FileShow fileShow = new FileShow();
                    fileShow.show();
                    break;
                case "3"://整形表示
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("整形表示をします");
                    System.out.println("<<<<<<<<<<<<<<");
                    Formating format1 = new Formating();
                    format1.formating();
                    break;
                case "4"://データロード2
                    DataLoad dataLoad2 = new DataLoad();
                    obj = dataLoad2.dataLoad();
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("データロードが完了しました。");
                    System.out.println("<<<<<<<<<<<<<<");
                    break;
                case "5"://整形表示2
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("整形表示を表示します");
                    System.out.println("<<<<<<<<<<<<<<");
                        Formating2 form2 = new Formating2();
                        form2.formating2((Object[]) obj);
                        System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|");
                        break;
                case "6"://データロード3

                    DataLoad3 data3 =new DataLoad3();
                    data3.dataLoad3();
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("データロードが完了しました。");
                    System.out.println("<<<<<<<<<<<<<<");
                    break;

                case "7"://残額計算
                    Balance balance=new Balance();
                     list = balance.balance();
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("残額計算が完了しました。");
                    System.out.println("<<<<<<<<<<<<<<");
                    break;

                case "8"://整形表示3
                    System.out.println("整形したデータを表示します");
                    Formating3 formating3 = new Formating3();
                    formating3.formating3(list);
                    break;

                case "9"://終了
                    System.out.println(">>>>>>>>>>>>>>");
                    System.out.println("終了します");
                    System.out.println("<<<<<<<<<<<<<<");
                    numberLoop = false;
                    break;
            }
        }
    }
}