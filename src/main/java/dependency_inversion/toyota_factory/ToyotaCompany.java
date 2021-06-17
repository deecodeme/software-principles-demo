package dependency_inversion.toyota_factory;

import dependency_inversion.car_assembly.CarCompany;
import dependency_inversion.car_assembly.CarFactory;
import dependency_inversion.error.InvalidArgumentException;

public class ToyotaCompany implements CarCompany {
    @Override
    public CarFactory getCarFactory(String country) throws InvalidArgumentException {
        switch (country) {
            case "east":
                return new ToyotaFactoryEast();
            case "west":
                return new ToyotaFactoryWest();
            default:
                throw new InvalidArgumentException("Not a valid region");
        }
    }
}
