import java.util.ArrayList;

// Herança: Cliente herda de usuário
public class Client extends User {

    /*
    Composição 1 para muitos:
    1 Cliente pode ter muitas ordens de compras
    Mas 1 ordem de compra só pertence à um único cliente
     */
    private ArrayList<Order>orders = new ArrayList<Order>();

    public void createOrder(){
        /*
        Composição: a ordem de compra é instanciada dentro da classe cliente,
        ou seja, se o cliente deixar de existir, todas as suas ordens de compra
        também deixam de existir.
         */
        this.orders.add(new Order(orders.size()));
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
