import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User ayushi = new User ("Ayushi", "OOP4CS", "a.rastogi@rug.nl","WBCS028-05");
        Book oop= new Book("Object-Oriented programming in Java", 10.0, "9781571690869", "Stephen Gilbert", new Date(01-01-2005));
        Book design = new Book("Design Patterns", 63,"0201633612", "Erich Gamma",  new Date(31-10-1994));
        Pot ikea = new Pot("IKEA 365+", 44.99,"105.779.11", 16,"stainless steel");

        // list items on the cart
        System.out.println("Welcome " + ayushi.getName()+"!");
        ShoppingCart mycart = ayushi.getShoppingCart();
        mycart.addProduct(oop);
        mycart.addProduct(design);
        mycart.addProduct(ikea);

        // Challenge 1: Previously, to retrieve all items listed on a shopping cart we were scrolling through all the items on the list. Now:
        System.out.println("---- Items on your cart-------");
        mycart.listProductsOnCart();
        System.out.println("Total price:" +mycart.getTotalPrice());
    }
}
