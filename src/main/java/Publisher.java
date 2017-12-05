import java.util.ArrayList;

public class Publisher {

    private String name;
    private ArrayList<Book> allBooks;

    public Publisher(String name) {
        this.name = name;
        this.allBooks = new ArrayList<Book>();
    }


    public String checkName() {
        return this.name;
    }

    public void addBook(Book aBook) {
        this.allBooks.add(aBook);
    }

    public int howManyBooks() {
        return this.allBooks.size();
    }

    public Book removeBook() {
       return allBooks.remove(0);
    }
}
