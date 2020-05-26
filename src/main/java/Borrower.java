import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;


    public Borrower(){
        this.collection = new ArrayList<Book>();
    }


    public int collectionSize() {
        return this.collection.size();
    }

    public void takeBook(Library library) {
        Book book = library.removeBook();
        if (book != null){
            this.collection.add(book);
        }
    }
}
