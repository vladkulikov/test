import model.Car;
import model.Color;
import model.Size;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;


public class CarManagerTest {
    @Test
    public void generateCar() {
        CarManager carManager = new CarManager();

        Car car =  carManager.generateCar(new Size(1,1), new Color(1,1,1));
        Car car1 = carManager.generateCar(new Size(1,2), new Color(3,4,5));

        assertNotEquals(car, car1);
    }
}