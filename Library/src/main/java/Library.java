import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }


    public void addBook(Book book) {
        if (this.stockCount() < this.capacity)
        this.stock.add(book);
    }

    public int stockCount() {
        return this.stock.size();
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }
}
