import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] listOfCars = createListOfCars();
        int selector;
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("______________taskPara____________________");
            System.out.println("0 - stop program");
            System.out.println("1 - list of all cars");
            System.out.println("2 - cars by brand");
            System.out.println("3 - cars by model and usage duration");
            System.out.println("4 - cars by year and price");
            System.out.println("__________________________________________");
            System.out.print("Select item:");
            selector = tryParseInt(myObj.nextLine());
            switch (selector) {
                case 0 -> System.exit(0);

                case 1 -> visualize(listOfCars);

                case 2 -> {
                    System.out.print("Brand:");
                    String brand = myObj.nextLine();
                    ArrayList<Car> selectedCars = outCarsByBrand(listOfCars, brand);
                    visualize(selectedCars);
                }
                case 3 -> {
                    System.out.print("Model:");
                    String model = myObj.nextLine();
                    System.out.print("Used years:");
                    int years = Integer.parseInt(myObj.nextLine());
                    ArrayList<Car> selectedCars = outCarsByModelAndYear(listOfCars, model, years);
                    visualize(selectedCars);
                }
                case 4 -> {
                    System.out.print("Year:");
                    int year = Integer.parseInt(myObj.nextLine());
                    System.out.print("Price more then:");
                    String price = myObj.nextLine();
                    ArrayList<Car> selectedCars = outCarsByYearAndPrice(listOfCars, year, price);
                    visualize(selectedCars);
                }

                default -> System.out.println("Unknown Selection");
            }
        }


    }

    static Car[] createListOfCars() {
        Car[] listOfCars = new Car[15];
        listOfCars[0] = new Car(1, "Toyota", "Corolla", 2018, "white", new BigDecimal("35000.00"), 36);
        listOfCars[1] = new Car(2, "Fiat", "500L", 2015, "red", new BigDecimal("45000.00"), 42);
        listOfCars[2] = new Car(3, "Cadillac", "Escalade", 2012, "green", new BigDecimal("300000.00"), 8);
        listOfCars[3] = new Car(4, "Chevrolet", "Tracker", 2008, "green", new BigDecimal("150000.00"), 19);
        listOfCars[4] = new Car(5, "Yamaha", "YZF600R", 2002, "black", new BigDecimal("90000.00"), 22);
        listOfCars[5] = new Car(6, "Mazda", "MX-5", 2015, "yellow", new BigDecimal("110000.00"), 89);
        listOfCars[6] = new Car(7, "Lotus", "Exige", 2008, "blue", new BigDecimal("30000.00"), 76);
        listOfCars[7] = new Car(8, "Audi", "A3", 2018, "blue", new BigDecimal("180000.00"), 51);
        listOfCars[8] = new Car(9, "Toyota", "Corolla", 2002, "black", new BigDecimal("25000.00"), 64);
        listOfCars[9] = new Car(10, "Audi", "A3", 2020, "green", new BigDecimal("200000.00"), 48);
        listOfCars[10] = new Car(11, "Mazda", "MX-5", 1996, "white", new BigDecimal("90000.00"), 77);
        listOfCars[11] = new Car(12, "Chevrolet", "Tracker", 2014, "yellow", new BigDecimal("190000.00"), 83);
        listOfCars[12] = new Car(13, "Chevrolet", "Spark", 2000, "purple", new BigDecimal("40000.00"), 99);
        listOfCars[13] = new Car(14, "Audi", "Q3", 2016, "gray", new BigDecimal("95000.00"), 105);
        listOfCars[14] = new Car(15, "Chevrolet", "Tahoe", 2003, "white", new BigDecimal("110000.00"), 11);
        return listOfCars;
    }

    static ArrayList<Car> outCarsByBrand(Car[] listOfCars, String brandDesired) {
        ArrayList<Car> targetCars = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getBrand().equals(brandDesired)) {
                targetCars.add(car);
            }
        }
        return targetCars;
    }

    static ArrayList<Car> outCarsByModelAndYear(Car[] listOfCars, String modelDesired, int yearsInput) {
        ArrayList<Car> targetCars = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (Car car : listOfCars) {
            if (car.getModel().equals(modelDesired) && currentYear - car.getYear() > yearsInput) {
                targetCars.add(car);
            }
        }
        return targetCars;
    }

    static ArrayList<Car> outCarsByYearAndPrice(Car[] listOfCars, int yearsInput, String priceInput) {
        ArrayList<Car> targetCars = new ArrayList<>();
        BigDecimal priceInputBigDecimal = new BigDecimal(priceInput);
        for (Car car : listOfCars) {
            if (car.getYear() == yearsInput && car.getPrice().compareTo(priceInputBigDecimal) > 0) {
                targetCars.add(car);
            }
        }
        return targetCars;
    }

    static void visualize(ArrayList<Car> listOfCars) {
        System.out.println("_______________LIST OF CARS____________________");
        for (Car car : listOfCars) {
            car.displayCarInformation();
            System.out.println("__________________________________________");
        }
    }

    static void visualize(Car[] listOfCars) {
        System.out.println("_______________LIST OF CARS___________________");
        for (Car car : listOfCars) {
            car.displayCarInformation();
            System.out.println("__________________________________________");
        }
    }

    static int tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}