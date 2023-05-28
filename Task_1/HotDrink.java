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
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
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
    
    // public int getTemperature() {
    //     return temperature;
    // }

    // public void setTemperature(int temp) {
    //     this.temperature = temp;
    // }
    
    
}