package org.code.structural.decorator;

public class DecoratorDemoTest {
    public static void main(String[] args) {

        System.out.println("===========Basic Car===========");
        Car basicCar = new BasicCar();
        basicCar.drive();

        System.out.println("===========Sports Car===========");
        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.drive();
        sportsCar.setTransmissionMode("Manual");




        System.out.println("===========Luxury Car===========");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));

        sportsLuxuryCar.drive();


    }
}
