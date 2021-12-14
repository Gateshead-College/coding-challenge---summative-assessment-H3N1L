public class Items {
    int productID;
    String manufacturer;
    String productName;
    float price;
    int stock;


    public Items(int productID, String manufacturer, String productName, float price, int stock) {
        this.productID = productID;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void updatestock(int stock) {
        this.stock = stock;
    }
}
