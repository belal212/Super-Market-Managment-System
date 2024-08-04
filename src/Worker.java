public class Worker {
    private String name;
    private int id;
    private double salary;
    private double incentives;
    private double discounts;
    private double finalSalary;

    public Worker(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.incentives = 0;
        this.discounts = 0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIncentives() {
        return incentives;
    }

    public void setIncentives(double incentives) {
        this.incentives = incentives;
    }

    public double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(double discounts) {
        this.discounts = discounts;
    }

    public void calculateFinalSalary() {
        this.finalSalary = salary + incentives - discounts;
    }

    public double getFinalSalary() {
        return finalSalary;
    }
}
