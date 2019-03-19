import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    public Borrower borrower;
    public Book book;
    public Book book2;
    public Library library;

    @Before
    public void setup(){
        borrower = new Borrower();
        book = new Book("The Lion, the Witch and the Wardrobe", "C. S. Lewis", "Children's fantasy");
        book2 = new Book("The Player Of Games", "Ian M. Banks", "Science Fiction");
        library = new Library(3);
        library.addBook(book);
        library.addBook(book2);

    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.collectionSize());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1,borrower.collectionSize());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1,borrower.collectionSize());
        assertEquals(1,library.stockCount());
    }
}
