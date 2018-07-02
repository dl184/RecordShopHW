package Accessories;

import Interfaces.ISell;

public class DrumSticks extends Accessory implements ISell {

    public DrumSticks(String manufacturer, String type, double buyPrice, double sellPrice) {
        super(manufacturer, type, buyPrice, sellPrice);
    }

    public double markUp(){
        return 10.00;
    }


}
