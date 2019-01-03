package Strategy.answer4of10;

public class SortAndPrint {
    Comparable [] data;
    Sorter sorter;

    public  SortAndPrint(Comparable [] data,Sorter sorter){
        this.data = data;
        this.sorter = sorter;
    }

    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    public void print(){
        for(Comparable temp:data){
            System.out.print(temp + " ");
        }
        System.out.println("");
    }
}
