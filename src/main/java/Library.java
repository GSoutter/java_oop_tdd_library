import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int numberOfBooks() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (numberOfBooks() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book removeBook() {
        if (numberOfBooks() > 0) {
            return this.stock.remove(0);
        }
        return null;
    }
}
