public class Movie extends Product implements Downloadable {
    private String genre;

    public Movie(String productName, double productPrice, String ean13) {
        super(productName, productPrice, ean13);
    }

    public String getDownloadURL(){
        return "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    }
}
