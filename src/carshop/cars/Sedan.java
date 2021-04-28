package carshop.cars;

public class Sedan extends Car{
    int length;

    public Sedan(double regularPrice, String color, int length) {
        super(regularPrice, color);
        this.length = length;
    }

    public double getSalePrice(){
        if(length > 20){
            return regularPrice * 0.95;
        }
        else {
            return regularPrice;
        }
    };
}