public class Water extends Product {

    public Water(String name, int price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "Water{" + "Имя = " + name +
        "; Цена = " + price + "}";
    }

}
