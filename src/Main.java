import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(12,15,100,1,"mm");
        Product p2=new Product(12,15,100,1,"n");
        Product p3=new Product(12,15,100,1,"d");
        ProductLine v = new ProductLine(p1,1,1);
        ProductLine v1 = new ProductLine(p2,1,1);
        ProductLine v2= new ProductLine(p3,1,2);
        ArrayList<ProductLine> line=new ArrayList<>();
        line.add(v);
        line.add(v1);
        line.add(v2);
        Order o = new Order(line,new Customer(),1);
        Order o1 = new Order(line,new Customer(),1);
        System.out.println(o.cost());
        o.submit();
        System.out.println(p2.getAmountInStock());
        System.out.println(o.profit());
        Sys s = new Sys();
        s.addOrder(o);
        s.addOrder(o1);
        System.out.println(s.allProfit());
        System.out.println(p1.getAmountInStock());

    }
}