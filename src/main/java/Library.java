import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> stock;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.stock = new ArrayList<>();
        this.capacity = capacity;
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

    public int getCapacity(){
       return this.capacity;
    }
}
