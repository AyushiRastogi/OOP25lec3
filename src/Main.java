import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User ayushi = new User ("Ayushi", "OOP4CS", "a.rastogi@rug.nl","WBCS028-05");
        Book oop= new Book("Object-Oriented programming in Java", 10.0, "9781571690869", "Stephen Gilbert", new Date(01-01-2005));
        Product design = new eBook("Design Patterns", 60,"0201633612", "Erich Gamma",  new Date(31-10-1994));
        Pot ikea = new Pot("IKEA 365+", 40,"105.779.11", 16,"stainless steel");

        Movie movie = new Movie("The Godfather", 10.0, "tt0068646");

        //Product product = new Product("Object-Oriented programming in Java", 10.0, "9781571690869");

        // list items on the cart
        System.out.println("Welcome " + ayushi.getName()+"!");
        ShoppingCart mycart = ayushi.getShoppingCart();
        mycart.addProduct(oop);
        mycart.addProduct(design);
        mycart.addProduct(ikea);
        mycart.addProduct(movie);

        // Challenge 1: Previously, to retrieve all items listed on a shopping cart we were scrolling through all the items on the list. Now:
        System.out.println("---- Items on your cart-------");
        mycart.listProductsOnCart();
        System.out.println("Total price:" +mycart.getTotalPrice());

        System.out.println("---- Items to be delivered-------");
        mycart.listItemsToBeDelivered();

        System.out.println(oop.getProductPrice());
        System.out.println(design.getProductPrice());
        eBook ebook = (eBook)design;

        System.out.println(ebook.getDownloadURL());
    }
}
