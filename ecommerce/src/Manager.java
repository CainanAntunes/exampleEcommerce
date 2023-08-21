// Herança: Gerente herda de usuário
public class Manager extends User {
    public Product registerProduct(int idProduct, String name, double price){
        return new Product(idProduct,name,price);
    }
}
