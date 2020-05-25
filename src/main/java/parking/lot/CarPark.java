package parking.lot;

import java.util.HashSet;
import java.util.Optional;

public class CarPark {
    private String name;
    private HashSet<Car> spots;
    private int capacity;

    public CarPark(String name, int capacity) {
        this.name = name;
        this.spots = new HashSet<>();
        this.capacity = capacity;
    }

    public boolean park(Car car) {
        if (isNotFull()) {
            spots.add(car);
            return true;
        }
        return false;
    }

    public Optional<Car> pick(int carId) {
        Car targetCar = new Car(carId);
        if (spots.remove(targetCar)) {
            return Optional.of(targetCar);
        }
        return Optional.ofNullable(null);
    }

    public boolean isNotFull() {
        return capacity > spots.size();
    }

    public int emptySpots() {
        return capacity - spots.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public double getUsageRate() {
        return (double) spots.size() / capacity;
    }

    @Override
    public String toString() {
        return String.format("Car park name: %s\n" +
                "Total parking spaces: %s\n" +
                "Number of empty spaces: %s\n" +
                "Usage rate: %s", this.name, this.capacity, this.emptySpots(), this.getUsageRate());
    }
}
