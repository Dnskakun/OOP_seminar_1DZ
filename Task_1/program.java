import java.util.LinkedList;

public class program {

    public static void main(String[] args) {

        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new Water("bonAqua", 50);
        Product hotKey = new Water("hotKey", 60);

        LinkedList<Product> water_list = new LinkedList<>();
        water_list.add(bonAqua);
        water_list.add(hotKey);

        wvm.putProduct(water_list);
        // System.out.println(wvm.getProduct());
        // System.out.println(wvm.getProduct());
        // System.out.println(wvm.getProduct());

        ////////////////////////////////////////////
        
        HotDrinkVendingMachine hdwm = new HotDrinkVendingMachine();

        Product latte = new HotDrink("Латте", 80, 75, 0.5);
        Product espresso = new HotDrink("Эспрессо", 100, 80, 0.3);
        Product hotTea = new HotDrink("Горячий чай", 40, 95, 0.2);
        Product americano = new HotDrink("Американо", 80, 90, 0.2);
        Product capuchino = new HotDrink("Капусино", 90, 90, 0.3);
        Product mokka = new HotDrink("Мокка", 120, 85, 0.5);
        
        LinkedList<Product> hotDrinks_list = new LinkedList<>();
        hotDrinks_list.add(latte);
        hotDrinks_list.add(espresso);
        hotDrinks_list.add(hotTea);
        hotDrinks_list.add(americano);
        hotDrinks_list.add(capuchino);
        hotDrinks_list.add(mokka);

        hdwm.putProduct(hotDrinks_list);
        
        if (hdwm.getProduct("Эспрессо", 100, 80, 0.3) != null) {
            System.out.println(hdwm.getProduct("Эспрессо", 100, 80, 0.3));
        } else {
            System.out.println("Такого напитка нет в наличии!");
        }


    }
}