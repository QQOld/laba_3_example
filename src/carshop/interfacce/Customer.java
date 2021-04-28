package carshop.interfacce;

import java.awt.*;

public interface Customer {
    void getCarsPrice();
    void getCarColors();
    double getCarPrice(int id);
    String getCarColor(int id);
    void purchaseCar(int id);
}
