import java.util.ArrayList;

public class Patron {
    private String name;
    private ArrayList <Book> subscriptions;

public Patron(String name){
    this.name = name;
    this.subscriptions = new ArrayList<>();
}
public String getName(){
    return this.name;
}

public int countBooks(){
    return this.subscriptions.size();
}
public void rentBook(Book book){
    this.subscriptions.add(book);
}
public Book returnBook(){
    return this.subscriptions.remove(0);
}
}
