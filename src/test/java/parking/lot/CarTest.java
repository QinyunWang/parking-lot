package parking.lot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car originalCar;

    @BeforeEach
    void setUp() {
        originalCar = new Car(9527);
    }

    @Test
    void should_return_car_id_correctly() {
        Assertions.assertEquals(9527, originalCar.getCarId());
    }

    @Test
    void should_recognize_same_car() {
        Assertions.assertTrue(originalCar.equals(new Car(9527)));
    }
}