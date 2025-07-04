public interface Purchasble{
    double getPrice();
    void applyDiscount(double percentage);
    boolean isInStoke();
    void updateStoke(int quantity);
}

public interface Reviewable{
    void addReview(String review,int rating);
    double getAverageRating();
    void displayReviews();
    int getTotalReviews();
}

class Product implements Purchasble,Reviewable{
    private String productid;
    private String name;
    private double price;
    private int stockQuantity;
    private ArrayList<String> reviews =new ArrayList<>();
    private ArrayList<Integer> ratings =new ArrayList<>();

    public Product(String productid,String name,double price,int stockQuantity){
        this.productid=productid;
        this.name=name;
        this.price=price;
        this.stockQuantity=stockQuantity;
    }
    
}