import java.util.ArrayList;

public class ProductLine {
   private Product product;
   private int id;
   private int noOfUnit;

    public ProductLine(Product product, int id, int noOfUnit) {
        this.product = product;
        this.id = id;
        this.noOfUnit = noOfUnit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfUnit() {
        return noOfUnit;
    }

    public void setNoOfUnit(int noOfUnit) {
        this.noOfUnit = noOfUnit;
    }

    public double cost(){
        return this.product.getSalePrice()* this.noOfUnit;
    }
    public double original(){
        return this.product.getOriginalSalePrice()* this.noOfUnit;
    }
    public void subFromStock(){
        this.product.setAmountInStock(this.product.getAmountInStock()-this.noOfUnit);
    }

}
