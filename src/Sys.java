import java.util.ArrayList;
import java.util.Date;

public class Sys {
    private ArrayList<Product> products ;
    private ArrayList<Order> orders;
    private ArrayList<Customer> customer;
    private ArrayList<Worker> workers;
    private double profits;
    private double losses;

    public Sys() {

    }
    public void addOrder(Order o){
        if (this.orders != null){
        this.orders.add(o);}
    }

    public void addProductName(Product product) {
        if (products == null) {
            System.out.println("Product list is not initialized.");
        }

        int productIndex = binarySearchProductByName(products, product.getName());

        if (productIndex == -1) {
            products.add(product);
        } else {
            Product existingProduct = products.get(productIndex);
            int newAmount = existingProduct.getAmountInStock() + product.getAmountInStock();
            existingProduct.setAmountInStock(newAmount);
        }
    }
    public void addProductID(Product product) {
        if (products == null) {
            System.out.println("Product list is not initialized.");
        }

        int productIndex = binarySearchProductByID(products, product.getId());

        if (productIndex == -1) {
            products.add(product);
        } else {
            Product existingProduct = products.get(productIndex);
            int newAmount = existingProduct.getAmountInStock() + product.getAmountInStock();
            existingProduct.setAmountInStock(newAmount);
        }
    }

    public  int binarySearchProductByName(ArrayList<Product> products, String key) {
        if (products.getFirst()==null){
            return -1;
        }
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products.get(mid);
            int cmp = midProduct.getName().compareTo(key);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // key not found
    }

    public  int binarySearchProductByID(ArrayList<Product> products, int key) {
        if (products == null){
            return -1;
        }
        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products.get(mid);


            if (midProduct.getId() == 0) {
                return mid;
            } else if (midProduct.getId() < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // key not found
    }

    public  int binarySearchOrderByID(ArrayList<Order> orders, int key) {
        if (orders == null){
            return -1;
        }
        int left = 0;
        int right = orders.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Order midOrder = orders.get(mid);


            if (midOrder.getId() == 0) {
                return mid;
            } else if (midOrder.getId() < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // key not found
    }
    public  int binarySearchOrderByDate(ArrayList<Order> orders, Date key) {
        if (orders == null){
            return -1;
        }
        int left = 0;
        int right = orders.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Order midOrder = orders.get(mid);
            int cmp = midOrder.getDate().compareTo(key);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public void updateProductByName(String name, double salePrice, double originalPrice) {
        int productIndex = binarySearchProductByName(this.products, name);

        if (productIndex == -1) {
            System.out.println("Product not found");
            return;
        }


        Product product = this.products.get(productIndex);
        boolean isUpdated = false;


        if (salePrice > 0) {
            product.setSalePrice(salePrice);
            isUpdated = true;
        } else if (salePrice <= 0) {
            System.out.println("Sale price cannot be zero or negative.");
        }


        if (originalPrice > 0) {
            product.setOriginalSalePrice(originalPrice);
            isUpdated = true;
        } else if (originalPrice <= 0) {
            System.out.println("Original price cannot be zero or negative.");
        }

        if (isUpdated) {
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("No valid updates were made.");
        }
    }


    public void updateOrder(int id, int amount, int line){
        int orderIndex = binarySearchOrderByID(this.orders,id);
        if (orderIndex==-1){
            System.out.println("order not found");
        }
        else if (amount <= 0){
            this.orders.get(orderIndex).getLine().remove(line);
        }
        else {
            this.orders.get(orderIndex).getLine().get(line).setNoOfUnit(amount);
        }

    }

    public void deleteProduct(String name){
        int productIndex = binarySearchProductByName(this.products,name);
        if (productIndex==-1){
            System.out.println("this product is not found");
        }
        else {
            String ProductName = this.products.get(productIndex).getName();
            this.products.remove(productIndex);
            System.out.println(ProductName + "has been deleted");

        }
    }

    public void deleteOrder(int id){
        int orderIndex = binarySearchOrderByID(this.orders,id);
        if (orderIndex==-1){
            System.out.println("this order is not found");
        }
        else {
            this.orders.remove(orderIndex);
            System.out.println("this order has been deleted");
        }
    }



    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public double getProfits() {
        return profits;
    }

    public void setProfits(double profits) {
        this.profits = profits;
    }

    public double getLosses() {
        return losses;
    }

    public void setLosses(double losses) {
        this.losses = losses;
    }

    public double allProfit(){
        double p =0;
        if (!(this.products ==null)){

        for (Order o:this.getOrders()){
            p+=o.profit();
        }
        }
        return p;

    }

}