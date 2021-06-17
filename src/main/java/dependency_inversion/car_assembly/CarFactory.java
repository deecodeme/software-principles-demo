package dependency_inversion.car_assembly;

import dependency_inversion.error.InvalidArgumentException;

public interface CarFactory {
    Car createCar(String type) throws InvalidArgumentException;
}

