import java.util.LinkedList;

public interface VendingMachine {

    public void putProduct(LinkedList<Product> item);

    //public void putProduct(LinkedList<HotDrink> item);

    public Product getProduct();

    public Product getProduct(String name, int price, int temperature, double volume);
    
}