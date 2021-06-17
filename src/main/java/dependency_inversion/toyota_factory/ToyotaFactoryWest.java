package dependency_inversion.toyota_factory;

import dependency_inversion.car_assembly.Car;
import dependency_inversion.car_assembly.CarFactory;

public class ToyotaFactoryWest implements CarFactory {
    @Override
    public Car createCar(String type) {
        return null;
    }
}
