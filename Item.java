package bookmoney;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Item {
    private String meimoku;
    private String inputOutput;
    private String kingaku;
    private int balance;

    public String getMeimoku() {
        return this.meimoku;
    }

    public String getInputOutput() {
        return this.inputOutput;
    }

    public String getKingaku() {

        return this.kingaku;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Item(String meimoku, String inputOutput, String kingaku) {
        this.meimoku = meimoku;
        this.inputOutput = inputOutput;
        this.kingaku = kingaku;
    }
    public String getTableParts() throws UnsupportedEncodingException {
        String spaceMeimoku = "";
        for (int i = (this.getMeimoku()).getBytes("Shift_JIS").length; i < 20; i++) {
            spaceMeimoku += " ";
        }

        String spaceKingaku = "";
        for (int i = (this.getKingaku()).getBytes("Shift_JIS").length; i < 20; i++) {
            spaceKingaku += " ";
        }
        String spaceBalance = "";
        String balance_str = String.valueOf(this.getBalance());
        for (int i = (balance_str).getBytes("Shift_JIS").length; i < 20; i++) {
            spaceBalance += " ";
        }
        String table = null;
        String spaceSpace = "                    ";

        switch (this.getInputOutput()) {
            case ("入"):
                //getBalance=0
                table = "|" + this.getMeimoku() + spaceMeimoku + "|" + this.getKingaku() + spaceKingaku + "|" + spaceSpace + "|" + this.getBalance() +spaceBalance+ "|";
                break;
            case ("出"):
                table = "|" +this.getMeimoku() + spaceMeimoku + "|" + spaceSpace + "|" + this.getKingaku() + spaceKingaku + "|" + this.getBalance() +spaceBalance+ "|";
                break;
        }
        return table;
    }
}