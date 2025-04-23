import java.util.ArrayList;
import java.util.List;

// This is how the new ShoppingCart looks. Refer to lecture 2 code for the previous version
public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {products.remove(product);}
    public List<Product> getProducts() {
        return products;
    }

    // list items on the cart
    public void listProductsOnCart(){
        for (Product product: products){
            System.out.println(product.productName);
        }
    }

    // total price
    public double getTotalPrice(){
        double total = 0;
        for (Product product: products){
            total+=product.productPrice;
        }
        return total;
    }

    // list of items to be delivered
    public void listItemsToBeDelivered(){
        for (Product product: products){
            if (!(product instanceof Downloadable)){
                System.out.println("item: " + product.productName);
            }
        }
    }
}
