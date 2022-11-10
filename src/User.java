import java.util.LinkedList;
import java.util.List;

public class User {
    private final String nif;
    private final String name;

    List<Order> orderList;

    public User(String nif, String name){
        this.nif = nif;
        this.name = name;
        this.orderList = new LinkedList<Order>();
    }

    public void addOrder(Order o) {
        this.orderList.add(o);
    }
}
