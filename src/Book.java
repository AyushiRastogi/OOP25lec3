import java.util.Date;

public class Book extends Product {
    private String author;
    private Date publishDate;

    public Book(String productName, double productPrice, String ean13, String author, Date publishDate) {
        super(productName, productPrice, ean13);
        this.author = author;
        this.publishDate = publishDate;
    }
}