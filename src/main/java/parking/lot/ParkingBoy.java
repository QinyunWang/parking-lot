package parking.lot;

import java.util.Comparator;
import java.util.List;

public class ParkingBoy {
    private String name;
    private List<CarPark> carParks;

    public boolean parkToFirstNonEmptyLot(Car car) {
        return carParks.stream().filter(CarPark::isNotFull).findFirst().get().park(car);
    }

    public boolean parkToHighestEmptySpaceLot(Car car) {
        carParks.sort(Comparator.comparingInt(CarPark::emptySpots));
        return carParks.get(carParks.size()-1).park(car);
    }

    public boolean parkToHighestEmptyRateLot(Car car) {
        carParks.sort(Comparator.comparingDouble(CarPark::getUsageRate));
        return carParks.get(0).park(car);
    }
}
