package carshop;

import carshop.impl.MyOwnAutoShop;

public class Main {

    public static void main(String[] args) {
        MyOwnAutoShop shop = new MyOwnAutoShop();
        shop.getCarsPrice();
        shop.getCarColors();
        shop.getCarPrice(1);
        shop.getCarColor(2);
        shop.getIncome();
        shop.purchaseCar(0);
        shop.purchaseCar(4);
        shop.getIncome();

    }
}
