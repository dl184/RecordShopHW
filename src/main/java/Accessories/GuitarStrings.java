package Accessories;

import Interfaces.ISell;

public class GuitarStrings extends Accessory implements ISell {

    public GuitarStrings(String manufacturer, String type, double buyPrice, double sellPrice) {
        super(manufacturer, type, buyPrice, sellPrice);
    }

    public double markUp(){
        return 20.00;
    }

}

