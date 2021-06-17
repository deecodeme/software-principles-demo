package dependency_inversion.car_assembly;

import dependency_inversion.error.InvalidArgumentException;

public class CarCreateApplication {
    private CarCompany carCompany;

    public CarCreateApplication(CarCompany carCompany) {
        this.carCompany = carCompany;
    }

    public Car createCar(String country, String type) throws InvalidArgumentException {
        CarFactory carFactory = this.carCompany.getCarFactory(country);
        return carFactory.createCar(type);
    }
}
