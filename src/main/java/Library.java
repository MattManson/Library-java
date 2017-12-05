import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.capacity = 2;
    }

    public String checkName() {
        return this.name;
    }

    public int checkBookAmount() {
        return this.books.size();
    }

    public void add(Book aBook) {
        if (books.size() < capacity) {
            this.books.add(aBook);
        }
    }

    public int checkCapacity() {
        return this.capacity;
    }




}
