package Strategy.answer4of10;

public class Main {
    public static void main(String[] args) {
        String [] data1 = {
                "Dq","Yum","Etroy","Alice","Tuw","Bund"
        };
        SortAndPrint sap1 = new SortAndPrint(data1,new SelectionSorter());
        sap1.execute();
        String [] data2 = {
                "Durt","Yong","Ect","Aop","Tcvr","Berfy"
        };
        SortAndPrint sap2 = new SortAndPrint(data2,new FastSorter());
        sap2.execute();
    }
}
