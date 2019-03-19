import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;
    public Book book2;
    public Book book3;
    public Book book4;


    @Before
    public void setup(){
        library = new Library(3);
        book = new Book("The Lion, the Witch and the Wardrobe", "C. S. Lewis", "Children's fantasy");
        book2 = new Book("The Player Of Games", "Ian M. Banks", "Science Fiction");
        book3 = new Book("The Adventures of Huckleberry Finn", "Mark Twain", "Fiction");
        book4 = new Book("A Study in Scarlet", "Arthur Conan Doyle", "Detective novel");
    }

    @Test
    public void canAddBook() {
        library.addBook(book2);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBook() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook();
        assertEquals(2, library.stockCount());
    }
}
