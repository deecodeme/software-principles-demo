package dependency_inversion;


import dependency_inversion.car_assembly.Car;
import dependency_inversion.car_assembly.CarCompany;
import dependency_inversion.car_assembly.CarCreateApplication;
import dependency_inversion.error.InvalidArgumentException;
import dependency_inversion.toyota_factory.ToyotaCompany;

public class Main {
    public static void main(String[] args) {
        CarCompany toyota = new ToyotaCompany();
        CarCreateApplication carCreateApplication = new CarCreateApplication(toyota);
        Car car;
        try {
            car = carCreateApplication.createCar("east", "sedan");
            System.out.println(car.showSpecification());
        } catch (InvalidArgumentException e) {
            System.out.println("Error while creating car" + e.getLocalizedMessage());
        }
    }
}
