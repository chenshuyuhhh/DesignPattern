package Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books = new ArrayList<>();
    private int last = 0;
    public BookShelf(){
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
        last++;
    }

    public int getLast() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
