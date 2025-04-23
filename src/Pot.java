public class Pot extends Product {
    private final int capacity;
    private final String material;

    public Pot(String productName, double price, String ean13, int capacity, String material){
        super(productName, price, ean13);
        this.capacity = capacity;
        this.material = material;
    }

    public int getCapacity(){
        return capacity;
    }
    public String getMaterial(){
        return material;
    }
}