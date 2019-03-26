import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;

    public Library(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addBook(Book book){
        this.stock.add(book);
    }
}
