package KTBai23;

public abstract class Product {
    //Cau 1 b2
    protected String id;
    protected String name;
    protected double price;
    protected int total;

    public Product () {}

    public Product(String id, String name, double price, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public String toString () {
        return "Id: " + id + "\n" + "Name: " + name + "\n" +"Price: " + price + "\n" + " Total: " + total + "\n";
    }

    public abstract double getTotalPrice ();
}
