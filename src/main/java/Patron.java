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
}
