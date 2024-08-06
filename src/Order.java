import java.util.ArrayList;
import java.util.Date;

public class Order {
    private ArrayList<ProductLine> line;
    private Customer orderBy;
    private Date date;
    private int id;

    public Order(ArrayList<ProductLine> line, Customer orderBy, int id) {
        this.line = line;
        this.orderBy = orderBy;
//        this.date = date;
        this.id = id;
    }

    public ArrayList<ProductLine> getLine() {
        return line;
    }

    public void setLine(ArrayList<ProductLine> line) {
        this.line = line;
    }

    public Customer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Customer orderBy) {
        this.orderBy = orderBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double cost(){
        double c=0;
        for (ProductLine productLine : this.line) {
            c += productLine.cost();
        }
        return c;
    }

    public double original_prices(){
        double o=0;
        for (ProductLine productLine : this.line) {
            o += productLine.original();
        }
        return o;
    }

    public void addProductLine(ProductLine productLine) {
        this.line.add(productLine);
    }
    public double profit(){
        return cost()-original_prices();
    }
    public void submit(){
        for (ProductLine productLine : this.line) {
            productLine.subFromStock();
        }
    }
}
