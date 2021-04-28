package carshop.cars;

public class Ford extends Car{
    int year;
    int manufacturerDiscount;

    public Ford(double regularPrice, String color, int year, int manufacturerDiscount) {
        super(regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice(){
        return regularPrice - manufacturerDiscount;
    };

}
