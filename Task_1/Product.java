public abstract class Product {

    protected String name;
    protected int price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product [Имя =" + name + ", Цена =" + price + "]";
    }



    





}
