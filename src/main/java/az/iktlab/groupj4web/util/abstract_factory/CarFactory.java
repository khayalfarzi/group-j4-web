package az.iktlab.groupj4web.util.abstract_factory;

public class CarFactory extends AbstractFactory {

    @Override
    public Car getCar(String carType) {
        if (carType.equalsIgnoreCase("BMW"))
            return new Bmw();
        else if (carType.equalsIgnoreCase("HYUNDAI"))
            return new Hyundai();
        else if (carType.equalsIgnoreCase("LADA"))
            return new Lada();
        return null;
    }
}
