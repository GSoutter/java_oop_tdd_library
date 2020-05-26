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
}
