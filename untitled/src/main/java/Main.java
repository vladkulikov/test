import model.Color;
import model.Size;

public class Main {
    public static void main(String[] args) {
        System.out.println(new CarManager().generateCar(new Size(1,1), new Color(1,1,1)));
    }
}
