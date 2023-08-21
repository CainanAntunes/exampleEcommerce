import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Produtos cadastrados no sistema
        ArrayList <Product> products = new ArrayList<Product>();
        // Usuários cadastrados no sistema
        // Polimorfismo: a lista de usuários pode conter cliente e gerentes
        ArrayList <User> users = new ArrayList<User>();

        // Cadastra um gerente
        Manager manager = new Manager();
        manager.register("Caina","caina@gmail.com","1234");
        users.add(manager);

        // Gerente adiciona um produto ao sistema
        products.add(manager.registerProduct(products.size(),
                                            "cerveja",4.54));

        // Cadastra um cliente
        Client client = new Client();
        client.register("Bruno", "bruno@qqrcoisa.com", "4321");
        users.add(client);

        // Cliente cria uma ordem de compra
        client.createOrder();
        // Cliente adiciona um produto do sistam à sua ordem de compra
        client.getOrders().get(0).addProduct(products.get(0));
        // Exibe o produto adicionado na ordem de compra do cliente
        System.out.println(client.getOrders().get(0).getProducts().get(0));
    }
}