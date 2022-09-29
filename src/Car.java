import java.math.BigDecimal;
public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private BigDecimal price;
    private int registrationNumber;
    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setId(int id) { this.id = id; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
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
