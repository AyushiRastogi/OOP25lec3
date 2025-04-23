import java.util.Date;

public class physicalBook extends Book{
    private int weight;

    public physicalBook(String productName, double productPrice, String ean13, String author, Date publishDate) {
        super(productName, productPrice, ean13, author, publishDate);
    }
}
