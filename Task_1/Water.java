public class Water extends Product {

    public Water(String name, int price) {
        super.name = name;
        super.price = price;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
    }


    @Override
    public String toString() {
        return "Water{" + "Имя = " + name +
        "; Цена = " + price + "}";
    }

}
