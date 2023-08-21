import java.util.ArrayList;

public class Order {
    private int idOrder;

    // Agregação: uma "cópia" do produto cadastro do sistema é salvo na ordem de compra
    private ArrayList <Product> products = new ArrayList<Product>();

    public Order(int idOrder) {
        this.idOrder = idOrder;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", products=" + products +
                '}';
    }
}
