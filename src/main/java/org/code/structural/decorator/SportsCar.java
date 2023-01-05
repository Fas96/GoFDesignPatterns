package org.code.structural.decorator;

public class SportsCar extends CarDecorator{

  private String _transmissionMode;

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving a sports car");
    }

    public void setTransmissionMode(String transmissionMode) {
      this._transmissionMode = transmissionMode;
    }


}
