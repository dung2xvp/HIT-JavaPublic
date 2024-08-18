package KTBai23;
//Cau2 b2
public class Mobile extends Product {
    private String manufacturer;
    private String ram;

    public Mobile() {}

    public Mobile(String id, String name, double price, int total, String manufacturer, String ram) {
        super(id, name, price, total);
        this.manufacturer = manufacturer;
        this.ram = ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }

    public String toString() {
        return super.toString() + "Manufacturer: " + manufacturer + "\n" + "Ram: " + ram;
    }
    public void inTT() {
        System.out.printf("%20s %20s %20.1f %20d %20s %20s %20.1f %n", id, name, price, total, manufacturer, ram, getTotalPrice());
    }

    public double getTotalPrice() {
        return super.getPrice() * super.getTotal() + (super.getPrice() * getTotal() * 20 / 100);
    }
}
