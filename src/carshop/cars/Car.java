package carshop.cars;

public abstract class Car {
    int speed;
    public boolean isSellOut;
    public double regularPrice;
    public String color;

    public Car(double regularPrice, String color) {
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public abstract double getSalePrice();
}
