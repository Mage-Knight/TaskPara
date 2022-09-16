import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Car[] listOfCars = createListOfCars();
        //Test
        listOfCars[4].displayCarInformation();
    }

    static Car[] createListOfCars() {
        Car[] listOfCars = new Car[15];
        listOfCars[0] = new Car(1,"Toyota","Corolla",2018,"white",new BigDecimal("35000.00"), 36);
        listOfCars[1] = new Car(2,"Fiat","500L",2015,"red",new BigDecimal("45000.00"), 42);
        listOfCars[2] = new Car(3,"Cadillac","Escalade",2012,"green",new BigDecimal("300000.00"), 8);
        listOfCars[3] = new Car(4,"Chevrolet","Tracker",2008,"green",new BigDecimal("150000.00"), 19);
        listOfCars[4] = new Car(5,"Yamaha","YZF600R",2002,"black",new BigDecimal("90000.00"), 22);
        listOfCars[5] = new Car(6,"Mazda","MX-5",2015,"yellow",new BigDecimal("110000.00"), 89);
        listOfCars[6] = new Car(7,"Lotus","Exige",2008,"blue",new BigDecimal("30000.00"), 76);
        listOfCars[7] = new Car(8,"Audi","A3",2018,"blue",new BigDecimal("180000.00"), 51);
        listOfCars[8] = new Car(9,"Toyota","Corolla",2002,"black",new BigDecimal("25000.00"), 64);
        listOfCars[9] = new Car(10,"Audi","A3",2020,"green",new BigDecimal("200000.00"), 48);
        listOfCars[10] = new Car(11,"Mazda","MX-5",1996,"white",new BigDecimal("90000.00"), 77);
        listOfCars[11] = new Car(12,"Chevrolet","Tracker",2014,"yellow",new BigDecimal("190000.00"), 83);
        listOfCars[12] = new Car(13,"Chevrolet","Spark",2000,"purple",new BigDecimal("40000.00"), 99);
        listOfCars[13] = new Car(14,"Audi","Q3",2016,"gray",new BigDecimal("95000.00"), 105);
        listOfCars[14] = new Car(15,"Chevrolet","Tahoe",2003,"white",new BigDecimal("110000.00"), 11);
        return listOfCars;
    }
}