public class Product {
    private double OriginalSalePrice;
    private double salePrice;
    private double amountInStock;
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

    public double getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
