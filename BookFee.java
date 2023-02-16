package bookmoney;

import java.io.UnsupportedEncodingException;

public class BookFee extends Item{
    private String hosoku ;

    public BookFee(String meimoku, String inputOutput, String kingaku,String hosoku) {
        super(meimoku, inputOutput,kingaku);
        this.hosoku = hosoku;
    }

    @ Override
    public String getTableParts() throws UnsupportedEncodingException {
        String spaceHosoku ="";
        for (int i = this.hosoku.getBytes("Shift_JIS").length;i<20;i++){
            spaceHosoku+= " ";
        }
        String table;
                table=super.getTableParts()+this.hosoku+spaceHosoku+"|";
                System.out.println("|--------------------|--------------------|--------------------|--------------------|--------------------|");
        return table;
    }
}