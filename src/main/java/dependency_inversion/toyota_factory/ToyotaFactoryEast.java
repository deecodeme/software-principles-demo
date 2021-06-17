package dependency_inversion.toyota_factory;

import dependency_inversion.car_assembly.Car;
import dependency_inversion.car_assembly.CarFactory;
import dependency_inversion.error.InvalidArgumentException;

public class ToyotaFactoryEast implements CarFactory {
    private String engineType;

    public ToyotaFactoryEast() {
        this.engineType = "EAST_VARIANT";
    }

    @Override
    public Car createCar(String type) throws InvalidArgumentException {
        switch (type) {
            case "sedan":
                return new Sedan(this.engineType);
            case "hatchback":
                return new Hatchback(this.engineType);
            default:
                throw new InvalidArgumentException("Not a valid Car type");
        }
    }
}
