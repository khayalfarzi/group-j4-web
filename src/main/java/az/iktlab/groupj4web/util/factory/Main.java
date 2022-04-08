package az.iktlab.groupj4web.util.factory;

public class Main {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        mercedes.applyBrake();
        mercedes.drive();

        BMW bmw = new BMW();
        bmw.drive();
        bmw.applyBrake();

        Car car = new BMW();
        car.applyBrake();
        car.drive();
    }
}
