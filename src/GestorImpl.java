import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class GestorImpl implements Gestor{

    public GestorImpl(){
        this.users = new HashMap<String, User>();
    }

    List<Product> products;
    Queue<Order> orders;
    HashMap<String, User> users;

    @Override
    public void addUser(String idUser, String name) {

        this.users.put(idUser, new User(idUser, name));
    }

    public User getUser(String idUser){
        User user = this.users.get(idUser);
        return user;
    }

    @Override
    public void addProduct(String name, String description, double prize) {
        this.products.add(new Product(name, description, prize));
    }

    @Override
    public List<Product> productsByPrize() {
        return this.products;
    }

    @Override
    public void addOrder(Order o) {
        this.orders.add(o);
    }

    @Override
    public Order getOrder() {
        Order o = this.orders.peek();
        procces(o);

        User user = o.getUser();

        user.addOrder(o);

        return o;
    }

    private void procces(Order o) {
        int q;
        for (Item i: o.items()) {
            q = i.q;
            product = i.p;

            product.numVendes(q);
        }
    }

    @Override
    public List<Order> ordersByUser(String idUser) {
        return null;
    }

    @Override
    public List<Product> productsBySales() {
        return null;
    }
}
