package model;

import java.util.Objects;

public class Car {
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(Size size, Color color) {
        this.size = size;
        this.color = color;
    }

    Size size;
    Color color;

    @Override
    public String toString() {
        return "Car{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return size.equals(car.size) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }
}