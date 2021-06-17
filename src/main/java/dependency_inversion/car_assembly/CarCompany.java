package dependency_inversion.car_assembly;

import dependency_inversion.error.InvalidArgumentException;

public interface CarCompany {
    CarFactory getCarFactory(String country) throws InvalidArgumentException;
}
