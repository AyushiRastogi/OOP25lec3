import java.util.Date;

public class eBook extends Book implements Downloadable {
    private int size;

    public eBook(String productName, double productPrice, String ean13, String author, Date publishDate) {
        super(productName, productPrice, ean13, author, publishDate);
    }

    public String getDownloadURL(){
        return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    }

}
