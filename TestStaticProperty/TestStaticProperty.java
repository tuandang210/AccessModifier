package TestStaticProperty;

import accessModifier.TestStaticProperty.Cars;

public class TestStaticProperty {
    public static void main(String[] args) {
        Cars car1 = new Cars("Mercedes", "V12");
        System.out.println(Cars.numberOfCars);
        Cars car2 = new Cars("Bmw", "V10");
        System.out.println(Cars.numberOfCars);
    }
}
