import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;
    private HashMap<String, Integer> genreHash;


    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
        this.genreHash = new HashMap<String, Integer>();
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
            this.addBookHash(book);
        }
    }

    public Book removeBook() {
        if (numberOfBooks() > 0) {
            Book book = this.stock.remove(0);
            this.removeBookHash(book);
            return book;
        }
        return null;
    }

    public void addBookHash(Book book) {
        String bookGenre = book.getGenre();
        Integer bookCount = this.genreHash.get(bookGenre);
        if (bookCount == null){
            this.genreHash.put(bookGenre, 1);
        } else {
            this.genreHash.put(bookGenre, bookCount +1);
        }

    }


    public void removeBookHash(Book book) {
        String bookGenre = book.getGenre();
        Integer bookCount = this.genreHash.get(bookGenre);
        this.genreHash.put(bookGenre, bookCount -1);

    }


    public int numberOfBooksByGenre(String genre) {
        return this.genreHash.get(genre);

    }
}
