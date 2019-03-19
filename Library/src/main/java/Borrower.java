import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int collectionSize() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        this.collection.add(book);
    }

    public void borrowBook(Library library) {
        if (library.stockCount() > 0){
            this.addBook(library.removeBook());
        }
    }
}
