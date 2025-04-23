public class Product {
    protected String productName;
    protected double productPrice;
    protected String ean13;

    public Product(String productName, double productPrice, String ean13) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.ean13 = ean13;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getEan13() {
        return ean13;
    }
}


