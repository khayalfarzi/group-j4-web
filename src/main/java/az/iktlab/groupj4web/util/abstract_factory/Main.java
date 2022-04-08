package az.iktlab.groupj4web.util.abstract_factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory carFactory = FactoryProducer.getFactory();

        Car bmw = carFactory.getCar("BMW");
        bmw.create();

        Car hyundai = carFactory.getCar("HYUNDAI");
        hyundai.create();

        Car lada = carFactory.getCar("LADA");
        lada.create();
    }
}
