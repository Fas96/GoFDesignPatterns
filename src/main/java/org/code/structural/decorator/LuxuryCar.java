package org.code.structural.decorator;

public class LuxuryCar extends CarDecorator{

        public LuxuryCar(Car car) {
            super(car);
        }

        @Override
        public void drive() {
            super.drive();
            System.out.println("Driving a luxury car");
        }

}
