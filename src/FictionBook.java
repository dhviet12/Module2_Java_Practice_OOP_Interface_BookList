public class FictionBook extends Book implements Discount{
    //properties
    private String category;
    private double promotionalPrice;
    //get and set
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }
    // constructor
    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, double price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public double setDiscount(int percent) {
        return promotionalPrice = getPrice() *(1-percent)/100;
    }
}
