package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("test1"));
        bookShelf.appendBook(new Book("test2"));
        bookShelf.appendBook(new Book("test3"));
        bookShelf.appendBook(new Book("test4"));
        bookShelf.appendBook(new Book("test5"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
