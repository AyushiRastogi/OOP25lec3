public class User {
    private String firstName; // a field; can be changed
    private final String userName; // cannot be changed once initialized
    private String email; // can be changed
    private String password; // can be changed
    private ShoppingCart shoppingCart; // Example of Association aka 'has a' relationship

    // Constructor is a function with the same name as the class that is initiated when a class is instantiated
    public User(String firstName1, String userName, String email, String password) {
        firstName = firstName1;
        this.userName = userName; // this.x is necessary only when we need disambiguation; it is not necessary in firstName
        this.email = email;
        this.password = encryptedPassword(password);
        this.shoppingCart = new ShoppingCart();
    }

    // These are methods
    public String getName()
    {
        return firstName;
    }

    public void setName()
    {
        this.firstName = firstName;
    }

    public String getUsername()
    {
        return userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword()
    {
        this.password = encryptedPassword(password);}

    private String encryptedPassword(String password)
    {
        return(password+"#");
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
