import java.math.BigDecimal;
public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private BigDecimal price;
    private int registrationNumber;
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public BigDecimal getPrice() {
        return price;
    }
    Car(int id, String brand, String model, int year, String color, BigDecimal price, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }
    public void displayCarInformation() {
        System.out.println("ID: " + this.id + "\nBrand: "
                + this.brand + "\nModel: " + this.model
                + "\nYear of issue: " + this.year + "\nColor: "
                + this.color + "\nPrice: " + this.price
                + "$\nRegistration number: " + this.registrationNumber);
    }
}
