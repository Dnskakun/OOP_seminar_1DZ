public class HotDrink extends Product {

    private int temperature;
    private double volume;

    public HotDrink(String name, int price, int temperature, double volume) {
        super.name = name;
        super.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" + "Имя = " + name +
        "; Цена = " + price + "; Температура = " + temperature + "; Объем = " + volume + "}";
    }

    public int getTemperature() {
        return this.temperature;
    }

    public double getVolume() {
        return this.volume;
    }
    
}