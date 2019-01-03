package Decorator;

public class SideBorder extends Border {
    private char bc;

    public SideBorder(Display display, char bc) {
        super(display);
        this.bc = bc;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return bc + display.getRowText(row) + bc;
    }
}
