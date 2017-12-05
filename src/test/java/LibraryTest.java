import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library theLibrary;
    Publisher thePublisher;
    Book book1;
    Book book2;
    Book book3;
    Book bookToSell;


    @Before
        public void before() {
        theLibrary = new Library("A Place For Books");
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        theLibrary.add(book1);
        thePublisher = new Publisher( "We Sell Books");

    }

    @Test
    public void hasName(){
        assertEquals("A Place For Books", theLibrary.checkName());
    }

    @Test
    public void hasBooks(){
        theLibrary.add(book2);
        assertEquals(2, theLibrary.checkBookAmount());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(2, theLibrary.checkCapacity());
    }

    @Test
    public void canResupply(){
        thePublisher.addBook(book1);
        thePublisher.addBook(book2);
        thePublisher.addBook(book3);
        bookToSell = thePublisher.removeBook ();
        theLibrary.add(bookToSell);
        assertEquals(2, theLibrary.checkBookAmount());
        assertEquals(2, thePublisher.howManyBooks());
    }





}
