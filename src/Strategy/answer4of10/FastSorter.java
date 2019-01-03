package Strategy.answer4of10;

public class FastSorter implements Sorter{
    @Override
    public void sort(Comparable[] data) {
        int start = 0;
        int end = data.length -1;
        fastsort(data,start,end);
    }

    private void fastsort(Comparable[] data,int low,int high){
        int start = low;
        int end = high;
        Comparable key = data[low];

        while (end>start){
            while (end>start && data[end].compareTo(key) >= 0) end--;
            if(data[end].compareTo(key) <= 0){
                Comparable temp = data[end];
                data[end] = data[start];
                data[start] = temp;
            }

            while (end>start && data[start].compareTo(key) <= 0) start++;
            if(data[start].compareTo(key) >= 0){
                Comparable temp = data[end];
                data[end] = data[start];
                data[start] = temp;
            }
        }

        if (start > low) fastsort(data,low,start-1);
        if (end < high) fastsort(data,end+1,high);
    }
}
