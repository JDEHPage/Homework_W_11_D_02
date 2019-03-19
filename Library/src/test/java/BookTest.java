import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    public Book book;

    @Before
    public void setup(){
        book = new Book("The Player Of Games", "Ian M. Banks", "Science Fiction");
    }


    @Test
    public void hasTitle() {
        assertEquals("The Player Of Games", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Ian M. Banks", book.getAuthor());
    }

    @Test
    public void hasGenere() {
        assertEquals("Science Fiction", book.getGenere());
    }

}
