package carshop.impl;

import carshop.cars.*;
import java.lang.*;
import carshop.interfacce.Admin;
import carshop.interfacce.Customer;

public class MyOwnAutoShop implements Admin, Customer {
    Sedan sedan1 = new Sedan(300000,"Green", 25);
    Ford ford1 = new Ford(500000,"Red", 2010, 50000);
    Ford ford2 = new Ford(700000,"Blue",2010, 50000);
    Truck truck1 = new Truck(460000,"Black",3000);
    Truck truck2 = new Truck(550000,"Brown",1700);
    Car[] cars = new Car[] {sedan1, ford1, ford2, truck1, truck2 } ;

    public void getIncome() {
        double res = 0;
        for(int i = 0; i < cars.length; i++) {
            if (cars[i].isSellOut) {
                res += cars[i].getSalePrice();
            }
        }
        System.out.println(res);
    };

    public void getCarsPrice() {
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getSalePrice());
        }
    };

    public void getCarColors() {
            for(int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].color);
            }
    }

    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    public String getCarColor(int id) {
        return cars[id].color;
    }

    public void purchaseCar(int id) {
        if (cars[id].isSellOut) {
            System.out.println("Машина уже продана");
        }
        else {
            cars[id].isSellOut = true;
        }
    }
}
