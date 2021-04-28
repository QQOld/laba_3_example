package carshop.cars;

public class Truck extends Car {
    int weight;

    public Truck(double regularPrice, String color, int weight) {
        super(regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice(){
        if(weight > 2000){
            return regularPrice * 0.9;
        }
        else{
            return regularPrice;
        }
    };

}
