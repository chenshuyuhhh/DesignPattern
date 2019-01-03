package Decorator;

/**
 * 为字符串装饰上下两条边
 */
public class UpDownBorder extends Border {
    private char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows() - 1)return makeLine(ch,getColumns());
        else return display.getRowText(row - 1);
    }

    private String makeLine(char ch,int count){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i<count;i++){
            buf.append(ch);
        }
        return buf.toString();
    }
}
