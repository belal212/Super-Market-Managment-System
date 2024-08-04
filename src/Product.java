public class Product {
    private double OriginalSalePrice;
    private double salePrice;
    private int amountInStock;
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(double wholeSalePrice, double salePrice, int amountInStock, int id,String name) {
        this.OriginalSalePrice = wholeSalePrice;
        this.salePrice = salePrice;
        this.amountInStock = amountInStock;
        this.id = id;
        this.name=name;
    }

    public double getOriginalSalePrice() {
        return OriginalSalePrice;
    }

    public void setOriginalSalePrice(double originalSalePrice) {
        this.OriginalSalePrice = originalSalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
