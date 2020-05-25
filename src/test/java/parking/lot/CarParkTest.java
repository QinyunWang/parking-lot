package parking.lot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class CarParkTest {

    private CarPark carPark;
    private Car car;

    @BeforeEach
    void setUp() {
        carPark = new CarPark("King Car Park", 1000);
        car = mock(Car.class);
    }

    @Test
    void park() {
        Boolean result = carPark.park(car);
        Assertions.assertEquals(true, result);
        Assertions.assertEquals(999, carPark.emptySpots());
    }

    @Test
    void pick() {

    }

    @Test
    void isNotFull() {
    }

    @Test
    void emptySpots() {
    }

    @Test
    void getCapacity() {
    }

    @Test
    void getUsageRate() {
    }

    @Test
    void testToString() {
    }
}