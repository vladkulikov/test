import model.Car;
import model.Color;
import model.Size;

public class CarManager {
    public Car generateCar(Size size, Color color) {
        return new Car(
                size,
                color
        );
    }
}
