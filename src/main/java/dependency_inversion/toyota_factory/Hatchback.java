package dependency_inversion.toyota_factory;

import dependency_inversion.car_assembly.Car;

public class Hatchback implements Car {
    private String engine;

    public Hatchback(String engine) {
        this.engine = engine;
    }

    @Override
    public void move() {

    }

    @Override
    public String showSpecification() {
        return "Car with engine variant: " + engine;
    }
}
