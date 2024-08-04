import java.util.ArrayList;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Order> orders;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer(String name, String phoneNumber, ArrayList<Order> orders, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
        this.id = id;
    }
    public Customer(){}
    public void addOrder(Order order) {
        this.orders.add(order);
    }
}
