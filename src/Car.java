import java.math.BigDecimal;
public class Car {
    int id;
    String brand;
    String model;
    int year;
    String color;
    BigDecimal price;
    int registrationNumber;
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
        System.out.println("ID: " + this.id + "\nBrand: " + this.brand + "\nModel: " + this.model + "\nYear of issue: " + this.year + "\nColor: " + this.color + "\nPrice: " + this.price + "$\nRegistration number: " + this.registrationNumber);
    }
}
