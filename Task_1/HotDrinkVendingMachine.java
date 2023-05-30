import java.util.LinkedList;

public class HotDrinkVendingMachine implements VendingMachine{

    private LinkedList<HotDrink> hotDrinks;

    public void putProduct(LinkedList<HotDrink> item) {
        this.hotDrinks = item;
    }

    public Product getProduct(String name, int price, int temperature, double volume) {
        for (int i = 0; i < hotDrinks.size(); i++) {
            if (hotDrinks.get(i).getName() == name && hotDrinks.get(i).getTemperature() == temperature && hotDrinks.get(i).getVolume() == volume) {
                return hotDrinks.get(i);
            }
        }
        return null;
    }

    @Override
    public void putProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putProduct'");
    }

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }

}
