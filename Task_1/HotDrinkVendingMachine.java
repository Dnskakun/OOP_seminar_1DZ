import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine{

    private LinkedList<Product> hotDrinks;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotDrinks = item;
    }

    @Override
    public Product getProduct(String name, int price, int temperature, double volume) {
        for (int i = 0; i < hotDrinks.size(); i++) {
            if (hotDrinks.get(i).getName() == name) {
                return hotDrinks.get(i);
            }
        }
        return null;
    }

    @Override
    public Product getProduct() {
        return null;
    }
    
    

}
