import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublisherTest {

    Publisher thePublisher;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        thePublisher = new Publisher("We Sell Books");
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        thePublisher.addBook(book1);
        thePublisher.addBook(book2);
        thePublisher.addBook(book3);
    }

    @Test
    public void hasName(){
        assertEquals("We Sell Books", thePublisher.checkName());
    }

    @Test
    public void canHowManyBooks(){
        assertEquals(3, thePublisher.howManyBooks());
    }

    @Test
    public void canRemoveBook(){
        thePublisher.removeBook();
        assertEquals(2, thePublisher.howManyBooks());
    }


}
